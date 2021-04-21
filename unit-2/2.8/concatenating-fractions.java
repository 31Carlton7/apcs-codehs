FractionTester.java:
-------------------
import java.util.Scanner;

public class FractionTester
{
    public static void main(String[] args)
    {
        Fraction mf = new Fraction(1, 2);
        Scanner input = new Scanner(System.in);
        
        // Ask for input
        
        System.out.println("Enter the numerator: ");
        int un = input.nextInt();
        
        System.out.println("Enter the denominator: ");
        int ud = input.nextInt();
        
        // Create a new Fraction with the user's input
        
        Fraction uf = new Fraction(un, ud);
        
        // Add the fractions
        // Make use of the getDenominator and getNumerator methods
        
        int fn = (mf.getNumerator()*uf.getDenominator() + mf.getDenominator()*uf.getNumerator());
        int fd = (mf.getDenominator()*uf.getDenominator());
        Fraction ff = new Fraction(fn, fd);
        
        // Print out the fractions as an equation
        // Remember you don't have to call toString yourself!
        
        System.out.println(mf + " + " + uf + " = " + ff);
        
    }
}

Fraction.java:
-------------
public class Fraction
{
    private int numerator;
    private int denominator;
    
    public Fraction(int numer, int denom)
    {
        numerator = numer;
        denominator = denom;
    }
    
    // Returns the numerator
    public int getNumerator()
    {
        return numerator;
    }
    
    // Returns the denominator
    public int getDenominator()
    {
        return denominator;
    }
    
    
    // Returns a string representing a fraction
    // in the form
    // numerator/denominator
    public String toString()
    {
        return numerator + "/" + denominator;
    }
    
    
}

