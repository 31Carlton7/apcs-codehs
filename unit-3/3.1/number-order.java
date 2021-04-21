import java.util.Scanner;

public class RelativeNumbers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Ask for two numbers
        System.out.println("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        
        // Compare the numbers as instructed
        boolean comp1 = num1 < num2;
        boolean comp2 = num1 == num2;
        boolean comp3 = num1 > num2;
        
        // Display the results
        System.out.println(num1 + " < " + num2 + ": " + comp1);
        System.out.println(num1 + " == " + num2 + ": " + comp2);
        System.out.println(num1 + " > " + num2 + ": " + comp3);
    }
}
