import java.util.Scanner;

public class FindMinimum 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Ask the user for three ints and 
        // print out the minimum.
        
        System.out.println("Enter the first integer: ");
        int first = input.nextInt();
        
        System.out.println("Enter the second integer: ");
        int second = input.nextInt();
        
        System.out.println("Enter the third integer: ");
        int third = input.nextInt();
        
        int minimum = 0;
        
        if(first < second && first < third)
        {
            minimum = first;
        }
        else if(second < first && second < third)
        {
            minimum = second;
        }
        else if(third < first && third < second)
        {
            minimum = third;
        }
        else if(first == second && second > third)
        {
            minimum = third;
        }
        else if(first == second && first == third)
        {
            minimum = first;
        }
        else if(first == second && first < third)
        {
            minimum = first;
        }
        System.out.println("The minimum is " + minimum);
    }
}
