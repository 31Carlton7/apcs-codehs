CalculatorTester.java:
---------------------
import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter two doubles");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        Calculator calc = new Calculator();
        
        System.out.println(num1 + " + " + num2 + " = " + (calc.sum(num1, num2)));
        System.out.println(num1 + " - " + num2 + " = " + (calc.subtract(num1, num2)));
        System.out.println(num1 + " * " + num2 + " = " + (calc.multiply(num1, num2)));
        System.out.println(num1 + " / " + num2 + " = " + (calc.divide(num1, num2)));
    }
}

Calculator.java:
---------------
public class Calculator
{
    // This class does not need instance variables!
    // Since there are no instance variables,
    // this class also does not need a constructor.
    
    // Java will create an empty constructor for you.
    
    // Returns the sum of x and y
    public double sum(double x, double y)
    {
        return x + y;
        
    }
    
    // Returns the product of x and y
    public double multiply(double x, double y)
    {
        return x * y;
        
    }
    
    // Returns the quotient x / y
    public double divide(double x, double y)
    {
       return x / y;
    }
    
    // Returns the difference of x - y
    public double subtract(double x, double y)
    {
        return x - y;
    }
}
