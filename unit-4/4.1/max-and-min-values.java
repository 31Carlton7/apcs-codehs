import java.util.Scanner;

public class MaxMin
{
    public static void main(String[] args)
    {
        // Your code goes here!
        // It is useful to plan out your steps before you get started!
        minMax();
    }
    public static void minMax()
    {

        int sn = Integer.MAX_VALUE;
        int ln = Integer.MIN_VALUE;
        double SENTINEL = -1;
        Scanner input  = new Scanner(System.in);
        
        while(true)
        {
            System.out.println("Enter a number (-1 to quit): ");
            int n = input.nextInt();

            if(n == SENTINEL)
            {
                break;    
            }
            if(n < sn)
            {
                sn = n;
            }
            if(n > ln)
            {
                ln = n;
            }
            System.out.println("Smallest # so far: " + sn);
            System.out.println("Largest # so far: " + ln);
        }
    }
}
