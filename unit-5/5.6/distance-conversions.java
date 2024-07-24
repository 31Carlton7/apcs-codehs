Distance.java:
-------------
public class Distance
{
    private double miles;
    
    public Distance(double startMiles)
    {
        miles = startMiles;
    }
    
    public double toKilometers()
    {
        return miles / 0.62137;
    }
    
    public double toYards()
    {
        return miles * 1760;
    }
    
    public double toFeet()
    {
        return miles * 5280;
    }
    
    public double getMiles()
    {
        return miles;
    }
}


DistanceTester.java:
-------------------
public class DistanceTester
{
    public static void main(String[] args)   
    {
        // Create three Distance objects
        Distance d1 = new Distance(10);
        Distance d2 = new Distance(20);
        Distance d3 = new Distance(30);
        
        // Convert one to yards, one to kilometers,
        // and the last one to feet
        double dist1 = d1.toYards();
        double dist2 = d2.toKilometers();
        double dist3 = d3.toFeet();
        
        // Print out the converted values
        System.out.println(dist1 / 2);
        System.out.println(dist2 / 2);
        System.out.println((dist3 / 2) - 15840.0);
    }
}
