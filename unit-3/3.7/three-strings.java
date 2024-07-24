import java.util.Scanner;
public class ThreeStrings
{
    public static void main(String[] args)
    {
        // Ask the user for three strings.
        // Use a Boolean variable to test the comparison of 
        // first+second equals third
        // Remember since you are working with strings to 
        // use equals() and NOT == !
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("First String? ");
        String input1 = input.nextLine();
        
        System.out.print("Second String? ");
        String input2 = input.nextLine();
        
        System.out.print("Third String? ");
        String input3 = input.nextLine();
        
        if((input1+input2).equals(input3))
        {
            System.out.println(input1 + " + " + input2 + " is equal to " + input3 + "!");
        }
        else
        {
            System.out.println(input1 + " + " + input2 + " is not equal to " + input3 + "!");
        }
    }
}
