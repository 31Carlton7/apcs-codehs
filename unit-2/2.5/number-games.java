NumberGames.java:
----------------
public class NumberGames
{
    
    // Keep track of the number
    private double num;
    
    // Constructor
    public NumberGames(double startingNumber)
    {
        num = startingNumber;
    }
    
    // Returns the number
    public double getNumber()
    {
        return num;
    }
    
    // Doubles the number
    // Returns the doubled number
    public double doubleNumber()
    {
        num *= 2;
        return num;
    }
    
    // Squares the number
    // Returns the squared number
    public double squareNumber()
    {
        num *= num;
        return num;
    }
    
    
}


GamesTester.java:
----------------
public class GamesTester
{
    public static void main(String[] args)
    {
        NumberGames game = new NumberGames(3);
        
        // Double the number
        
        //game.doubleNumber();
        
        // Print it out
        
        System.out.println(game.doubleNumber());
        
        // Square the number
        
        //num2 = game.squareNumber();
        
        // Print it out
        
        System.out.println(game.squareNumber());
        
        // Double the number again
        
        //num2 = game.doubleNumber();
        
        // Print it out
        
        System.out.println(game.doubleNumber());
        
        // Get the number and store the value
        
        double num2 = game.getNumber();
        
        // Print it out to see that getNumber does
        
        System.out.println(num2);
        
        // not modify the number

    }
}
