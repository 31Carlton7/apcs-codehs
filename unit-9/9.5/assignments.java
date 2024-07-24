Assignment.java:
---------------
public class Assignment
{
    private String name;
    private double availablePoints;
    private double earnedPoints;
    
    public Assignment(String name, double availablePoints, double earnedPoints)
    {
        this.name = name;
        this.availablePoints = availablePoints;
        this.earnedPoints = earnedPoints;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    public void setAvailablePoints(double availablePoints)
    {
        this.availablePoints = availablePoints;
    }
    public double getAvailablePoints()
    {
        return this.availablePoints;
    }
    public void setEarnedPoints(double earnedPoints)
    {
        this.earnedPoints = earnedPoints;
    }
    public double getEarnedPoints()
    {
        return this.earnedPoints;
    }
}


Test.java:
---------
public class Test extends Assignment
{
    private String testDate;
    
    public Test(String name, double availablePoints, double earnedPoints, String testDate)
    {
        super(name, availablePoints, earnedPoints);
        this.testDate = testDate;
    }
    public void setTestDate(String testDate)
    {
        this.testDate = testDate;
    }
    public String getTestDate()
    {
        return this.testDate;
    }
}


AssignmentRunner.java:
---------------------
import java.util.*;
public class AssignmentRunner
{
    public static void main(String[] args)
    {
        ArrayList<Assignment> assignments = new ArrayList<Assignment>();
        Scanner sc = new Scanner(System.in);
        
        //keep looping until it's exited by the `break` statement
        while(true)
        {
            System.out.print("Please enter an assignment name (exit to quit): ");
            String name = sc.nextLine();
            if(name.equals("exit")) {
                break;
            }
            System.out.print("Please enter the available points: ");
            double pointTotal = sc.nextDouble();
            sc.nextLine();
            /*consume the ghost line formed by the scanner's tokenizer*/
             
            System.out.print("Please enter the earned points: ");
            double pointsEarned = sc.nextDouble();
            sc.nextLine();
            /*consume the ghost line formed by the scanner's tokenizer*/
             
            System.out.print("Is this a (t)est or (p)roject: ");
            String type = sc.nextLine();
            
            if(type.equals("t"))
            {
                System.out.print("Please enter the test date: ");
                String testDate = sc.nextLine();
                
                Test test = new Test(name, pointTotal, pointsEarned, testDate);
                assignments.add(test);
            }
            else
            {
                System.out.print("Please enter the due date: ");
                String dueDate = sc.nextLine();
                
                System.out.print("Group project? true or false: ");
                boolean groups = sc.nextBoolean();
                sc.nextLine();
                /*consume the ghost line formed by the scanner's tokenizer*/
                 
                Project project = new Project(name, pointTotal, pointsEarned, dueDate, groups);
                assignments.add(project);
            }
        }
        System.out.print("Your average: ");
        System.out.print(average(assignments));
        
    }
    public static double average(ArrayList<Assignment> assignments)
    {
        double totalPointsEarned = 0;
        double totalPointsAvailable = 0;
        
        for(Assignment a : assignments)
        {
            totalPointsEarned += a.getEarnedPoints();
            totalPointsAvailable += a.getAvailablePoints();
        }
        return 100 * (totalPointsEarned / totalPointsAvailable);
    }
}


Project.java:
------------
public class Project extends Assignment
{
    private String dueDate;
    private boolean groups;
    
    public Project(String name, double availablePoints, double earnedPoints, String dueDate, boolean groups)
    {
        super(name, availablePoints, earnedPoints);
        this.dueDate = dueDate;
        this.groups = groups;
    }
    public void setDueDate(String dueDate)
    {
        this.dueDate = dueDate;
    }
    public String getDueDate()
    {
        return this.dueDate;
    }
    public void setGroups(boolean groups)
    {
        this.groups = groups;
    }
    public boolean getGroups()
    {
        return this.groups;
    }
}
