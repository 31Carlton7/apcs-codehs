AirlineTicketTester.java:
------------------------
import java.util.ArrayList;

public class AirlineTicketTester
{
    public static void main(String[] args)
    {
        ArrayList<AirlineTicket> tickets = new ArrayList<AirlineTicket>();
        //This creates a randomized list of passengers
        addPassengers(tickets);
        for(AirlineTicket elem: tickets)
        {
            System.out.println(elem);
        }
       //This creates a TicketOrganizer object
        TicketOrganizer ticketOrganizer = new TicketOrganizer(tickets);
        
        //These are the methods of the ticketOrganizer in action
        System.out.println("\nPassengers Ordered by Boarding Group:");
        ticketOrganizer.printPassengersByBoardingGroup();
        System.out.println("\nPassengers in line who can board together:");
        ticketOrganizer.canBoardTogether();
    }
    
    //Do not touch this method! It is adding random passengers to the AirlineTicket array
    public static void addPassengers(ArrayList<AirlineTicket> tickets)
    {
        String[] seats = {"A","B","C","D","E","F"};
        for(int index = 0; index< 15; index++)
        {
            int random = (int)(Math.random() * 5);
            AirlineTicket ticket = new AirlineTicket("Passenger " + (index+1), seats[random], ((int)(Math.random()*5)+1), ((int)(Math.random()*8)+1));
            tickets.add(ticket);
        }
    }
    
}


AirlineTicket.java:
------------------
public class AirlineTicket
{
    private String[] seats = {"A","B","C","D","E","F"};
    private String name;
    private String seat;
    private int boardingGroup;
    private int row;
    
    public AirlineTicket(String name, String seat, int boardingGroup, int row)
    {
        this.name = name;
        if(isValidSeat(seat))
        {
            this.seat = seat;
        }
        this.boardingGroup = boardingGroup;
        this.row = row;
        
    }
    
    private boolean isValidSeat(String seat)
    {
        boolean isValidSeat = false;
        for(String elem: seats)
        {
            if(seat.equals(elem))
            {
                isValidSeat = true;
            }
        }
        return isValidSeat;
    }
    
    public String getSeat()
    {
        return this.seat;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public int getBoardingGroup()
    {
        return this.boardingGroup;
    }
    
    public int getRow()
    {
        return this.row;
    }
    
    public String toString()
    {
        return name + " Seat: " +seat + " Row: " + row + " Boarding Group: " + boardingGroup;
    }
}


TicketOrganizer.java:
--------------------
import java.util.*; 

public class TicketOrganizer { 
    ArrayList<AirlineTicket> tickets; 
    
    public TicketOrganizer(ArrayList<AirlineTicket> arr) 
    { 
        tickets=arr; 
    } 
    
    public void getTickets(ArrayList<AirlineTicket> arr)
    { 
        tickets=arr; 
        
    } 
    
    public void printPassengersByBoardingGroup()
    { 
        for (int i=1;i<=5;i++) 
        { 
            System.out.println("Boarding Group "+i+":"); 
            for(int j=0;j<tickets.size();j++)
            { 
                if (tickets.get(j).getBoardingGroup()==i) 
                    System.out.println("Passenger "+(j+1)); 
                
            } 
            
        } 
        
    } 
    public void canBoardTogether()
    { 
        boolean first=true; 
        for(int i=0;i<tickets.size()-1;i++) 
        if(tickets.get(i).getRow()==tickets.get(i+1).getRow()&&tickets.get(i).getBoardingGroup()==tickets.get(i+1).getBoardingGroup())
        {
            System.out.println("Passenger " + (i+1) + " can board with Passenger "+(i+2)+"."); first=false; 
        } 
        if(first)System.out.println("There are no passengers with the same row and boarding group."); 
        
    } 
}
