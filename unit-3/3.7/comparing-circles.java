CircleTester.java:
-----------------
public class CircleTester 
{
    public static void main(String[] args)
    {
        Circle one = new Circle(10, "blue", 50, 35);
        Circle two = new Circle(10, "blue", 50, 35);
        Circle three = new Circle(20, "red", 0, 0);
        Circle four = three;
        
        // Modify this program to correctly compare objects
        // We should not be comparing objects using ==
        
        if(one.equals(two))
        {
            System.out.println("Circles one and two are equal!");
            System.out.println(one);
            System.out.println(two);
        }
        
        if(three == four)
        {
            System.out.println("Circles three and four are equal!");
            System.out.println(three);
            System.out.println(four);
        }
    }
}


Circle.java:
-----------
public class Circle
{
    private int radius;
    private String color;
    private int x;
    private int y;
    
    public Circle(int theRadius, String theColor, int xPosition, int yPosition)
    {
        radius = theRadius;
        color = theColor;
        x = xPosition;
        y = yPosition;
    }
    
    public int getRadius()
    {
        return radius;
    }
    
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public String getColor()
    {
        return color;
    }
    
    // Implement a toString method and an equals method here!
    public String toString()
    {
        // Change this!
        return color + " circle with a radius of " + radius + " at position (" + x + ", " + y + ")";
    }
    
    public boolean equals(Circle other)
    {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Circle)) {
            return false;
        }
        Circle cir = (Circle) other;
        return color.equals(cir.color) && radius == cir.radius && x == cir.x && y == cir.y;
    }
}

