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
        printAllTeams(baseball);
        
        // Sorting the arrayList by name(Insertion : Ascending Order)
        insertionSort(baseball);
        
        // Changing 3 teams
        // baseball.set(1, new team("Dodgers", "Los Angeles", "Western"));
        // baseball.set(2, new team("Padres", "San Diego", "Western"));
        // baseball.set(4, new team("Red Sox", "Boston", "Eastern"));
        
        // Printing all the teams in a formatted manner
        printAllTeams(baseball);
        
        selectionSort(baseball);
        
        // Printing all the teams in a formatted manner
        printAllTeams(baseball);
    }
    
    private static void printAllTeams(ArrayList<team> baseball)
    {
        System.out.print(String.format("%-15s%-15s%-15s%n", "Team name", "Team City", "League"));
        System.out.println();
        for(team team : baseball)
        {
            System.out.print(String.format("%-15s%-15s%-15s%n", team.getName(), team.getCity(), team.getLeague()));
        }
        System.out.println();
    }
    
    private static void insertionSort(ArrayList<team> arr)
    {
        for (int i = 1; i < arr.size(); ++i)
        {
            String key = arr.get(i).getName();
            team key2 = arr.get(i);
            int j = i - 1;
    
            while (j >= 0 && arr.get(j).getName().compareTo(key) > 0) 
            {
                arr.set(j + 1, arr.get(j));
                j -= 1;
            }
            
            arr.set(j + 1, key2);
        }
    }
    
    private static void selectionSort(ArrayList<team> arr)
    {
        for(int index = 0; index < arr.size() - 1; index++)
        {
        	int minIndex = index;
            for(int i = index; i < arr.size(); i ++)
            {
            	if(arr.get(i).getCity().compareTo(arr.get(minIndex).getCity()) < 0)
            	{
            		minIndex = i;
            	}
            }
            
            team tempValue = arr.get(index);
            arr.set(index, arr.get(minIndex));
            arr.set(minIndex, tempValue);
        }
    }
    
}
