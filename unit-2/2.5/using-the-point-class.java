Point.java:
----------
public class Point
{
    private int x;
    private int y;
    
    public Point(int xCoord, int yCoord)
    {
        x = xCoord;
        y = yCoord;
    }
    
    public void move(int dx, int dy)
    {
        x += dx;
        y += dy;
    }
    
    public String toString()
    {
        return x + ", " + y;
    }
}


PointTester.java:
----------------
public class PointTester
{
    public static void main(String[] args)
    {
        Point p = new Point(10, 5);
        System.out.println(p);
        p.move(3, 4);
        
        System.out.println(p);
        
        // Make a new point here at position (2, 4)
        
        Point p2 = new Point(2, 4);
        
        // Then print it out
        
        System.out.println(p2);
        
        // Move the point 5 units in the x direction and
        // 2 units in the y direction
        
        p2.move(5, 2);
        
        // Print out the point again to see that it moved
        
        System.out.println(p2);

    }
}

