HSStudent.java:
--------------
public class HSStudent extends StudentTest
{
    private int serviceHours;
    
    public HSStudent(String name, int mathScore, int elaScore, int serviceHours)
    {
        super(name, mathScore, elaScore);
        this.serviceHours = serviceHours;
        
    }
    public int getServiceHours()
    {
        return serviceHours;
    }
    public void setServiceHours(int serviceHours)
    {
        this.serviceHours += serviceHours;
        
    }
    // If math score is at least 525, return true
    public boolean passMath()
    {
        return super.getMathScore() >= 525;
    }
    // If ela score is at least 560, return true
    public boolean passEla()
    {
        return super.getElaScore() >= 525;
    }
    // If service hours are at least 75, return true
    public boolean completeService()
    {
        return serviceHours >= 75;
    }
    // If the student has passed math, passed ela, and completed
    // service hours, return true.
    public boolean gradQualify()
    {
        return passMath() && passEla() && completeService();
    }
    // If the student has qualified for graduation, print:
    // (name) has qualified for graduation.
    // Otherwise print:
    // (name) has not yet qualified for graduation.
    // Where (name) is the student's name.
    public String toString()
    {
        if(gradQualify())
        {
            return super.getName() + " has qualified for graduation.";
        }
        return super.getName() + " has not yet qualified for graduation.";
    }
}

StudentTest.java:
----------------
public class StudentTest
{
    private int mathScore;
    private int elaScore;
    private String name;
    
    public StudentTest(String name, int mathScore, int elaScore)
    {
        this.name = name;
        this.mathScore = mathScore;
        this.elaScore = elaScore;
    }
    public int getMathScore()
    {
        return mathScore;
    }
    public void setMathScore(int mathScore)
    {
        this.mathScore = mathScore;
    }
    public int getElaScore()
    {
        return elaScore;
    }
    public void setElaScore(int elaScore)
    {
        this.elaScore = elaScore;
    }
    public String getName()
    {
        return name;
    }
}


StudentTester.java:
------------------
import java.util.Scanner;
public class StudentTester
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user for name, test scores, and service hours
        System.out.println("Please enter the student name: ");
        String name = sc.nextLine();
        
        System.out.println("Please enter the Math Score: ");
        int mathScore = sc.nextInt();
        
        System.out.println("Please enter the Ela Score: ");
        int elaScore = sc.nextInt();
        
        System.out.println("Please enter the Service Hours: ");
        int hours = sc.nextInt();
        
        // Create a HSStudent object
        HSStudent student = new HSStudent(name, mathScore, elaScore, hours);
        
        // Print the results
        System.out.println("Pass Math? " + student.passMath());
        System.out.println("Pass ELA? " + student.passEla());
        System.out.println("Completed Service Hours? " + student.completeService());
        
        System.out.println(student.toString());
    }
}
