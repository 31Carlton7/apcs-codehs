PieTester.java:
--------------

import java.util.ArrayList;
public class PieTester
{
    public static void main(String[] args)
    {
        Pie[] pies = new Pie[] {new Pie("Blueberry", 3), new PumpkinPie(4, true), new ApplePie(12)};
        
        for(Pie pie : pies)
        {
            System.out.println("Pie: " + pie.getType());
        }
    }
}


Pie.java:
--------
public class Pie
{
    private String type;
    private int slices;
    
    public Pie(String type, int slices)
    {
        this.type = type;
        this.slices = slices;
    }
    public int getSlices()
    {
        return slices;
    }
    public void eatSlice()
    {
        slices--;
    }
    public String getType()
    {
        return type;
    }
}


ApplePie.java:
-------------

public class ApplePie extends Pie
{
    public ApplePie(int slices)
    {
        super("Apple", slices);
    }
    public boolean hasSlice()
    {
        return super.getSlices() > 0;
    }
    @Override
    public void eatSlice()
    {
        if(this.hasSlice())
        {
            super.eatSlice();
        }
    }
}

PumpkinPie.java:
---------------
public class PumpkinPie extends Pie
{
    private boolean canned;
    
    public PumpkinPie(int slices, boolean canned)
    {
        super("Pumpkin", slices);
        this.canned = canned;
    }
    public boolean canned()
    {
        return canned;
    }
}
