import java.util.Scanner;

public class RollerCoaster 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);        
        
        System.out.println("How tall are you in inches?");
        int height = input.nextInt();
        
        System.out.println("How old are you?");
        int age = input.nextInt();
        
        if(height >= 42 && age >= 9)
        {
            System.out.println("Welcome aboard!");
        } else if(height < 42 || age < 9 ) {
            System.out.println("Sorry, you are not eligible to ride");
        }
    }
}
