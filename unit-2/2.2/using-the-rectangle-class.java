RectangleTester.java:
--------------------
public class RectangleTester 
{
    public static void main(String[] args)
    {
        Rectangle rect = new Rectangle(5,12);
        System.out.println(rect);
    }
}

Rectangle.java:
--------------
public class Rectangle
{
    // Attributes
    private int width;
    private int height;
    
    // Constructor
    public Rectangle(int rectWidth, int rectHeight)
    {
        width = rectWidth;
        height = rectHeight;
    }
    
    
    // This method lets us print out the object
    // to see the values of the instance variables
    public String toString()
    {
        return "Rectangle with width: " + width + " and height: " + height;
    }
}
