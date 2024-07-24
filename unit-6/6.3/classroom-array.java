Student.java:
------------
/**
 * The Student class holds data about a student.
 * The fields are firstName, lastName, and grade.
 */
public class Student
{
    // Attributes
    private String firstName;
    private String lastName;
    private int gradeLevel;
    
    // Constructor
    public Student(String fName, String lName, int grade)
    {
        firstName = fName;
        lastName = lName;
        gradeLevel = grade;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    // new getter
    public String getLastName()
    {
        return lastName;
    }
    // new getter
    public int getGradeLevel()
    {
        return gradeLevel;
    }
    
    /*
    public String toString()
    {
        return firstName + " " + lastName + " is in grade: " + gradeLevel;
    }
    */
}

ClassRoster.java:
----------------
public class ClassRoster
{
    public static void main(String[] args)
    {
        Student julian = new Student("Julian", "Jones", 9);
        Student larisa = new Student("Larisa", "Torres", 10);
        Student amada = new Student("Amada", "Robin", 10);
        Student mikka = new Student("Mikka", "Leads", 9);
        Student jay = new Student("Jay", "Khalil", 10);
        
        Student[] classroom = {julian, larisa, amada, mikka, jay};

        // for each for printing goes here 
        for(Student student : classroom)
        {
            System.out.println(student.getFirstName() + " " + student.getLastName() + " is in grade " + student.getGradeLevel());
        }
    }
}

