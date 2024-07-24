FlowerTester.java:
-----------------
public class FlowerTester
{
    public static void main(String[] args)
    {
       Flower foxglove = new Flower("Foxglove", "Red", "Digitalis", "obscura");
        System.out.println(foxglove);
    }
}

Flower.java:
-----------
public class Flower
{

    private String name;
    private String color;
    private String genus;
    private String species;

    public Flower(String theName, String theColor, String theGenus, String theSpecies)
    {
        name = theName;
        color = theColor;
        genus = theGenus;
        species = theSpecies;
    }
    
    public String toString()
    {
        return color + " " + name + " (" + genus + " " + species + ")";
    }
}


