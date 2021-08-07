Seat.java:
---------
public class Seat
{
    private boolean available;
    private int tier;

    public Seat(boolean isAvail, int tierNum)
    {
        available = isAvail;
        tier = tierNum;
    }

    public boolean isAvailable()
    {  
        return available;
    }

    public int getTier()
    {  
        return tier; 
    }
    
    public void setAvailability(boolean isAvail)
    {  
        available = isAvail;  
    }
}


MyProgram.java:
--------------
class MyProgram extends ConsoleProgram
{
    public static void main(String[] args) 
    {

        Theater t1 = new Theater(3,1,2);
        t1.theaterSeats[0][0] = new Seat(true,1);
        t1.theaterSeats[0][1] = new Seat(false,1);
        t1.theaterSeats[0][2] = new Seat(true,1);
        t1.theaterSeats[1][0] = new Seat(true,2);
        t1.theaterSeats[1][1] = new Seat(true,2);
        t1.theaterSeats[1][2] = new Seat(true,2);
        t1.theaterSeats[2][0] = new Seat(false,2);
        t1.theaterSeats[2][1] = new Seat(false,2);
        t1.theaterSeats[2][2] = new Seat(true,2);
        
        System.out.println("Theater===>");
        
        for(int i=0;i<3;i++) 
        {
            for(int j=0;j<3;j++) 
            {
                System.out.print("["+i+"]"+"["+j+"] : "+t1.theaterSeats[i][j].isAvailable()+" ");
            }
            System.out.println();
        }
        
        System.out.println("(2,1) want to change seat to (0,0)");
        System.out.println("["+2+"]"+"["+1+"]"+"===>"+"["+0+"]"+"["+0+"]");
        
        t1.reassignSeat(2, 1, 0, 0);
        
        for(int i=0;i<3;i++) 
        {
            for(int j=0;j<3;j++) 
            {
                System.out.print("["+i+"]"+"["+j+"] : "+t1.theaterSeats[i][j].isAvailable()+" ");
            }
    
            System.out.println();
        }
    }
}



Theater.java:
------------
public class Theater {
    
    public Seat[][] theaterSeats;
    
    /** Constructs a Theater object, as described in part (a).
    * Precondition: seatsPerRow > 0; tier1Rows > 0; tier2Rows >= 0
    */
    public Theater(int seatsPerRow, int tier1Rows, int tier2Rows)
    {  
        /* to be implemented in part (a) */
        theaterSeats = new Seat[tier1Rows + tier2Rows][seatsPerRow];
    }
    
