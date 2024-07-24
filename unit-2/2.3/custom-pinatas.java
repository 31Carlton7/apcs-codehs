Pinata.java:
-----------
public class Pinata
{
    // Instance variables
    private String candy;    // what kind of candy is inside
    private String color;    
    private String shape;
    
    // Constructor without parameters
    public Pinata()
    {
        candy = "hard candy";
        color = "rainbow";
        shape = "donkey";
    }
    
    public Pinata(String uCandy, String uColor, String uShape)
    {
        candy = uCandy;
        color = uColor;
        shape = uShape;
    }
    
    
    public Pinata(String nColor, String nShape)
    {
        candy = "hard candy";
        color = nColor;
        shape = nShape;
    }
    
    public Pinata(String mCandy)
    {
        candy = mCandy;
        color = "rainbow";
        shape = "donkey";
    }
    
    
    
    public String toString()
    {
        return color + " " + shape + " pinata filled with " + candy;
    }
}


PinataTester.java:
-----------------
public class PinataTester
{
    public static void main(String[] args)
    {
        // Make Pinatas!
        Pinata ella = new Pinata();
        
        // Print the pinatas
        System.out.println(ella);
        
        
    }
}

