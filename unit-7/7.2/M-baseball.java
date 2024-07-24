team.java:
---------
public class team 
{
    // Parameters
    private String name;
    private String city;
    private String league;
    
    // Default Constructor
    public team(String name, String city, String league)
    {
        this.name = name;
        this.city = city;
        this.league = league;
    }
    
    // Get Methods for all parameters
    public String getName()
    {
        return name;
    }
    
    public String getCity()
    {
        return city;
    }
    
    public String getLeague()
    {
        return league;
    }
    
    // Set Methods for all parameters
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setCity(String city)
    {
        this.city = city;
    }
    
    public void setLeague(String league)
    {
        this.league = league;
    }
    
    // Change Team Method
    public void changeTeam(team team)
    {
        setName(team.getName());
        setCity(team.getCity());
        setLeague(team.getLeague());
    }
}


MyProgram.java:
--------------
import java.util.ArrayList;

public class MyProgram
{
    public static void main(String[] args)
    {
        // Static ArrayList initialisation
        ArrayList<team> baseball = new ArrayList<team>();
        
        // team initialisations
        team nationals = new team("Nationals", "Washington DC", "Eastern");
        team mets = new team("Mets", "Queens", "Eastern");
        team yankees = new team("Yankess", "Brooklyn", "Eastern");
        team orioles = new team("Orioles", "Baltimore", "Eastern");
        team tigers = new team("Tigers", "Detroit", "Western");
        
        // Adding teams to the (Baseball) arraylist
        baseball.add(nationals);
        baseball.add(mets);
        baseball.add(yankees);
        baseball.add(orioles);
        baseball.add(tigers);
        
        // Printing all the teams in a formatted manner
        System.out.print(String.format("%-15s%-15s%-15s%n", "Team name", "Team City", "League"));
        System.out.println();
        for(team team : baseball)
        {
            System.out.print(String.format("%-15s%-15s%-15s%n", team.getName(), team.getCity(), team.getLeague()));
        }
        System.out.println();
        
        // Changing 3 teams
        baseball.set(1, new team("Dodgers", "Los Angeles", "Western"));
        baseball.set(2, new team("Padres", "San Diego", "Western"));
        baseball.set(4, new team("Red Sox", "Boston", "Eastern"));
        
        // Printing all the teams in a formatted manner
        System.out.print(String.format("%-15s%-15s%-15s%n", "Team name", "Team City", "League"));
        System.out.println();
        for(team team : baseball)
        {
            System.out.print(String.format("%-15s%-15s%-15s%n", team.getName(), team.getCity(), team.getLeague()));
        }
        System.out.println();
        
        // Removing a team
        baseball.remove(2);
        
        // Printing all the teams in a formatted manner
        System.out.print(String.format("%-15s%-15s%-15s%n", "Team name", "Team City", "League"));
        System.out.println();
        for(team team : baseball)
        {
            System.out.print(String.format("%-15s%-15s%-15s%n", team.getName(), team.getCity(), team.getLeague()));
        }
        
    }
}
