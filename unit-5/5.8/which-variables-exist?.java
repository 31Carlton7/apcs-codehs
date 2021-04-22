public class MathOperations
{
    private static double PI = 3.14159;
    
    public static void main(String[] args)
    {
        int sumResult = sum(5, 10);
        int differenceResult = difference(20, 2);
        double productResult = product(3.5, 2);
        double circumferenceResult = circleCircumference(10);
        double areaResult = circleArea(12);
    }
    
    public static int sum(int one, int two)
    {
        // Printing Variables Example
        System.out.println("PI: " + PI);
        System.out.println("one: " + one);
        System.out.println("two: " + two);
        
        return one + two;
    }
    
    public static int difference(int one, int two)
    {
        // PRINT OUT VARIABLES HERE
        System.out.println("PI: " + PI);
        System.out.println("one: " + one);
        System.out.println("two: " + two);
        
        return one - two;
    }
    
    public static double product(double a, double b)
    {
        double result = a * b;
        
        // PRINT OUT VARIABLES HERE
        System.out.println("PI: " + PI);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("result: " + result);
        
        return result;
    }
    
    public static double circleCircumference(int radius)
    {
        // PRINT OUT VARIABLES HERE
        System.out.println("PI: " + PI);
        System.out.println("radius: " + radius);
        
        return 2 * radius * PI;
    }
    
    public static double circleArea(int radius)
    {
        double area = PI * radius * radius;
        
        // PRINT OUT VARIABLES HERE
        System.out.println("PI: " + PI);
        System.out.println("radius: " + radius);
        System.out.println("area: " + area);
        
        return area;
    }
}
