import java.util.Scanner;
public class TaffyTester
{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       
       System.out.println("Starting Taffy Timer...");
       
       System.out.println("Enter the temperature: ");
       int temp1 = input.nextInt();
       
       while(temp1 < 270)
       {
           System.out.println("The mixture isn't ready yet.");
           System.out.println("Enter the temperature: ");
           int temp2 = input.nextInt();
           
           temp1 = temp2;
       }
       System.out.println("Your taffy is ready for the next step!");
    }
}
