Car.java:
--------
public class Car
{
    String name;
    String model;
    int cost;
    
    public Car(String name, String model, int cost)
    {
        this.name = name;
        this.model = model;
        this.cost = cost;
    }
}

CarTracker.java:
---------------
import java.util.ArrayList;
public class CarTracker
{
    public static void main(String[] args)
    {
        //Initialize your ArrayList here:
        ArrayList<Car> inventory = new ArrayList<Car>();
    }
}
