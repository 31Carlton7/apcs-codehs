Dog.java:
--------
public class Dog
{
    private String name;
    private int age;
    private double weight;

    // Add your constructors here
    public Dog(String nName, int nAge, double nWeight) {
        name = nName;
        age = nAge;
        weight = nWeight;
    }
    
    public Dog(String nName, int nAge) {
        name = nName;
        age = nAge;
        weight = 0.0;
    }

    public String toString() {
        return "Name: " + name + "\nWeight: " + weight +  "\nAge: " + age;
    }
}

DogTester.java:
--------------
public class DogTester
{
    public static void main(String[] args)
    {
        // Start here!
        Dog one = new Dog("Karel", 7, 15.6);
        Dog two = new Dog("Clover", 9);
        
        System.out.println(one);
        System.out.println(two);
    }
}

