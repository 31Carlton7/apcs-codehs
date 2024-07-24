ExtremeMain.java:
----------------
import java.util.Scanner;
import java.lang.*;

public class ExtremeMain
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        // Create an Extremes object
        Extremes ex = new Extremes();
        
        // Ask the user to guess the maximum value of an Integer
        System.out.println("Guess the maximum Integer value: ");
        int guessMax = input.nextInt();
        
        // Compute and display the difference
        // between the max and the guess
        System.out.println("You were off by " + ex.maxDiff(guessMax));
        
        // Ask the user to guess the minimum value of an Integer
        System.out.println("Guess the minimum Integer value: ");
        int guessMin = input.nextInt();
        
        // Compute and display the difference 
        // between the min and the guess
        System.out.println("You were off by " + ex.minDiff(guessMin));
        
    }
}

Extremes.java:
-------------
public class Extremes
{
    Integer min;
    Integer max;
    
    // Constructor
    public Extremes()
    {
        min = Integer.MIN_VALUE;
        max = Integer.MAX_VALUE;
    }
    
    // Returns the difference
    // max - number
    public Integer maxDiff(Integer number)
    {
        return max - number;
    }

    // Returns the difference
    // min - number
    public Integer minDiff(Integer number)
    {
        return min - number;
    }
    
    // Returns a String representation
    // in the form
    // [min, max]
    public String toString()
    {
        return "[" + min + ", " + max + "]";   
    }
}
