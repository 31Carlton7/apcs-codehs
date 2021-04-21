StudentTester.java:
--------------------
public class StudentTester
{
    public static void main(String[] args)
    {
        Student alan = new Student("Alan", "Turing", 11, 3.5);
        Student ada = new Student("Ada", "Lovelace", 12, 3.8);
        
        System.out.println(alan);
        System.out.println(ada);
    }
}


Student.java:
--------------
public class Student
{
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private double gpa;
    
    public Student(String fName, String lName, int grade, double studentgpa)
    {
        firstName = fName;
        lastName = lName;
        gradeLevel = grade;
        gpa = studentgpa;
    }
    
    public String toString()
    {
        return firstName + " " + lastName + " is in grade: " + gradeLevel + " and has GPA: " + gpa;
    }
}
