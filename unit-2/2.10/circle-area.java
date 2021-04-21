Circle.java:
-----------
public class Circle
{
    private double radius;
    
    public Circle(double theRadius)
    {
        radius = theRadius;
    }

    // Implement getArea using
    // Math.PI and
    // Math.pow
    // Area = pi * r^2
    public double getArea()
    {
        double area = (Math.PI*Math.pow(radius, 2));
        return area;
    }
    
    // Implement getCircumference using
    // Math.PI
    // Circumference = 2 * PI * r
    public double getCircumference()
    {
        double circumference = (2*Math.PI*radius);
        return circumference;
    }
    
}

CircleTester.java:
-----------------
public class CircleTester 
{
    public static void main(String[] args)
    {
        Circle cup = new Circle(5);
        System.out.println("Area of a circle with radius 5: " + cup.getArea());   
        System.out.println("Circumference of a circle with radius 5: " + cup.getCircumference());   

        Circle hat = new Circle(12);
        System.out.println("\nArea of a circle with radius 12: " + hat.getArea());   
        System.out.println("Circumference of a circle with radius 12: " + hat.getCircumference());   

    }
}

