ActivityLog.java:
----------------
public class ActivityLog
{
    private double numHours;
    private double numMiles;
    
    public ActivityLog()
    {
        numHours = 0;
        numMiles = 0;
    }
    
    public void addHours(double hours)
    {
        numHours += hours;
    }
    
    public void addMiles(double miles)
    {
        numMiles += miles;
    }
    
    public double getMiles()
    {
        return numMiles;
    }
    
    public double getHours() 
    {
        return numHours;
    }
    
}


ActivityTracker.java:
--------------------
public class ActivityTracker
{
    public static void main(String[] args)
    {
        // Create instance of "ActivityLog"
        ActivityLog mylog = new ActivityLog();
        
        // Call "addMiles()" method
        mylog.addMiles(5);
        
        // Call "addMiles()" method
        mylog.addHours(1);
        
        // Print total miles...
        System.out.print("Total Miles: ");
        
        // Using the "getMiles()" method 
        System.out.println(mylog.getMiles());
        
        // Create new double and set equal to "myLog.getHours()""
        double hoursToday = mylog.getHours();
        
        // Call "addHours()" method
        mylog.addHours(1.5);
        
        // Call "addHours()" method
        mylog.addHours(3);
        
        // Create new double and set equal to "myLog.getHours()
        // - hoursToday"
        double increase = mylog.getHours() - hoursToday;
        
        // Print increase
        System.out.print("There are ");
        System.out.print(increase);
        System.out.println(" more hours today than two days ago");
    }
}
