Construction.java:
-----------------
public class Construction
{
    
    private double lumber;  // price per board 
    private double windows; // price per square inch of window
    private double taxRate; 
   
    
    public Construction(double lumberCost, double windowCost, double taxes)
    {
        lumber = lumberCost;
        windows = windowCost;
        taxRate = taxes;
    }
    
    // Computes and returns the cost
    // of the lumber
    public double lumberCost(int numBoards)
    {
        return lumber * numBoards;   
    }
    
    // Computes and returns the cost of the windows
    public double windowCost(int numWindows)
    {
        return windows * numWindows;   
    }
    
    // Computes the grand total by adding
    // the tax amount to the total
    public double grandTotal(double total)
    {
        return total * (1 + taxRate);
    }
    
}


ConstructionTester.java:
-----------------------
import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the sales tax rate: ");
        double tRate = input.nextDouble();
        
        System.out.println("How many boards do you need? ");
        int nBoards = input.nextInt();
        
        System.out.println("How many windows do you need? ");
        int nWindows = input.nextInt();
        
        Construction construction = new Construction(8.0, 11.0, tRate);
        
        double lumbcost = construction.lumberCost(nBoards);
        double windcost = construction.windowCost(nWindows);
        
        double total = lumbcost+windcost;
        double grtotal = construction.grandTotal(total);
        
        System.out.println("Total: " + total);
        System.out.print("Grand Total: " + grtotal);
        
        
    }
}

