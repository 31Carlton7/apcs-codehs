BattleshipTester.java:
---------------------
public class BattleshipTester
{
    public static void main(String[] args)
    {
        // Create objects
        Battleship submarine = new Battleship("Submarine", 4);
        Battleship carrier = new Battleship("Carrier", 10);
        
        // Check initial positions
        System.out.println(submarine);
        System.out.println(carrier);
        
        
        // Test: Safely move submarine
        System.out.println("Submarine cleared to proceed");
        submarine.move(true);
        System.out.println(submarine);
        
        
        // Test unsafe to move carrier
        System.out.println("Carrier NOT cleared to proceed");
        carrier.move(false);
        System.out.println(carrier);
        
        
    }
}


Battleship.java:
---------------
public class Battleship
{
    private String shipType;
    private int position;
    
    public Battleship(String type, int shipPosition)
    {
        shipType = type;
        position = shipPosition;
    }
    
    // Moves the ship
    // If safeToMove is true, add 5 to position
    // else subtract 5 from position
    public void move (boolean safeToMove)
    {
        if(safeToMove == true)
        {
            position += 5;
        } else {
            position = position - 5;
        }

    }
    
    // Returns the position of the ship
    public int getPosition()
    {
        return position;
    }
    
    // String representation of the object
    public String toString()
    {
        return shipType + " at " + position;
    }
}

