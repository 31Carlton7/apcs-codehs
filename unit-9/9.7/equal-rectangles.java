Rectangle.java:
--------------
public class Rectangle
{
    private int width;
    private int height;
    
    public Rectangle(int width, int height)
    {
        this.width = width;
        this.height = height;
    }
    public boolean equals(Rectangle other)
    {
        return toString().equals(other.toString());
    }
    public String toString()
    {
        return "A rectangle with a width of " + width + " and a height of " + height;
    }
}

RectangleTester.java:
--------------------
public class RectangleTester
{
    public static void main(String[] args)
    {
        Rectangle rect1 = new Rectangle(5, 4);
        Rectangle rect2 = new Rectangle(5, 4);
        Rectangle rect3 = new Rectangle(10, 4);
        
        // Print all three rectangles
        System.out.println(rect1);
        System.out.println(rect2);
        System.out.println(rect3);
        
        // Print one true statement comparing rectangles
        System.out.println(rect1.equals(rect3));
        // Print one false statment comparing rectangles
        System.out.println(rect1.equals(rect2));
    }
}
