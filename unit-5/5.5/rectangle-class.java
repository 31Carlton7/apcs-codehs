RectangleTester.java:
--------------------
public class RectangleTester
{
    public static void main(String[] args)
    {
        // Make some objects and print out their
        // areas and perimeters
        
        Rectangle one = new Rectangle(10, 20);
        Rectangle two = new Rectangle(7, 31);
        
        one.printArea();
        two.printPerimeter();
    }
}


Rectangle.java:
--------------
public class Rectangle
{
    private int width;
    private int height;
    
    /**
     * This is the constructor to create a Rectangle.
     * To create a Rectangle we need to know its width
     * and height.
     */
    public Rectangle(int rectWidth, int rectHeight)
    {
        width = rectWidth;
        height = rectHeight;
    }
    

    // Put your methods here
    public int getHeight()
    {
        return this.height;
    }
    
    public int setHeight(int height)
    {
        return this.height = height;
    }
    
    public int getWidth()
    {
        return this.width;
    }
    
    public int setWidth(int width)
    {
        return this.width = width;
    }
    
    public int getArea()
    {
        return width * height;
    }
    
    public int getPerimeter()
    {
        return (width * 2) + (height * 2);
    }


    /**
     * This method computes and prints the
     * area of the Rectangle.
     * Note it will print the area of the
     * Rectangle object that called it using
     * the dot operator!
     */ 
    public void printArea()
    {
        int area = width * height;
        System.out.println(area);
    }
    
    /**
     * This method computes and prints the
     * perimeter of the Rectangle.
     */ 
    public void printPerimeter()
    {
        int perimeter = 2 * width + 2 * height;
        System.out.println(perimeter);
    }
    
    /**
     * This is the toString method. It returns a String
     * representation of the object. 
     */
    public String toString()
    {
        return "Rectangle width: " + width + ", Rectangle height: " + height;
    }
}
