StudentTester.java:
------------------
public class StudentTester
{
    public static void main(String[] args)
    {
        
        /**
        * Create a student in the class of 2020
        */
        Student myStudent = new Student("Hudson", 2020);
         
         
        /**
        * Create a student athlete in the class of 2022
        * that is eligible and plays soccer.
        */
        StudentAthlete myStudentAthlete = new StudentAthlete("Carlton", 2022, "Soccer", true);
         
         
        // Print out both objects
        System.out.println(myStudent);
        System.out.println(myStudentAthlete);
    }
}


StudentAthlete.java:
-------------------
public class StudentAthlete extends Student
{
    private String sport;
    private boolean eligible;
    
   // Add the constructor here
   public StudentAthlete(String name, int classYear, String sport, boolean eligible)
   {
       super(name, classYear);
       this.sport = sport;
       this.eligible = eligible;
   }
   
   
   public String getSport(){
       return sport;
   }
   
   public boolean isEligible(){
       return eligible;
   }
    
    @Override
    public String toString(){
        return super.getName() + ", class of " + super.getClassYear() +
            ", plays " + sport;
    }
}


Student.java:
------------
public class Student
{
    private String name;
    private int classYear;
   
   // Constructor goes here
   public Student(String name, int classYear)
   {
       this.name = name;
       this.classYear = classYear;
   }
   
   
    public String getName(){
       return name;
    }
   
    public int getClassYear(){
       return classYear;
    }
   
    public String toString(){
        return name + ", class of " + classYear;
    }
}
