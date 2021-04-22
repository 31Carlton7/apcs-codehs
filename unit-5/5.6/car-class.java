Car.java:
--------
public class Car {

    // Start here
    private double efficiency; // this is miles per gallon
    private double gas;
    private double tankCapacity;
    private double totalMilesDriven;
    
    public Car(double carEfficiency, double carTankCapacity)
    {
        efficiency = carEfficiency;
        tankCapacity = carTankCapacity;
    }
    
    public void addGas()
    {
        gas = tankCapacity;
        System.out.println("Filling up ...");
    }
    
    public void addGas(double amount)
    {
        if((gas += amount) < tankCapacity)
        {
            System.out.println("Adding gas ...");
        }
        else
        {
            gas = tankCapacity;
            System.out.println("Filling up ...");   
        }
    }
    
    public double getTotalMilesDriven()
    {
        return totalMilesDriven;
    }
    
    public void drive(double distance)
    {
        if(canDrive(distance))
        {
            totalMilesDriven += distance;
            gas -= (distance / efficiency);
            
            System.out.println("Driving " + distance);
        }
        else
        {
            System.out.println("Can't drive " + distance + ". That's too far!");
        }
    }
    
    public boolean canDrive(double distance)
    {
        if(milesAvailable() >= distance)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public double milesAvailable()
    {
        return gas * efficiency;
    }
    
    public double getGas()
    {
        return gas;
    }
}

CarTester.java:
--------------
public class CarTester {

    public static void main(String[] args) {
        //Create a car that gets 20 mpg and has a 15 gallon tank
        Car car = new Car(20.0, 15.0);
        
        //Fill up the gas tank
        car.addGas();
        
        //Check the miles available
        System.out.println("Miles available: " + car.milesAvailable());

        //Drive 100 miles
        car.drive(100.0);

        //Check the miles available
        System.out.println("Miles available: " + car.milesAvailable());

        //Add 2 gallons to the gas tank
        car.addGas(2.0);

        //Check the miles available
        System.out.println("Miles available: " + car.milesAvailable());
        
        //Try driving more miles than available by driving 1000 miles
        car.drive(1000);

        //Drive 200 miles
        car.drive(200);

        //Check how much gas you have left
        System.out.println("Gas remaining: " + car.getGas());

        //Print total miles driven
        System.out.println("Total Miles Driven: " + car.getTotalMilesDriven());

    }
}

