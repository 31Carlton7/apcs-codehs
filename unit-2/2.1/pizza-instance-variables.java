PizzaTester.java:
----------------
public class PizzaTester
{
    public static void main(String[] args)
    {
        System.out.println("You should be able to run this");
        System.out.println("if you added the instance variables correctly");
        
        Pizza pz = new Pizza(8, 1, "Beef", "Medium", 12.75);
        
        System.out.println(pz);
    }
}


Pizza.java:
----------
public class Pizza
{
    int numberOfSlices;
    int numberOfToppings;
    String toppings;
    String size;
    double price;
    
    public Pizza (int numberOfSlices, int numberOfToppings, String toppings, String size, double price){
        
        this.numberOfSlices = numberOfSlices;
        this.numberOfToppings = numberOfToppings;
        this.toppings = toppings;
        this.size = size;
        this.price = price;
    }
    
    
    public String toString() 
    {
        return "Here are the specifications for your pizza: \nNumber of slices: " + numberOfSlices +
        "\nNumber of toppings: " + numberOfToppings +
        "\nTopping type(s): " + toppings +
        "\nSize: " + size +
        "\nPrice: " + price;
    }
    
}
