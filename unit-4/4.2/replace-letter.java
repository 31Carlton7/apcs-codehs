import java.util.Scanner;

public class Letter
{
    public static void main(String[] args)
    {
        // Ask the user for 3 things: their word, letter they want to replace,
        // and replacing letter.
        
        // Call the method replaceLetter and pass all 3 of these items to it for 
        // string processing.
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your word: ");
        String word = input.nextLine();
        
        System.out.println("Enter the letter you want to replace: ");
        String replaceOne = input.nextLine();
        
        System.out.println("Enter the replacing letter: ");
        String replaceTwo = input.nextLine();
        
        System.out.println(replaceLetter(word, replaceOne, replaceTwo));
    }
    
    // Modify this method so that it will take a third parameter from a user that is the String they want to
    // to replace letterToReplace with. This method should return the modified String.
    public static String replaceLetter(String word, String letterToReplace, String replacingLetter)
    {
        
        // int count = 0;
        // for(int i = 0; i < word.length(); i++)
        // {
        //     if(word.substring(i, i+1).equals(letterToReplace))
        //     {
        //         count++;
        //     }
        // }
        
        return word.replace(letterToReplace, replacingLetter);
    }
}
