DragonTester.java:
-----------------
public class DragonTester
{
    public static void main(String[] args)
    {
        // Create a Dragon here to test out the Dragon class!
        Dragon a = new Dragon(9, ">");
        
        System.out.println(a.fight());
        System.out.println(a);
    }
}

Dragon.java:
-----------
public class Dragon 
{
    private String attack;
    private int level;
    
    // Write the constructor here!
    public Dragon(int level, String attack)
    {
        this.level = level;
        this.attack = attack;
    }
    
    // Put getters here
    public String getAttack()
    {
        return attack;
    }
    
    public int getLevel()
    {
        return level;
    }
    
    // Put other methods here
    public String fight()
    {
        String string = "";
        for(int i = 0; i < level; i++)
        {
            string += attack;
        }
        return string;
    }
    

    // String representation of the object
    public String toString()
    {
        return "Dragon is at level " + level + " and attacks with " + attack;
    }
}

