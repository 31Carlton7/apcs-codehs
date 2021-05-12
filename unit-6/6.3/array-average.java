ArrayAverageTester.java:
-----------------------
public class ArrayAverageTester
{

   public static void main(String[] args)
   {
     int[] numArray =  {12, 17, 65, 7, 30, 88};
     
    // Create an ArrayAverage object and print the result 
    ArrayAverage array = new ArrayAverage(numArray);
    System.out.println("The average of the array is " + array.getAverage());
   }
}

ArrayAverage.java:
-----------------
public class ArrayAverage
{
    private int[] values;
    
    public ArrayAverage(int[] values)
    {
        this.values = values;
    }
    public double getAverage()
    {
        //double so that division won't be rounded
        double sum = 0;
        for(int num : values)
        {
            sum += num;
        }
        return sum / values.length;
    }
}
