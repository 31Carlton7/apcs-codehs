WordGames.java:
--------------
import java.lang.*;
public class WordGames
{
    private String word;
    
    public WordGames(String text)
    {
        word = text;
    }
    
    public String scramble()
    {
        // Switch first half
        // And second half
        int length = word.length();
        int half = length/2;
        String scramble = word.substring(half) + word.substring(0,half);
        return scramble;
      
    }
    
    
    public String bananaSplit(int insertIdx, String insertText)
    {
        // Insert insertText at the position
        StringBuffer newString = new StringBuffer(word);
      newString.insert(insertIdx, insertText);
      return newString.toString();

       
    }
    
    
  public String bananaSplit(String insertChar, String insertText)
    {
        // Insert insertText after the first
        int idc = word.indexOf(insertChar);
        String b42 = word.substring(0, idc);
        String af2 = word.substring(idc);
        String bs = b42 + insertText + af2;
        return bs;
    }

 
    public String toString()
    {
        word = "[" + word + "]";
        return word;
    }
}

WordGameTester.java:
-------------------
import java.util.Scanner;

public class WordGameTester
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        // Ask for a word
        System.out.println("Please insert a word");
        String word = scanner.nextLine();
        // Scramble it
        // Print out scrambled word
        WordGames text = new WordGames(word);
        System.out.println(text.scramble());
        // Ask for an index
        // Ask for random word
        System.out.println("Enter an integer: ");
        int idx = scanner.nextInt();
        scanner.nextLine();  // skip over the newline
        System.out.println("Enter another word: ");
        String rand = scanner.nextLine();
        
        // Add random word at index
        System.out.println(text.bananaSplit(idx,rand));
        // Print out the word
        
        
         // Ask for a character (store as a String)
        System.out.println("Enter a character: ");
        String mick = scanner.nextLine();
        System.out.println("Enter another word: ");
        String rando = scanner.nextLine();
        System.out.println(text.bananaSplit(mick, rando));
        // Ask for random word
        // Add random word at character
        // Print out the word
  
    }
}

