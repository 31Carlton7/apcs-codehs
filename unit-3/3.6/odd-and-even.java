OddEvenTester.java:
------------------
import java.util.Scanner;

public class OddEvenTester
{
        public static void main(String[] args)
        {
            //Ask user to input 2 positive integers
            Scanner input  = new Scanner(System.in);
            System.out.println("Enter 2 positive integers");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            
            //Call bothOdd method in OddEven class to determine if both 
            //numbers are odd
            if(OddEven.bothOdd(num1, num2))
            {
                System.out.println("Both numbers are ODD.");
            }
            
            //Call bothEven in the OddEven class to determine if both
            //numbers are even
            else if(OddEven.bothEven(num1, num2))
            {
                System.out.println("Both numbers are EVEN.");
            }
            
            //Print out that one must be odd and one must be even since
            //they are not both odd or both even
            else
            {
                System.out.println("One number is ODD and one number is EVEN.");
            }
            
        }
} 


OddEven.java:
------------
public class OddEven
{
    // Determines if num1 and num2 are both ODD
    public static boolean bothOdd(int n1, int n2)
    {
        return !(n1 % 2 == 0 || n2 % 2 == 0);
    }
    
    // Determines if num1 and num2 are both EVEN 
    public static boolean bothEven(int n1, int n2)
    {
        return n1 % 2 == 0 && n2 % 2 == 0;
    }
    
}

