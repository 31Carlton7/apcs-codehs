TestEquals.java:
---------------
public class TestEquals
{
    public static void main(String[] args)
    {
        System.out.println("** Object **");
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = obj1;
        
        // Print out all three objects
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        
        // Print a true statement using 2 objects and ==
        System.out.println(obj1 == obj3);
        
        // Print a false statement using 2 objects and ==
        System.out.println(obj1 == obj2);
        
        // Print a true statement using 2 objects and .equals()
        System.out.println(obj1.equals(obj3));
        
        // Print a false statement using 2 objects and .equals()
        System.out.println(obj1.equals(obj2));
        
        System.out.println("** Ball **");
        
        Ball ball1 = new Ball("Red");
        Ball ball2 = new Ball("Red");
        Ball ball3 = ball1;
        
        // Print out all three objects
        System.out.println(ball1);
        System.out.println(ball2);
        System.out.println(ball3);
        
        // Print a true statement using 2 objects and ==
        System.out.println(ball1 == ball3);
        
        // Print a false statement using 2 objects and ==
        System.out.println(ball1 == ball2);
        
        // Print a true statement using 2 objects and .equals()
        System.out.println(ball1.equals(ball3));
        
        // Print a false statement using 2 objects and .equals()
        System.out.println(ball1.equals(ball2));
        
    }
}


Ball.java:
---------
public class Ball
{
    private String color;
    
    public Ball(String color)
    {
        this.color = color;
    }
    public String getColor()
    {
        return color;
    }
    public boolean equals(Ball other)
    {
        return color.equals(other.getColor());
    }
    public String toString()
    {
        return "Color: " + color;
    }
}
