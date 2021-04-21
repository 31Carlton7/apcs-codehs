MyProgram.java:
--------------
public class MyProgram
{
    public static void main(String[] args)
    {
        // HOW TO USE:
        
        // Using the constructor and typing in 2 numbers,
        // Will give you, an equal shape.
        // The first # is the length, and the second is the number of sides,
        // The shape should have which changes the shape. This can only go to,
        // 5.
        
        // Using the constructor and typing in 3 numbers will give you a
        // triangle. If the lengths are equal you get an equilateral triangle.
        // The rest are self explanatory, they are all just sides lengths.
        
        // Using the constructor and typing in 4 numbers will give you a
        // rectangle. The lengths are up for you to decide.
        
        // Using the constructor and typing in 5 numbers will give you a
        // pentagon and the lengths are for you to decide.
        
        Side mySquare = new Side(5, 5, 15, 5, 5);
        
        System.out.println(mySquare);
    }
}

Side.java:
---------
public class Side
{
    private String shape, nSides;
    private int sl1, sl2, sl3, sl4, sl5;
    private int sides;
    private boolean areEqual;
    
    public Side(int asl1, int aSides)
    {
        sl1 = asl1;
        sl2 = asl1;
        sl3 = asl1;
        sl4 = asl1;
        sl5 = asl1;
        sides = aSides;
        if(sides == 4)
        {
            shape = "square";
        }
        
        if(sides == 3)
        {
            shape = "equilateral triangle";
        }
        
        if(sides == 5)
        {
            shape = "regular pentagon";
        }
    }
    
    public Side(int asl1, int asl2, int asl3)
    {
        sl1 = asl1;
        sl2 = asl2;
        sl3 = asl3;
        sides = 3;
        if(sl1 != sl2 && sl1 != sl3 && sl2 != sl3)
        {
            shape = "scalene triangle";
        } 
        
        if(sl1 == sl2 && sl1 != sl3){
            shape = "isosceles triangle";
        } 
        
        if(sl1 == sl2 && sl1 == sl3) 
        {
            shape = "equilateral triangle";
        }
    }
    
    public Side(int asl1, int asl2, int asl3, int asl4)
    {
        sl1 = asl1;
        sl2 = asl2;
        sl3 = asl3;
        sl4 = asl4;
        sides = 4;
        if(sl1 == sl2 && sl3 == sl4 && sl1 != sl3)
        {
            shape = "rectangle";
        }
        if(sl1 == sl2 && sl1 == sl3 && sl1 == sl4)
        {
            shape = "square";
        }
    }
    
    public Side(int asl1, int asl2, int asl3, int asl4, int asl5)
    {
        sl1 = asl1;
        sl2 = asl2;
        sl3 = asl3; 
        sl4 = asl4;
        sl5 = asl5;
        sides = 5;
        if(sl1 != sl2 || sl1 != sl3 || sl1 != sl4 || sl1 != sl5)
        {
            shape = "pentagon";
        }
        if(sl1 == sl2 && sl1 == sl3 && sl1 == sl4 && sl1 == sl5)
        {
            shape = "regular pentagon";
        }
    }
    
    
    public String toString() {
        if(sides == 3)
        {
            nSides = sl1 + ", " + sl2 + ", " + sl3;
            return "It's a(n) " + shape + " with side lengths of " + nSides;
        }
        
        if(sides == 4)
        {
            nSides = sl1 + ", " + sl2 + ", " + sl3 + ", " + sl4;
        }
        
        if(sides == 5)
        {
            nSides = sl1 + ", " + sl2 + ", " + sl3 + ", " + sl4 + ", " + sl5;
        }
        return "It's a(n) " + shape + " with side lengths of " + nSides;
    }
}


