Racecar.java:
------------
public class Racecar
{
    private double accel; // acceleration
    private String name; // name of driver

    public Racecar(double acceleration, String driver)
    {
        accel = acceleration;
        name = driver;
    }

    // Returns the time it takes the racecar
    // to complete the track
    public double computeTime(double distance)
    {
        double time = Math.sqrt((2*distance)/accel);
        time = Math.round(time * 100.0) / 100.0;
        return time;
    }

    public String toString()
    {
        return "Racer " + name;
    }
}

RaceMain.java:
-------------
public class RaceMain
{
    public static void main(String[] args)
    {
        // Length of the course in meters
        double distance = 2414; // ~ 1.5 miles
        
        // Generate a random acceleration for each car
        double newAccel = (int)(Math.random() + 1);
        
        // Create two Racecar objects
        Racecar racerone = new Racecar(newAccel, "Lewis Hamilton");
        Racecar racertwo = new Racecar(newAccel, "Michael Schumacher");
        
        // Compute the finishing times for both cars
        double rOneTime = racerone.computeTime(distance);
        double rTwoTime = racertwo.computeTime(distance);
        
        // Print times of each car
        System.out.println("First car finished in " + rOneTime + " Seconds");
        System.out.println("Second car finished in " + rTwoTime + " Seconds");
    }
}


