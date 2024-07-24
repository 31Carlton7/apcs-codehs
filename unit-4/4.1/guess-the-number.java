import java.util.Scanner;
public class GuessTheNumber
{ 
    // This is the secret number that will pass the autograder!
    static int secretNumber = 6;
    public static void main(String[] args)
    {
        
        // Allow the user to keep guessing numbers between
        // 1 and 10 until they guess the correct number
        
        System.out.println("I'm thinking of a number between 1 and 10.");
        System.out.println("See if you can guess the number!");
        
        // This calls the static method GuessMyNumber. Notice that the method is outside 
        // of the main method. 
        guessMyNumber();
        
    }
    
    public static void guessMyNumber() 
    {  
        Scanner input = new Scanner(System.in);
        int guess = 0;
        
        while(guess != secretNumber)
        {
            System.out.println("Enter your guess: ");
            guess = input.nextInt();
            
            if(guess == secretNumber)
            {
                break;
            }
            System.out.println("Try again!");
        }
        System.out.println("Correct!");
    }
}
