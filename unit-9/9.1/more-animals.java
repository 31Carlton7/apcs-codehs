AnimalTester.java:
-----------------
public class AnimalTester
{
    public static void main(String[] args)
    {
        // Add code to test your hierarchy
        
    }
}


Pet.java:
--------
public class Pet extends Animal
{
    public String name, size;
    //animalType = "Pet";
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String newName)
    {
        name = newName;
    }
    
    public String getSize()
    {
        return size;
    }
    
    public void setSize(String newSize)
    {
        size = newSize;
    }
}


Animal.java:
-----------
public class Animal
{
   public String type;
   
   public String getType()
   {
      return type;
   }
}

Fish.java:
---------
public class Fish extends Pet
{
    private String waterType;
    
    public String getWaterType()
    {
        return waterType;
    }
    
    public void setWaterType(String newWaterType)
    {
        waterType = newWaterType;
    }
}


Dog.java:
--------
public class Dog extends Pet
{
   private boolean isTrained;
   
   public boolean getIsTrained()
   {
       return isTrained;
   }
   
   public void setIsTrained(boolean newIsTrained)
   {
       isTrained = newIsTrained;
   }
}

