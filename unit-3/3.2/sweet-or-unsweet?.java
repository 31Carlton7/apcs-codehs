import java.util.Scanner;

public class DrinkOrder
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Start here!
        // You'll find it helpful to list the steps you
        // need to take, then write the code
        
        //Ask for print requested drink
        System.out.println("What do you want to drink? ");
        String drink = input.nextLine();
        
        //Ask for amount of sugar
        System.out.println("How many teaspoons of sugar do you want? ");
        int sugar = input.nextInt();
        
        //Confirm order
        String cond = "with sugar";
        
        if(sugar == 0)
        {
            cond = "";
        }
        
        System.out.println("Confirming your order. You wanted: ");
        System.out.print(drink + " " + cond);
        
    }
}
