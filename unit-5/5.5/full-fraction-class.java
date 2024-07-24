Fraction.java:
-------------
public class Fraction
{
    // Create your instance variables and constructor here
    public int numerator;
    public int denominator;
    
    public Fraction(int numerator, int denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    
    
    public int getNumerator() {
        // IMPLEMENT THIS METHOD
        return numerator;
    }
    
    public int getDenominator() {
        // IMPLEMENT THIS METHOD
        return denominator;
    }
    
    public void setNumerator(int x) {
        // IMPLEMENT THIS METHOD
        numerator = x;
    }
    
    
    public void setDenominator(int x) {
        // IMPLEMENT THIS METHOD
        denominator = x;
    }
    
    public void add(Fraction other) {
        // IMPLEMENT THIS METHOD
        if(denominator == other.getDenominator())
        {
            numerator += other.getNumerator();
            // denominator += other.getDenominator();
        } else {
            int oldNumerator = numerator;
            int oldDenominator = denominator;
            
            numerator *= other.getDenominator();
            denominator *= other.getDenominator();
            other.setNumerator(other.getNumerator() * oldDenominator);
            other.setDenominator(other.getDenominator() * oldDenominator);
            
            numerator += other.getNumerator();
            // denominator += other.getDenominator();
        }
    }
    
    public void subtract(Fraction other) {
        // IMPLEMENT THIS METHOD
        if(denominator == other.getDenominator())
        {
            numerator -= other.getNumerator();
            // denominator -= other.getDenominator();
        } else {
            int oldNumerator = numerator;
            int oldDenominator = denominator;
            
            numerator *= other.getDenominator();
            denominator *= other.getDenominator();
            other.setNumerator(other.getNumerator() * oldDenominator);
            other.setDenominator(other.getDenominator() * oldDenominator);
            
            numerator -= other.getNumerator();
            // denominator -= other.getDenominator();
        }
    }
    
    public void multiply(Fraction other) {
        // IMPLEMENT THIS METHOD
        numerator *= other.getNumerator();
        denominator *= other.getDenominator();
    }
    
    public String toString() {
        // IMPLEMENT THIS METHOD
        return numerator + "/" + denominator;
    }
}

FractionTester.java:
-------------------
public class FractionTester
{
    public static void main(String[] args)
    {
        // Implement the Fraction class in Fraction.java
        
        // Then add code here to test out your Fraction class!
    }
}

