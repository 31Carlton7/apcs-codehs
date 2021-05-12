InstrumentTester.java:
---------------------
public class InstrumentTester
{
    public static void main(String[] args)
    {
        /**
         * Don't Change This Tester Class!
         * 
         * When you are finished, this should run without error.
         */ 
        Wind tuba = new Wind("Tuba", "Brass", false);
        Wind clarinet = new Wind("Clarinet", "Woodwind", true);
        
        Strings violin = new Strings("Violin", true);
        Strings harp = new Strings("Harp", false);
        
        System.out.println(tuba);
        System.out.println(clarinet);
        
        System.out.println(violin);
        System.out.println(harp);
    }
}

Strings.java:
------------
public class Strings extends Instrument
{
    private boolean usesBow;
    
    public Strings(String name, boolean usesBow)
    {
        super(name, "Strings");
        this.usesBow = usesBow;
    }
    
    public boolean getUsesBow()
    {
        return usesBow;
    }
    
    public void setUsesBow(boolean usesBow)
    {
        this.usesBow = usesBow;
    }
}


Instrument.java:
---------------
public class Instrument
{
    public String name, family;
    
    public Instrument(String name, String family)
    {
        this.name = name;
        this.family = family;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getFamily()
    {
        return family;
    }
    
    public void setFamily(String family)
    {
        this.family = family;
    }
    
    public String toString()
    {
        return name + " is a member of the " + family + " family";
    }
}


Wind.java:
---------
public class Wind extends Instrument
{
    private boolean usesReed;
    
    public Wind(String name, String family, boolean usesReed)
    {
        super(name, family);
        this.usesReed = usesReed;
    }
    
    public boolean getUsesReed()
    {
        return usesReed;
    }
    
    public void setUsesReed(boolean usesReed)
    {
        this.usesReed = usesReed;
    }
}

