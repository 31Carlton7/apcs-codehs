ReviewCollector.java:
--------------------
import java.util.ArrayList; // import the ArrayList class

public class ReviewCollector
{
    private ArrayList<ProductReview> reviewList;
    private ArrayList<String> productList;
    
    /** Constructs a ReviewCollector object and initializes the instance variables. */
    
    public ReviewCollector()
    {
        reviewList = new ArrayList<ProductReview>();
        productList = new ArrayList<String>();
    } 
    
    /** Adds a new review to the collection of reviews, as described in part (a). */

    public void addReview(ProductReview prodReview)
    {
        /* to be implemented in part (a) */
        reviewList.add(prodReview);
        String tbaProdName = prodReview.getName();
        boolean productPresent = false;
        for(int i = 0; i< productList.size(); i++) 
        {
            if(tbaProdName.equals(productList.get(i))) 
            {
                productPresent = true;
                return;
            }
        }
        
        if(!productPresent) 
        {
            productList.add(tbaProdName);
        }
        
    }
    
      /** Returns the number of good reviews for a given product name, as described in part (b). */
    
    public int getNumGoodReviews(String prodName)
    { 
        /* to be implemented in part (b) */
        int nBestRev = 0;
        for(int i = 0; i<reviewList.size(); i++)
        {
            if(prodName.equals(reviewList.get(i).getName()))
            {
                if(reviewList.get(i).getReview().indexOf("best")!=-1)
                {
                    nBestRev++;
                }
            }
        }
        return nBestRev;
    }
      // There may be instance variables, constructors, and methods not shown.
}
    


ProductReview.java:
------------------
public class ProductReview
{

    private String name;
    private String review;
    
    /** Constructs a ProductReview object and initializes the instance variables. */
    public ProductReview(String pName, String pReview)
    {
        name = pName;
        review = pReview;
    }
    
    /** Returns the name of the product. */
    public String getName()
    { 
        return name; 
    }
    
    /** Returns the review of the product. */
    public String getReview()
    {
        return review;
    }
}


MyProgram.java:
--------------
public class MyProgram
{
    public static void main(String[] args)
    {
       ProductReview candy = new ProductReview("Skittles", "best");
       ProductReview candy1 = new ProductReview("Skittles", "best");
       ProductReview candy2 = new ProductReview("Skittles", "best");
       ProductReview fruit = new ProductReview("Apple", "best");
       ProductReview fruit1 = new ProductReview("Apple", "best");
       ProductReview fruit2 = new ProductReview("Apple", "okay");
       ProductReview vegetable = new ProductReview("Broccoli", "okay");
       ProductReview vegetable1 = new ProductReview("Broccoli", "okay");
       ProductReview vegetable2 = new ProductReview("Broccoli", "okay");
       System.out.println(candy.getName());
       System.out.println(candy.getReview());
       System.out.println(fruit.getName());
       System.out.println(fruit.getReview());
       System.out.println(vegetable.getName());
       System.out.println(vegetable.getReview());
       ReviewCollector foods = new ReviewCollector();
       foods.addReview(candy);
       foods.addReview(fruit);
       foods.addReview(vegetable);
       foods.addReview(candy1);
       foods.addReview(fruit1);
       foods.addReview(vegetable1);
       foods.addReview(candy2);
       foods.addReview(fruit2);
       foods.addReview(vegetable2);
       int goodreviews = foods.getNumGoodReviews("Skittles");
       int goodreviews1 = foods.getNumGoodReviews("Apple");
       int goodreviews2 = foods.getNumGoodReviews("Broccoli");
       System.out.println(goodreviews);
       System.out.println(goodreviews1);
       System.out.println(goodreviews2);
    }
}
