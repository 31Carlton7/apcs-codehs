Pizza.java:
----------
public class Pizza
{
    private String type;
    private String toppings;
    private int size;
    
    public Pizza(String pType, String pToppings, int pSize) {
       type = pType;
       toppings = pToppings;
       size = pSize;
    }
    
    
    
    // You don't need to do anything with this method
    // Used to print the object
    public String toString()
    {
        return size + " inch " + type + " pizza with " + toppings;
    }
}


PizzaTester.java:
----------------
public class PizzaTester 
{
    public static void main(String[] args)
    {
        Pizza carltonspizza = new Pizza("Onions", "Beef", 15);
        Pizza jamespizza = new Pizza("Cheese", "Cheese", 22);
        Pizza mrvanderlindenspizza = new Pizza("Meat", "Pepperoni", 12);
        
        System.out.println(carltonspizza);
        System.out.println(jamespizza);
        System.out.println(mrvanderlindenspizza);
    }
}
