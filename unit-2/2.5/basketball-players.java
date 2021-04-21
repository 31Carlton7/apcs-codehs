PlayerTester.java:
-----------------
public class PlayerTester
{
    public static void main(String[] args) {
       
       BasketballPlayer lebronJames = new BasketballPlayer("Lebron James");
       BasketballPlayer goat = new BasketballPlayer("Michael Jordan", "Chicago Bulls");
       
       lebronJames.addGame(10, 4);
       lebronJames.addGame(6, 9);
       lebronJames.addGame(22, 2);
       lebronJames.addGame(8, 1);
       
       goat.addGame(33, 7);
       goat.addGame(47, 12);
       goat.addGame(83, 6);
       goat.addGame(35, 10);
       
       System.out.println("Lebum James Stats: ");
       lebronJames.printPPG();
       lebronJames.printAPG();
       System.out.println(lebronJames);
       
       System.out.print("\n");
       
       System.out.println("Michael Jordan Stats: ");
       goat.printPPG();
       goat.printAPG();
       System.out.println(goat);
       
    }
}

BasketballPlayer.java:
---------------------
public class BasketballPlayer {

    /* This class is complete. Take a look around
     * to make sure you understand how to use it,
     * but you do not need to make changes.
     */
	private String name;
	private String team;
	private int totalPoints;
    private int totalAssists;
	private int gamesPlayed;

    public BasketballPlayer(String playerName, String currentTeam) {
		name = playerName;
        team = currentTeam;
		totalPoints = 0;
		gamesPlayed = 0;
	}

    public BasketballPlayer(String playerName) {
        // this() is a shortcut to calling the other constructor
        // in this class. We will see more of 'this' in a later
        // unit, but it is shown here as a best practice.
		this(playerName, "no team");
	}

	public void addGame(int points, int assists) {
		totalPoints += points;
        totalAssists += assists;
		gamesPlayed ++;
	}

	public void printPPG() {
		System.out.print("Points per game: ");
        System.out.println((double) totalPoints / gamesPlayed);
	}

    public void printAPG() {
		System.out.print("Assists per game: ");
        System.out.println((double) totalAssists / gamesPlayed);
	}

	public String toString() {
		return name + " averages " + ((double) totalPoints / gamesPlayed) + " points per game.";
	}
}
