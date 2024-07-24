import java.util.Scanner;

public class Discounts
{
    public static void main(String[] args)
    {
        // Create a scanner object
        Scanner input = new Scanner(System.in);
        
        // Ask how many hours were you parked
        System.out.println("How many hours have you been parked?");
        int hours = input.nextInt();
        
        // Compute cost - $3.50 per hour
        double costPerHour = 3.50;
        double cost = costPerHour*hours;
        
        // If cost is over $20, set cost to $20
        if(cost >= 20.0)
        {
            cost = 20.0;
        } 
        
        // Display the final cost
        System.out.println("You owe $" + cost);
        
    }
}
