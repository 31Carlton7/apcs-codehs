import java.util.Scanner;

public class AmusementPark
{
    
    static int AGE_LIMIT = 12;
    static int HEIGHT_LIMIT = 48;
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your age: "); 
        int age = input.nextInt();
        
        System.out.println("Enter your height in inches: ");
        int height = input.nextInt();
        
        boolean oldEnough = age >= AGE_LIMIT;
        boolean tallEnough = height >= HEIGHT_LIMIT;
        
        // CHANGE THIS LINE
        // Convert this boolean expression into its De Morgan equivalent
        boolean cannotRide = !(oldEnough && tallEnough);
        
        if(cannotRide)
        {
            System.out.println("You may not ride the rollercoasters.");
        }
        else
        {
            System.out.println("You may ride the rollercoasters!");
        }
        
        System.out.println("Can you swim? Enter true or false.");
        boolean canSwim = input.nextBoolean();
        
        System.out.println("Do you have a life jacket? Enter true or false.");
        boolean hasLifeJacket = input.nextBoolean();
        
        // CHANGE THIS LINE
        // Convert this boolean expression into its De Morgan equivalent
        boolean cannotSwim = !canSwim && !hasLifeJacket;
        
        if(cannotSwim)
        {
            System.out.println("You may not swim in the pool.");
        }
        else
        {
            System.out.println("You may swim in the pool!");
        }
    }
}
