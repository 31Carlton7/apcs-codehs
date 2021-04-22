RockPaperScissors.java:
----------------------
import java.util.Scanner;

public class RockPaperScissors
{
    private static final String USER_PLAYER = "User wins!";
    private static final String COMPUTER_PLAYER = "Computer wins!";
    private static final String TIE = "Tie";
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Randomizer rand = new Randomizer();
        String userChoice = "";
        String computerChoice = "";
        
        while(input.hasNext())
        {
            System.out.println("Enter your choice (rock, paper, or scissors): ");
            userChoice = input.nextLine();
            
            if(userChoice == "")
            {
                System.out.println("Thanks for playing!");
                break;
            }
            else
            {
                if(Randomizer.nextInt(0, 2) == 0)
                {
                    computerChoice = "rock";
                }
                else if(Randomizer.nextInt(0, 2) == 1)
                {
                    computerChoice = "paper";
                }
                else
                {
                    computerChoice = "scissors";
                }
            }
            
            System.out.println("User: " + userChoice);
            System.out.println("Computer: " + computerChoice);
            System.out.println(RockPaperScissors.getWinner(userChoice, computerChoice));
        }
            
    }
    
    public static String getWinner(String user, String computer)
    {
        String result = "";
        if(user == computer)
        {
            result = TIE;
        }
        else if((user == "rock" && computer == "scissors") || (user == "paper" && computer == "rock") || (user == "scissors" && computer == "paper"))
        {
            result = USER_PLAYER;
        }
        else 
        {
            // if((computer == "rock" && user == "scissors") || (computer == "paper" && user == "rock") || (computer == "scissors" && user == "paper"))
            result = COMPUTER_PLAYER;
        }
        return result;
    }
}

Randomizer.java:
---------------
//Copy over your code from the Randomizer class exercise

public class Randomizer
{
    private static final String USER_PLAYER = "User wins!";
    private static final String COMPUTER_PLAYER = "Computer wins!";
    private static final String TIE = "Tie";
    
    public static int nextInt()
    {
        //Implement this method to return a random number from 1-10
        return (int)(Math.random() * (9 + 1) + 1);
    }
    
    public static int nextInt(int min, int max)
    {
        // Implement this method to return a random integer between min and max
        return (int)(Math.random() * ((max - min) + 1) + min);
    }
}

