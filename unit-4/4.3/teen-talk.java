TeenTester.java:
---------------
import java.util.Scanner;

public class TeenTester
{
    public static void main(String[] args)
    {
        // Create a new Teen object and print it out; see the Teen class file
        // to see how the constructor and toString method work.
        Teen myFriend = new Teen("Sonequa", "Martin-Green", 10, true);
        System.out.println(myFriend.toString());
        
        // Ask the user to input a text message
        Scanner input = new Scanner(System.in);
        
        System.out.println("Eneter the text nessage being sent: ");
        String text = input.nextLine();
        
        // Call teenTalk method to translate the message to teen talk
        System.out.println(myFriend.teenTalk(text));
    }
}

Teen.java:
---------
public class Teen 
{
    private String firstName;
    private String lastName;
    private int grade;
    private Boolean textMessages;

    // Constructor to make a teen with a first and last name, grade in school, 
    // and whether they text message others and need to write texts to others. 
    
    // This defines the state of the teen.
    public Teen(String theFirstName, String theLastName, int theGrade, Boolean theTextMessages)
    {
        firstName = theFirstName;
        lastName = theLastName;
        grade = theGrade;
        textMessages = theTextMessages;
    }
    
    // toString method to print out the state of teen object
    public String toString()
    {
        return firstName + " " + lastName + " is in grade " + grade + " and wants to send this text:";
    }
    
    // Create this method so that it changes the text message 
    // and places the word "like" in place of each space 
    // in the message.
    public String teenTalk(String text)
    {
        return String.join(" like ", text.split(" "));
    }
    
}



