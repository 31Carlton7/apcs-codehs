PlayerTester.java:
-----------------
public class PlayerTester
{
    public static void main(String[] args)
    {
        // Test out the Player class here!
        Player playerOne = new Player();
        Player playerTwo = new Player();
        Player playerThree = new Player();
        Player e = new Player();
        Player d = new Player();
        Player f = new Player();
        Player c = new Player();
        Player t = new Player();
        Player u = new Player();
        Player po = new Player();
        Player i = new Player();
        Player l = new Player();
        
        System.out.println(Player.gameFull());
    }
}

Player.java:
-----------
public class Player 
{
    // Static Variables
    // ...
    public static int totalPlayers;
    private static int maxPlayers = 10;
    
    // Public Methods
    public Player() 
    {
        // Some code here...
        totalPlayers++;
    }
    
    // Static Methods 
    // ...
    public static boolean gameFull() 
    {
        return totalPlayers >= maxPlayers;
    }
}
