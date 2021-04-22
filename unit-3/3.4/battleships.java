Battleship.java:
---------------
public class Battleship
{
    private String name;  // type of ship
    private int power;   // power of attack in range [1 - 10]
    private int health; // health of the ship
    
    // Constructor
    public Battleship(String shipType, int attackPower)
    {
        name = shipType;
        power = attackPower;
        health = 100;
    }
    
    // Modifies the health of the battleship
    public void isAttacked(int attackPower)
    {
        if(attackPower < 4)
        {
            health -= 3;
        } else if(attackPower < 8) {
            health -= 5;
        } else {
            health -= 7;
        }
    }
    
    // Returns true if the health of
    // the ship is greater than 0
    public boolean stillFloating()
    {
        if(health > 0)
        {
            return true;
        } else {
            return false;
        }
    }
    
    // Returns the power of the ship
    public int getPower()
    {
        return power;
    }
    
    // Returns string representation in the form
    // Battleship name
    public String toString()
    {
        return name + "(" + health + ")";    
    }
    
}


ShipTester.java:
---------------
public class ShipTester
{
    public static void main(String[] args)
    {
        Battleship sub = new Battleship("submarine", 6);
        Battleship raft = new Battleship("raft", 2);
        Battleship destroyer = new Battleship("destroyer", 9);
     
        System.out.println(sub);
        System.out.println("Sub has power " + sub.getPower());
        
        System.out.println(raft);
        System.out.println("Raft has power " + raft.getPower());
        
        System.out.println(destroyer);
        System.out.println("Destroyer has power " + destroyer.getPower());
        
        System.out.println("\nRaft attacks Sub");
        sub.isAttacked(raft.getPower());
        System.out.println(sub);
        
        System.out.println("\nDestroyer attacks Raft");
        raft.isAttacked(destroyer.getPower());
        System.out.println(raft);
        
        System.out.println("\nSub attacks Destroyer");
        destroyer.isAttacked(sub.getPower());
        System.out.println(destroyer);


    }
}

