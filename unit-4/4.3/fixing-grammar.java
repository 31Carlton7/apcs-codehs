import java.util.Scanner;

public class Grammar
{
    public static void main(String[] args)
    {
        // Ask the user to enter a sentence that uses the word 2 instead of to.
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        String text = input.nextLine();
        
        // Call the method useProperGrammar to process the string according to 
        // the directions.
        System.out.println(useProperGrammar(text));
    }
    
    public static String useProperGrammar(String theText)
    {
       String newText = theText;
       int numOfErrors;
       
       for(numOfErrors = 0; newText.contains("2"); numOfErrors++)
       {
           newText = newText.replaceFirst("2", "to");
       }
       
       return "Fixed " + numOfErrors + " grammatical errors: " + newText;
    }
}
