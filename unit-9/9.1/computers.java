ComputerTester.java:
-------------------
public class ComputerTester
{
    public static void main(String[] args)
    {
        Laptop macBook = new Laptop();
        macBook.setBatteryLife(8.5);
        
        Desktop dell = new Desktop();
        dell.setScreenSize(18);
        
        Computer surface = new Computer();
        surface.setScreenSize(11);
        
        System.out.println(macBook.getBatteryLife());
        System.out.println(dell.getScreenSize());
        System.out.println(surface.getScreenSize());
    }
}


Computer.java:
-------------
public class Computer
{
    public int screenSize;
    private int memory;
    public double batteryLife;
    public boolean monitor;
    
    public int getMemory()
    {
        return memory;
    }
    
    public void setMemory(int newMemory)
    {
        memory = newMemory;
    }
    
    public int getScreenSize()
    {
        return screenSize;
    }
    
    public void setScreenSize(int newScreenSize)
    {
        screenSize = newScreenSize;
    }
}


Desktop.java:
------------
public class Desktop extends Computer
{
    public boolean hasMonitor()
    {
        return monitor;
    }
}

Laptop.java:
-----------
public class Laptop extends Computer
{
    public double getBatteryLife()
    {
        return batteryLife;
    }
    
    public void setBatteryLife(double newBatteryLife)
    {
        batteryLife = newBatteryLife;
    }
}

