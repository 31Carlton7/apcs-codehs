import java.util.Scanner;

public class Berries
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Ask for a berry initial
        System.out.println("Enter the initial of the berry: ");
        String initial = input.nextLine();
        
        // To get the input as a character, use the String method
        // charAt().  Use str.charAt(0) since you want the
        // first character
        char initialB = initial.charAt(0);
        
        
        // Now you can compare characters using ==
        if(initialB == 'r'){
            System.out.println("You ordered raspberry");
        } else if(initialB == 'h'){
            System.out.println("You ordered huckleberry");
        } else if(initialB == 'g'){
          System.out.println("You ordered goji berry");  
        } else {
            System.out.println("Berry not recognized");
        }
        
        // Use comments to list the different
        // branches you will need before you write the code
    }
}
