Routine.java:
------------
public class Routine
{
    public double sleep, fun, school, sports;
    
    public Routine()
    {
        this.sleep = 0;
        this.fun = 0;
        this.school = 0;
        this.sports = 0;
    }
    
    public void setSleep(double hoursSleep)
    {
        sleep = hoursSleep;
    }
    
    public void setFun(double hoursFun)
    {
        fun = hoursFun;
    }
    
    public void setSchool(double hoursSchool)
    {
        school = hoursSchool;
    }
    
    public void setSports(double hoursSports)
    {
        sports = hoursSports;
    }
    
    public void printTotal()
    {
        double grandTotal = sleep + school + sports + fun;
        double leftOver = 168.0 - grandTotal*7;
        
        System.out.println("Weekly Totals");
        if(sleep != 0)
        {
            System.out.println("Sleep: " + sleep*7);
        }  
        if (school != 0) 
        {
            System.out.println("School: " + school*7);
        }  
        if (sports != 0) 
        {
            System.out.println("Sports: " + sports*7);
        }  
        if (fun != 0) 
        {
            System.out.println("Fun: " + fun*7);
        }  
        if (grandTotal != 0) 
        {
            System.out.println("Grand Total: " + grandTotal*7);
        }  
        if(leftOver != 0) 
        {
            System.out.println("Hours left over: " + leftOver);
        }
    }
}

RoutineTester.java:
------------------
public class RoutineTester
{
    public static void main(String[] args) 
    {
        Routine myWeek = new Routine();
        
        myWeek.setSchool(8);
        myWeek.setSports(3);
        myWeek.setSleep(8);
        myWeek.setFun(2);
        
        // Prints the totals for the WHOLE WEEK
        myWeek.printTotal();
    }
}

