FoodRunner.java:
---------------
import java.util.Scanner;

public class FoodRunner
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner input = new Scanner(System.in);
        Food hamburgers = new Food("Hamburgers", 600);
        Food frenchfries = new Food("French Fries", 350);
        Food coke = new Food("Coke", 200);
        
        System.out.println(hamburgers);
        System.out.println("How many would you like? ");
        int numhamburgers = input.nextInt() * 600;
        
        System.out.println(frenchfries);
        System.out.println("How many would you like? ");
        int numfrenchfries = input.nextInt() * 350;
        
        System.out.println(coke);
        System.out.println("How many would you like? ");
        int numcoke = input.nextInt() * 200;
        
        System.out.println("Your meal will have a total of " + (numhamburgers + numfrenchfries + numcoke) + " calories");
        
        
    }
}

Food.java:
---------
public class Food
{
        //Declare instance variables
        private String name;
        private int calories;
        
        //Create Food Constructor
        public Food(String fName, int fCalories)
        {
            name = fName;
            calories = fCalories;
        }
        
        //Add getter and setter methods for calories
        public int getCalories()
        {
            return calories;
        }
        
        public int setCalories(int newCalories)
        {
            calories = newCalories;
            return newCalories;
        }
        
        //Add getter and setter methods for name
        public String getName()
        {
            return name;
        }
        
        public String setName(String newName)
        {
            name = newName;
            return newName;
        }
        
        // Add toString method
        public String toString() 
        {
            return name + " have " + calories + " calories.";
        }
    
}

