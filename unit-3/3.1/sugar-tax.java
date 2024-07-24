import java.util.Scanner;

public class AddedSugar
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        // Ask the user for the grams of sugar
        System.out.println("How many grams of sugar have you eaten today? ");
        int sugar = input.nextInt();
        
        // Use a boolean expression to print if they can eat more sugar
        boolean moreSugar = sugar < 30;
        System.out.println("You can eat more sugar: " + moreSugar);
    }
}
