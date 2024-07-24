Student.java:
------------
import java.util.ArrayList;

public class Student
{
    private String name;
    private int grade;
    //Implement classList here:
    private static ArrayList<Student> classList = new ArrayList<Student>();
    
    public Student(String name, int grade)
    {
        this.name = name;
        this.grade = grade;
        classList.add(this);
    }
    
    public String getName()
    {
        return this.name;
    }
    //Add the static methods here:
    static String getLastStudent()
    {
        Student student = classList.get(classList.size() - 1);
        return student.getName();
    }
    
    static Integer getClassSize()
    {
        return classList.size();
    }
    
    static void addStudent(int index, Student student)
    {
        classList.add(index, student);
        classList.remove(classList.size() - 1);
    }
    
    static String getStudent(int index)
    {
        Student student = classList.get(index);
        return student.getName();
    }


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
        
        System.out.println(Student.getLastStudent());
        System.out.println(Student.getStudent(1));
    
        Student.addStudent(2, new Student("Trevor", 12));
        System.out.println(Student.printClassList());
        System.out.println(Student.getClassSize());
    }   
}
