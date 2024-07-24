LoudDog.java:
------------
public class LoudDog extends Dog
{
   
   public LoudDog(String name){
       super(name);
   }
   
   // Override the speak method here
   @Override
   public String speak(){
       return "BARK!";
   }
   
   
   //Override the toString here.
   //Remember, you can access the name using super.getName()
   public String toString(){
       return super.getName() + " is loud and likes to " + speak();
   }
}


Dog.java:
--------
public class Dog
{
    private String name;
    
     public Dog(String name){
       this.name = name;
   }
   
   public String getName(){
       return name;
   }
   
   public String speak(){
       return "Bark!";
   }
   
   public String toString(){
       return name + " likes to " + speak();
   }
}


DogTester.java:
--------------
public class DogTester
{
    public static void main(String[] args)
    {
        // Start here
        Dog myDog = new Dog("Jerry");
        LoudDog myLoudDog = new LoudDog("Jeffrey");
        
        System.out.println(myDog);
        System.out.println(myLoudDog);
    }
}
