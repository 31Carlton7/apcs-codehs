RectangleTester.java:
--------------------
public class RectangleTester
{
    public static void main(String[] args)
    {
        // Fix this code so there are no more
        // null pointer exceptions
        Rectangle brick = new Rectangle(1,1);
        Rectangle fencePost = new Rectangle(1,3);
        
        System.out.println(brick);
        System.out.println(fencePost);
        
        // Change the fencePost dimensions
        fencePost = new Rectangle(1, 5);
        System.out.println(fencePost);
        
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
    // Copies the values of rectWidth and rectHeight
    // into width and height, respectively
    public Rectangle(int rectWidth, int rectHeight)
    {
        width = rectWidth;
        height = rectHeight;
    }

    // Constructor
    // Allows user to construct a square
    // Copies the value of sidelength
    // into both width and height
    public Rectangle(int sidelength)
    {
        width = sidelength;
        height = sidelength;
    }
    
    
    // This method lets us print out the object
    // to see the values of the instance variables
    public String toString()
    {
        return "Rectangle with width: " + width + " and height: " + height;
    }
}


