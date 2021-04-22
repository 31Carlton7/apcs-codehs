ExerciseTester.java:
-------------------
public class ExerciseTester
{
    public static void main(String[] args)
    {
        Exercise exercise1 = new Exercise();
        Exercise exercise2 = new Exercise("Who needs this anyways?", "Java", 9001);
        
        System.out.println(exercise1.getTitle());
        System.out.println(exercise2.getTitle());
    }
}


Exercise.java:
-------------
public class Exercise
{
    public String title = "JavaScript Exercise";
    public String programmingLanguage = "JavaScript";
    public int points = 100;
    
    // Default constructor.
    public Exercise() 
    {
        this.title = title;
        this.programmingLanguage = programmingLanguage;
        this.points = points;
    }
    
    // Edit code in this constructor.
    public Exercise(String title, String programmingLanguage, int points) 
    {
        this.title = title;
        this.programmingLanguage = programmingLanguage;
        this.points =  points;
    }
    
    public String getTitle() {
        return title;
    }
}
