FoodTester.java:
---------------
public class FoodTester
{
    public static void main(String[] args)
    {
        // Start here!
        Fruit myFruit = new Fruit("Apple", 120, true, "Red");
        Fruit myFruitTwo = new Fruit("Banana", 140, true, "Yellow");
        
        System.out.println(myFruit);
        System.out.println(myFruitTwo);
    }
}

HealthyFood.java:
----------------
public class HealthyFood extends Food
{
    public String group;
    
    public HealthyFood(String name, int calories, String group)
    {
        super(name, calories);
        this.group = group;
    }
    
    public String getGroup()
    {
        return group;
    }
}


Food.java:
---------
public class Food
{
    public String name;
    public int calories;
    
    public Food(String name, int calories)
    {
        this.name = name;
        this.calories = calories;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getCal()
    {
        return calories;
    }
    
    public String toString()
    {
        return name + " has " + calories + " calories";
    }
}


Fruit.java:
----------
public class Fruit extends HealthyFood
{
    private boolean isLocal;
    private String color;
    
    public Fruit(String name, int calories, boolean isLocal, String color)
    {
        super(name, calories, "Fruit");
        this.isLocal = isLocal;
        this.color = color;
    }
    
    public boolean isLocal()
    {
        return isLocal;
    }
    
    public String getColor()
    {
        return color;
    }
}

