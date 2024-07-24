import java.util.Scanner;

public class OddNumbers
{
    public static void main(String[] args)
    {
        //Ask user to enter 2 positive integers
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter 2 positive integers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        
        //Determine if both numbers are odd with bothOdd boolean
        // Do NOT remove this line!
        boolean bothOdd = num1 % 2 != 0 && num2 % 2 != 0;
        
        boolean bothOddDeMorgan = !((num1 % 2 == 0) || (num2 % 2 == 0));
        
        //Print out if both numbers are odd or not both odd
        if (bothOdd)
        {
           System.out.println("Both numbers are odd");
        }
        else
        {
            System.out.println("Both numbers are NOT odd.");
        }
        
        //Print out if both numbers are odd or not both odd
        if (bothOddDeMorgan)
        {
           System.out.println("Both numbers are odd with De Morgan's Laws.");
        }
        else
        {
            System.out.println("Both numbers are NOT odd with DeMorgan's Laws.");
        }
        
        //Check that both Boolean values evaluate to the same value
        if(bothOdd == bothOddDeMorgan)
        {
            System.out.println("DeMorgan was right, again!");
        }
   }
}
