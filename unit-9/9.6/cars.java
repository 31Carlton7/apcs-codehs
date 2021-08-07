CarTester.java:
--------------
import java.util.*;
public class CarTester
{
    public static void main(String[] args)
    {
        ArrayList<Car> cars = new ArrayList<Car>();
        
        Scanner sc = new Scanner(System.in);
        
        //keep looping until the user exits with the `break;` statement
        while(true)
        {
            System.out.println("Please enter a car model name(exit to quit): ");
            String name = sc.nextLine();
            if(name.equals("exit")) {
                break;
            }
            System.out.println("Is this car electric? (y or n) ");
            String electric = sc.nextLine();
            
            if(electric.equals("y"))
            {
                ElectricCar electricCar = new ElectricCar(name);
                cars.add(electricCar);
            }
            else
            {
                System.out.println("How many miles per gallon: ");
                //you'd think you'd want a double, but it represents it as strings for some reason. idk.
                String mpg = sc.nextLine();
                
                Car car = new Car(name, mpg);
                cars.add(car);
            }
        }
        //print out each car
        for(Car c : cars)
        {
            System.out.println("Car: " + c.getModel());
            System.out.println("MPG: " + c.getMPG());
            System.out.println("");
        }
    }
}


ElectricCar.java:
----------------
public class ElectricCar extends Car
{
    // Complete the constructor
    public ElectricCar(String model)
    {
        super(model, "Electric cars do not calculate MPG.");
    }
    // Override the getMPG here.
    // It should return: "Electric cars do not calculate MPG.
    @Override
    public String getMPG()
    {
        return "Electric cars do not calculate MPG";
    }
    // Override the toString() here.
    // (model) is an  electric car.
    @Override
    public String toString()
    {
        return super.getModel() + " is an electric car.";
    }
}


Car.java:
--------
public class Car
{
    //This code is complete
    private String model;
    private String mpg;
    
    public Car(String model, String mpg)
    {
        this.model = model;
        this.mpg = mpg;
    }
    public String getModel()
    {
        return model;
    }
    public String getMPG()
    {
        return mpg;
    }
    public String toString()
    {
        return model + " gets " + mpg + " mpg.";
    }
}
