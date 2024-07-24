PersonTester.java:
-----------------
import java.util.Scanner;
public class PersonTester
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter the Person's name: ");
        String p1name = sc.nextLine();
        System.out.print("Please enter the Person's birthday: ");
        String p1bday = sc.nextLine();
        
        Person p1 = new Person(p1name, p1bday);
        
        System.out.print("Please enter the Student's name: ");
        String p2name = sc.nextLine();
        System.out.print("Please enter the Student's birthday: ");
        String p2bday = sc.nextLine();
        System.out.print("Please enter the Student's grade: ");
        int p2grade = sc.nextInt();
        
        Student p2 = new Student(p2name, p2bday, p2grade);
        
        System.out.println("Same: " + p1.equals(p2));
        
    }
}


Student.java:
------------
public class Student extends Person
{
    private int grade;
    
    public Student(String name, String birthday, int grade)
    {
        super(name, birthday);
        this.grade = grade;
    }
    public int getGrade()
    {
        return grade;
    }
}

Person.java:
-----------
public class Person
{
    private String name;
    private String birthday;
    
    public Person(String name, String birthday)
    {
        this.name = name;
        this.birthday = birthday;
    }
    public String getBirthday()
    {
        return birthday;
    }
    public String getName()
    {
        return name;
    }
    public boolean equals(Person other)
    {
        return other.getBirthday().equals(birthday) && other.getName().equals(name);
    }
}
