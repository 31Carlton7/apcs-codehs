ActivityTracker.java:
--------------------
public class ActivityTracker
{
    public static void main(String[] args)
    {
        ActivityLog mylog = new ActivityLog();
        
        mylog.addMiles(5);
        mylog.addHours(1);
        
        System.out.print("Total Miles: ");
        System.out.println(mylog.getMiles());
        
        double hoursToday = mylog.getHours();
        
        mylog.addHours(1.5);
        mylog.addHours(3);
        
        double increase = mylog.getHours() - hoursToday;
        
        System.out.print("There are ");
        System.out.print(increase);
        System.out.println(" more hours today than two days ago");
    }
}


ActivityLog.java:
----------------
public class ActivityLog
{
    // Create 2 new doubles
    private double numHours;
    private double numMiles;
    
    // Create constructor and set values equal to 0
    public ActivityLog()
    {
        numHours = 0;
        numMiles = 0;
    }
    
    // Create addHours<void>
    public void addHours(double hours)
    {
        numHours += hours;
    }
    
    // Create addMiles<void>
    public void addMiles(double miles)
    {
        numMiles += miles;
    }
    
    // Create a getter for miles
    public double getMiles()
    {
        return numMiles;
    }
    
    //Create getter for hours
    public double getHours() 
    {
        return numHours;
    }
    
}
