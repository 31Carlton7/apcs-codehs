CarTester.java:
--------------
public class CarTester
{
    public static void main(String[] args)
    {
        // Create a Car object
        Car myCar = new Car("Mclaren P1", "34.7");
        
        // Print out the model
        System.out.println(myCar.getModel());
        
        // Print out the MPG
        System.out.println(myCar.getMPG());
        
        // Print the object
        System.out.println(myCar);
        
        // Create an ElectricCar object
        ElectricCar myElectricCar = new ElectricCar("Tesla Roadster");
        
        // Print out the model
        System.out.println(myElectricCar.getModel());
        
        // Print out the MPG
        System.out.println(myElectricCar.getMPG());
        
        // Print the object
        System.out.println(myElectricCar);
    }
}

Car.java:
--------
public class Car {

    //This code is complete
    private String model;
    private String mpg;

    public Car(String model, String mpg){
        this.model = model;
        this.mpg = mpg;
    }

    public String getModel(){
        return model;
    }

    public String getMPG(){
        return mpg;
    }

    public String toString(){
        return model + " gets " + mpg + " mpg.";
    }
}


ElectricCar.java:
----------------
public class ElectricCar extends Car {

    // Complete the constructor
    public ElectricCar(String model)
    {
       super(model, "None");
    }

    // Override the getMPG here.
    // It should return: "Electric cars do not calculate MPG.
    @Override
    public String getMPG(){
        return "Electric cars do not calculate MPG.";
    }

    // Override the toString() here.
    // (model) is an  electric car.
    @Override
    public String toString(){
        return super.getModel() + " is an electric car.";
    }
    
}

