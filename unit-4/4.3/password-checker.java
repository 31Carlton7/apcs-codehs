import java.util.Scanner;

public class Password
{
    public static void main(String[] args)
    {
        // Prompt the user to enter their password and pass their string
        // to the passwordCheck method to determine if it is valid.
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a password: ");
        String password = input.nextLine();
        
        System.out.println(passwordCheck(password));
    }
    
    public static boolean passwordCheck(String password)
    {
        // Create this method so that it checks to see that the password
        // is at least 8 characters long and only contains letters 
        // and numbers.
        
        if((password.length() < 8) || (password.contains("!")) || (password.contains("?")) || (password.contains(".")) || (password.contains(";")) || password.contains(":") || password.contains(" "))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
