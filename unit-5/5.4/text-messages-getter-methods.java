Messages.java:
-------------
public class Messages
{
    public static void main(String[] args)
    {
        // Your code here.
        // Create two TextMessage objects and print them out.
        
        TextMessage a = new TextMessage("Me", "Johnny", "Hey man, how's it going?");
        TextMessage b = new TextMessage("Jeffrey", "Me", "Did you do the math homework?");
        
        System.out.println(a);
         System.out.println(b);
    }
}

TextMessage.java:
----------------
public class TextMessage
{
    private String message;
    private String sender;
    private String receiver;
    
    public TextMessage(String from, String to, String theMessage)
    {
        sender = from;
        receiver = to;
        message = theMessage;
    }
    
    public String getSender()
    {
        return sender;
    }
    
    public String getReceiver()
    {
        return receiver;
    }
    
    public String getMessage()
    {
        return message;
    }
    
    public String toString()
    {
        return sender + " texted " + receiver + ": " + message;
    }
}

