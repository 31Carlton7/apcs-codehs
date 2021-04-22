RandomizerTester.java:
---------------------
public class RandomizerTester
{
    public static void main(String[] args)
    {
    
        System.out.println("Results of Randomizer.nextInt()");
        for(int i = 0; i < 10; i++)
        {
            System.out.println(Randomizer.nextInt());
        }
       
        //Initialize min and max for Randomizer.nextInt(min,max)
        int min = 5;
        int max = 10;
        System.out.println("\nResults of Randomizer.nextInt(5,10)");
        for(int i = 0; i < 10; i++)
        {
            System.out.println(Randomizer.nextInt(min ,max));
        }
        
    }
}


Randomizer.java:
---------------
public class Randomizer
{
    public static int nextInt()
    {
        //Implement this method to return a random number from 1-10
        return (int)(Math.random() * (9 + 1) + 1);
    }
    
    public static int nextInt(int min, int max)
    {
        // Implement this method to return a random integer between min and max
        return (int)(Math.random() * ((max - min) + 1) + min);
    }
}
