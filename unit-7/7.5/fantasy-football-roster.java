import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class FantasyFootball
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> availablePlayers = new ArrayList<String>();
        ArrayList<String> team = new ArrayList<String>();
        addPlayers(availablePlayers);
        
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Enter Player you would like on your team: ");
            String player = input.nextLine();
            if(search(availablePlayers, player) != -1)
            {
                team.add(player);
                availablePlayers.remove(availablePlayers.indexOf(player));
                System.out.println("Great! That player is added to your team!\n");
            }
            else
            {
                i--;
                System.out.println("That player is not available, please pick another player.\n");
            }
        }
        
        System.out.println("Your team is:");
        for(int i = 0; i < team.size(); i++)
        {
            System.out.println(team.get(i));
        }
        
        
        
    }
    
    public static int search(ArrayList<String> array, String player)
    {
        int element = -1;
        for(int i = 0; i < array.size(); i++)
        {
            if(array.get(i).equals(player))
            {
                element = i;
            }
        }
        return element;
    }
    
    public static void addPlayers(ArrayList<String> array)
    {
        array.add("Cam Newton");
        array.add("Antonio Brown");
        array.add("Leveon Bell");
        array.add("Patrick Mahomes");
        array.add("Saquon Barkley");
        array.add("Mike Evans");
        array.add("Odell Beckham Jr.");
        array.add("Travis Kelce");
        array.add("Baker Mayfield");
        array.add("Michael Thomas");
        array.add("Julio Jones");
        array.add("Ezekial Elliott");
        array.add("Alvin Kamara");
        array.add("Davante Adams");
        array.add("Aaron Rogers");
    }
}
