BaseballPlayer.java:
-------------------
public class BaseballPlayer
{
    private int hits;
    private int atBats;
    private String name;
    
    //Add constructor here
    public BaseballPlayer(String nName, int nHits, int nAtBats) {
        hits = nHits;
        atBats = nAtBats;
        name = nName;
    }
    
    public void printBattingAverage()
    {
        double battingAverage = hits / (double) atBats;
        System.out.println(battingAverage);
    }
    
    public String toString()
    {
        return name + ": " + hits + "/" + atBats;
    }
    
    
}

BaseballTester.java:
-------------------
public class BaseballTester
{
    public static void main(String[] args)
    {
        BaseballPlayer babeRuth = new BaseballPlayer("Babe Ruth", 2873, 8399);
        System.out.println(babeRuth);
        
        // Call the function printBattingAverage here
        babeRuth.printBattingAverage();
        
    }
}


