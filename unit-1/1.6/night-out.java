import java.util.*;

public class NightOut
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("How much did dinner cost? ");
        double dinnercost = input.nextDouble();
        
        System.out.println("How much is mini-golf for one person? ");
        double minigolfcost = input.nextDouble();
        
        System.out.println("How much did dessert cost? ");
        double dessertcost = input.nextDouble();
        
        System.out.println("Dinner: " + dinnercost);
        //int minigolfcostint = (int)minigolfcost;
        System.out.println("Mini-Golf: " + minigolfcost);
        System.out.println("Dessert: " + dessertcost);
        
        double minigolfcostdouble = minigolfcost*2;
        double grandtotal = dinnercost+minigolfcostdouble+dessertcost;
        
        System.out.println("Grand Total: " + grandtotal);
        
    }
}
