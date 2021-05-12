PersonRunner.java:
-----------------
public class PersonRunner
{
    public static void main(String[] args)
    {
        // Start here!
        Person thomasE = new Person("Thomas Edison", "February 11, 1847");
        Student albertE = new Student("Albert Einstein", "March 14, 1879", 12, 5.0);
        
        System.out.println(thomasE.getName() + " " + thomasE.getBirthday());
        System.out.println(albertE.getName() + " " + albertE.getBirthday() + " " + albertE.getGrade() + " " + albertE.getGpa());
        
    }
}

Student.java:
------------
public class Student extends Person {

    private int grade;
    private double gpa;

    public Student(String name, String birthday, int grade, double gpa){
        super(name, birthday);
        this.grade = grade;
        this.gpa = gpa;
    }

    public int getGrade(){
        return grade;
    }

    public double getGpa(){
        return gpa;
    }
}


Person.java:
-----------
public class Person {

    private String name;
    private String birthday;

    public Person (String name, String birthday)
    {
        this.name = name;
        this.birthday = birthday;
    }

    public String getBirthday(){ 
        return birthday;
    }

    public String getName(){
        return name;
    }


}