    /** Returns true if a seat holder was reassigned from the seat at fromRow, fromCol
    * to the seat at toRow, toCol; otherwise it returns false, as described in part (b).
    * Precondition: fromRow, fromCol, toRow, and toCol represent valid row and
    * column positions in the theater.
    * The seat at fromRow, fromCol is not available.
    */
    public boolean reassignSeat(int fromRow, int fromCol, int toRow, int toCol) 
    {
        if(theaterSeats[toRow][toCol].isAvailable())
        {
            int tierDestination = theaterSeats[toRow][toCol].getTier();
            int tierSource = theaterSeats[fromRow][fromCol].getTier();
            
            if(tierDestination <= tierSource) 
            {
                if(tierDestination == tierSource) 
                {
                    if(fromRow < toRow) 
                    {
                        return false;
                        
                    } else {
                        theaterSeats[toRow][toCol].setAvailability(false);
                        theaterSeats[fromRow][fromCol].setAvailability(true);
                        return true;
                    }
                }
        
                theaterSeats[toRow][toCol].setAvailability(false);
                theaterSeats[fromRow][fromCol].setAvailability(true);
        
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}

ConsoleProgram.java:
----
import java.util.*;

public class ConsoleProgram{

    private Scanner scanner;

    public static void main(String[] args){
        // Assume the class name is passed in as the first argument.

        if(args.length == 0){
            System.out.println("Please provide the name of the main class as an argument.");
            return;
        }

        String mainClassName = args[0];

        try{
            Class mainClass = Class.forName(mainClassName);
            Object obj = mainClass.newInstance();
            ConsoleProgram program = (ConsoleProgram)obj;
            program.run();
        } catch (IllegalAccessException ex) {
            System.out.println("Error in program. Make sure you extend ConsoleProgram");
        } catch (InstantiationException ex) {
            System.out.println("Error in program. Make sure you extend ConsoleProgram");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error in program. Make sure you extend ConsoleProgram");
        }
    }

    public void run(){
        /* Overridden by subclass */
    }

    public ConsoleProgram(){
        scanner = new Scanner(System.in);

    }

    public String readLine(String prompt){
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public boolean readBoolean(String prompt){

        while(true){
            String input = readLine(prompt);

            if(input.equalsIgnoreCase("true")){
                return true;
            }

            if(input.equalsIgnoreCase("false")){
                return false;
            }
        }
    }

    public double readDouble(String prompt){

        while(true){
            String input = readLine(prompt);
            try {
                double n = Double.valueOf(input).doubleValue();
                return n;
            } catch (NumberFormatException e){

            }
        }
    }

    // Allow the user to get an integer.
    public int readInt(String prompt){

        while(true){
            String input = readLine(prompt);
            try {
                int n = Integer.parseInt(input);
                return n;
            } catch (NumberFormatException e){

            }
        }
    }

    /**
     * Allows us to use a shorthand version for System.out.println()
     */
    public void println() {
        System.out.println();
    }

    /**
     * Allows us to use a shorthand version for System.out.println(String s)
     */
    public void println(String s) {
        System.out.println(s);
    }

    /**
     * Allows us to use a shorthand version for System.out.println(boolean x)
     */
    public void println(boolean x) {
        System.out.println(x);
    }

    /**
     * Allows us to use a shorthand version for System.out.println(char x)
     */
    public void println(char x) {
        System.out.println(x);
    }

    /**
     * Allows us to use a shorthand version for System.out.println(char[] x)
     */
    public void println(char[] x) {
        System.out.println(x);
    }

    /**
     * Allows us to use a shorthand version for System.out.println(int x)
     */
    public void println(int x) {
        System.out.println(x);
    }

    /**
     * Allows us to use a shorthand version for System.out.println(long x)
     */
    public void println(long x) {
        System.out.println(x);
    }

    /**
     * Allows us to use a shorthand version for System.out.println(float x)
     */
    public void println(float x) {
        System.out.println(x);
    }

    /**
     * Allows us to use a shorthand version for System.out.println(double x)
     */
    public void println(double x) {
        System.out.println(x);
    }

    /**
     * Allows us to use a shorthand version for System.out.println(Object o)
     */
    public void println(Object o) {
        System.out.println(o);
    }

    /**
     * Allows us to use a shorthand version for System.out.print()
     */
    public void print() {
        System.out.print("");
    }

    /**
     * Allows us to use a shorthand version for System.out.print(String s)
     */
    public void print(String s) {
        System.out.print(s);
    }

    /**
     * Allows us to use a shorthand version for System.out.print(boolean x)
     */
    public void print(boolean x) {
        System.out.print(x);
    }

    /**
     * Allows us to use a shorthand version for System.out.print(char x)
     */
    public void print(char x) {
        System.out.print(x);
    }

    /**
     * Allows us to use a shorthand version for System.out.print(char[] x)
     */
    public void print(char[] x) {
        System.out.print(x);
    }

    /**
     * Allows us to use a shorthand version for System.out.print(int x)
     */
    public void print(int x) {
        System.out.print(x);
    }

    /**
     * Allows us to use a shorthand version for System.out.print(long x)
     */
    public void print(long x) {
        System.out.print(x);
    }

    /**
     * Allows us to use a shorthand version for System.out.print(float x)
     */
    public void print(float x) {
        System.out.print(x);
    }

    /**
     * Allows us to use a shorthand version for System.out.print(double x)
     */
    public void print(double x) {
        System.out.print(x);
    }

    /**
     * Allows us to use a shorthand version for System.out.print(Object o)
     */
    public void print(Object o) {
        System.out.print(o);
    }
}
