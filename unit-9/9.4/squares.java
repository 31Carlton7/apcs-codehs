SquareTester.java:
-----------------
public class SquareTester
{
    public static void main(String[] args)
    {
        Square sq = new Square(3.0);
        System.out.println(sq);
        sq.setSideLength(4.0);
        System.out.println(sq);
    }
}


Rectangle.java:
--------------
public class Rectangle
{
    private double width;
    private double height;
    
    public Rectangle(double w, double h)
    {
        width = w;
        height = h;
    }
    public double getWidth()
    {
        return width;
    }
    public void setWidth(double w)
    {
        width = w;
    }
    public double getHeight()
    {
        return height;
    }
    public void setHeight(double h)
    {
        height = h;
    }
    public String toString()
    {
        return "Rectangle with width " + width + " and height " + height;
    }
}

Square.java:
-----------
public class Square extends Rectangle
{
    // Call to the Rectangle constructor
    public Square(double sideLength)
    {
        super(sideLength, sideLength);
    }
    // Return either the width or height from the superclass
    public double getSideLength()
    {
        return super.getHeight();
    }
    //Set both the width and height in the superclass
    public void setSideLength(double sideLength)
    {
        super.setHeight(sideLength);
        super.setWidth(sideLength);
    }
    // Get the width and/or the height from the superclass
    public double area()
    {
        return super.getHeight() * super.getWidth();
    }
    // Override to read: Square with side lengths ______
    public String toString()
    {
        return "Square with side lengths " + super.getHeight();
    }
}
