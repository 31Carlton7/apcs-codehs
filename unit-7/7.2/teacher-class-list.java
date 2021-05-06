ClassListTester.java:
--------------------
public class ClassListTester
{
    public static void main(String[] args)
    {
        //You don't need to change anything here, but feel free to add more Students!
        Student alan = new Student("Alan", 11);
        Student kevin = new Student("Kevin", 10);
        Student annie = new Student("Annie", 12);
        System.out.println(Student.printClassList());
    }
}

Student.java:
------------
import java.util.ArrayList;
public class Student
{
    private String name;
    private int grade;
    //Implement classList here:
    static ArrayList<Student> classList;
    
    public Student(String name, int grade)
    {
        this.name = name;
        this.grade = grade;
        this.classList = new ArrayList<Student>();
    }
    
    public String getName()
    {
        return this.name;
    }
    
    /*Don't change the code in this method!
    This method will print out all the Student names in the classList Array
    */
    public static String printClassList()
    {
        String names = "";
        for(Student name: classList)
        {
            names+= name.getName() + "\n";
        }
        return "Student Class List:\n" + names;
    }
}
