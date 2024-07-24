import java.util.Scanner;

public class CastingToInt
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a decimal valued number");
        double myDouble = input.nextDouble();
        
        int myInt = (int)myDouble;
        System.out.println("Here is your decimal number as a whole number: " + myInt);
    }
}
