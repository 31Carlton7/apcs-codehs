public class FirstArray
{
    public static void main(String[] args)
    {
      // Create the 3 arrays here
      String[] names = {"Las Vegas", "Minsk", "Sao Paulo"};
      int[] avgTemp = {104, 73, 80};
      double[] avgPrec = {4.17, 26.7, 55.0};
        
      // Print all 3 arrays according to the output in the description
      System.out.println(names[0] + " has an average annual precipitation of " + avgPrec[0] + " inches.");
      System.out.println(names[0] + " has an average annual high temp of " + avgTemp[0] + " degrees Fahrenheit.");
      System.out.println(names[1] + " has an average annual precipitation of " + avgPrec[1] + " inches.");
      System.out.println(names[1] + " has an average annual high temp of " + avgTemp[1] + " degrees Fahrenheit.");
      System.out.println(names[2] + " has an average annual precipitation of " + avgPrec[2] + " inches.");
      System.out.println(names[2] + " has an average annual high temp of " + avgTemp[2] + " degrees Fahrenheit.");
    }
}
