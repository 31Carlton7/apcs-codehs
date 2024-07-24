CalculatorTester.java:
---------------------
import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        Calculator calc = new Calculator();
        
        System.out.println("Enter a number with a decimal");
        double x = input.nextDouble();
        
        System.out.println("Enter another number with a decimal");
        double y = input.nextDouble();
        
        calc.sum(x, y);
        calc.subtract(x, y);
        calc.multiply(x, y);
        calc.divide(x, y);
    }
}

Calculator.java:
---------------
public class Calculator
{
    // This class does not need instance variables!
    
    // Prints the sum of x and y
    public void sum(double x, double y)
    {
        double result = x + y;
        System.out.print(x);
        System.out.print(" + ");
        System.out.print(y);
        System.out.print(" = ");
        System.out.println(result);
        
    }
    
    // Prints the product of x and y
    public void multiply(double x, double y)
    {
        double result = x * y;
        System.out.print(x);
        System.out.print(" * ");
        System.out.print(y);
        System.out.print(" = ");
        System.out.println(result);
        
    }
    
    // Prints the product of x and y
    public void divide(double x, double y)
    {
        double result = x / y;
        System.out.print(x);
        System.out.print(" / ");
        System.out.print(y);
        System.out.print(" = ");
        System.out.println(result);
        
    }
    
    // Prints the product of x and y
    public void subtract(double x, double y)
    {
        double result = x - y;
        System.out.print(x);
        System.out.print(" - ");
        System.out.print(y);
        System.out.print(" = ");
        System.out.println(result);
        
    }
}
