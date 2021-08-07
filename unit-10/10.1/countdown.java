import java.util.Scanner;

public class Countdown
{
    public static void main(String[] args)
    {
       // Start here
       Scanner input = new Scanner(System.in);
       
       System.out.println("Please enter a number to start: ");
       String s = input.nextLine();
       int num = Integer.parseInt(s);
       
       System.out.print(countdown(num) + " ");
      
    }
    
    public static String countdown(int number)
    {
       // Base case - return Blastoff!
       if(number == 0)
       {
           return "Blastoff!";
       } else {
        // Recursive call
        return String.valueOf(number) + " " + countdown(number - 1);
       }
    }
}
