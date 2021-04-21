import java.util.Scanner;

public class CastingToDouble
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter 2 numbers");
        int first_int = input.nextInt();
        int second_int = input.nextInt();
        
        double num = first_int / (double)second_int;
        
        System.out.println("Here is your number divided: " + num);
        
        

    }
}
