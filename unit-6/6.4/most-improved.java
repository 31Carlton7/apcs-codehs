Student.java:
------------
public class Student
{
    private static final int NUM_EXAMS = 4;
    
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private double gpa;
    
    private int[] exams;
    private int numExamsTaken;
    
    /**
     * This is a constructor.  A constructor is a method
     * that creates an object -- it creates an instance
     * of the class. What that means is it takes the input
     * parameters and sets the instance variables (or fields)
     * to the proper values.
     *
     * Check out StudentTester.java for an example of how to use
     * this constructor.
     */
    public Student(String fName, String lName, int grade)
    {
        firstName = fName;
        lastName = lName;
        gradeLevel = grade;
        exams = new int[NUM_EXAMS];
        numExamsTaken = 0;
    }
    public int getExamRange()
    {
        int min = Integer.MAX_VALUE;
        for(int m : exams)
        {
            min = Math.min(min, m);
            
        }
        int max = Integer.MIN_VALUE;
        for(int m : exams)
        {
            max = Math.max(max, m);
            
        }
        return max - min;
    }
    public String getName()
    {
        return firstName + " " + lastName;
    }
    public void addExamScore(int score)
    {
        exams[numExamsTaken] = score;
        numExamsTaken++;
    }
    // This is a setter method to set the GPA for the Student.
    public void setGPA(double theGPA)
    {
        gpa = theGPA;
    }
    /**
     * This is a toString for the Student class. It returns a String
     * representation of the object, which includes the fields
     * in that object.
     */
    public String toString()
    {
        return firstName + " " + lastName + " is in grade: " + gradeLevel;
    }
}

ClassroomTester.java:
--------------------
public class ClassroomTester 
{
    public static void main (String[] args)
    {
        Classroom c = new Classroom(2);
        
        Student ada = new Student("Ada", "Lovelace", 12);
        ada.addExamScore(44);
        ada.addExamScore(65);
        ada.addExamScore(77);

        Student alan = new Student("Alan", "Turing", 11);
        alan.addExamScore(38);
        alan.addExamScore(24);
        alan.addExamScore(31);

        // add students to classroom
        c.addStudent(ada);
        c.addStudent(alan);
        c.printStudents();
        
        Student mostImproved = c.getMostImprovedStudent();
        System.out.println("The most improved student is " + mostImproved.getName());
    }
}


Classroom.java:
--------------
public class Classroom
{
    Student[] students;
    int studentsAdded;
    
    public Classroom(int students)
    {
        this.students = new Student[students];
        studentsAdded = 0;
    }
    public Student getMostImprovedStudent()
    {
        int mostImprovedRange = Integer.MIN_VALUE;
        Student mostImprovedStudent = students[0];
        
        for(Student s : students)
        {
            if(s == null) {
                continue;
            }
            int range = s.getExamRange();
            if(range > mostImprovedRange)
            {
                mostImprovedStudent = s;
                mostImprovedRange = range;
            }
        }
        return mostImprovedStudent;
    }
    public void addStudent(Student s)
    {
        students[studentsAdded] = s;
        studentsAdded++;
    }
    public void printStudents()
    {
        for(int i = 0; i < studentsAdded; i++)
        {
            System.out.println(students[i]);
        }
    }
}
