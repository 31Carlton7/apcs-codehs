Clothing.java:
-------------
public class Clothing
{
    // Your code here
    public String size, color;
    
    public Clothing(String size, String color)
    {
        this.size = size;
        this.color = color;
    }
    
    public String getSize()
    {
        return size;
    }
    
    public String getColor()
    {
        return color;
    }
}


ClothingTester.java:
-------------------
public class ClothingTester
{
    public static void main(String[] args)
    {
        // Start here!
        TShirt myTShirt = new TShirt("Large", "White", "Polyester");
        Sweatshirt mySweatshirt = new Sweatshirt("Large", "Black", true);
        Jeans myJeans = new Jeans("Large");
        Jeans myJeansTwo = new Jeans("Medium");
        
        System.out.println(myTShirt);
        System.out.println(mySweatshirt);
        System.out.println(myJeans);
        System.out.println(myJeansTwo);
    }
}

Sweatshirt.java:
---------------
public class Sweatshirt extends Clothing
{
    private boolean hasHood;
    
    public Sweatshirt(String size, String color, boolean hasHood)
    {
        super(size, color);
        this.hasHood = hasHood;
    }
    
    public boolean hasHood()
    {
        return hasHood;
    }
}


TShirt.java:
-----------
public class TShirt extends Clothing
{
    private String fabric;
    
    public TShirt(String size, String color, String fabric)
    {
        super(size, color);
        this.fabric = fabric;
    }
    
    public String getFabric()
    {
        return fabric;
    }
}


Jeans.java:
----------
public class Jeans extends Clothing
{
    public Jeans(String size)
    {
        super(size, "blue");
    }
}

