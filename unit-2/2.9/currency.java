CurrencyTester.java:
-------------------
public class CurrencyTester
{
    public static void main(String[] args)
    {
        Currency bankRoll = new Currency(12.45);
        
        System.out.println("Value of bankroll: " + bankRoll);
        System.out.println("Dollars: " + bankRoll.getDollars());
        System.out.println("Cents: " + bankRoll.getCents());
        
        
        bankRoll.setValue(20.56);
        System.out.println("Value of bankroll: " + bankRoll);
        System.out.println("Dollars: " + bankRoll.getDollars());
        System.out.println("Cents: " + bankRoll.getCents());
        
        bankRoll.setValue(67.78);
        System.out.println("Value of bankroll: " + bankRoll);
        System.out.println("Dollars: " + bankRoll.getDollars());
        System.out.println("Cents: " + bankRoll.getCents());
        
        
    }
}

Currency.java:
-------------
public class Currency
{
    private Double value;
    
    // Constructor
    public Currency(Double startValue)
    {
        value = startValue;
    }
    
    // Sets value to newValue
    public void setValue(Double newValue)
    {
        value = newValue;
    }
    
    // Returns the dollar portion of value
    // if value is 12.34, returns 12
    public Integer getDollars()
    {
        int dollars = (int)value.doubleValue();
        return dollars;
    }
    
    // Returns the cents portion of value
    // as an Integer
    // if value is 12.34, returns 34
    public Integer getCents()
    {
        return (int)(value * 100) % 100;
    }
    
    // Returns a String representation
    // in the format
    // $12.34
    public String toString()
    {
        return "$" + getDollars() + "." + getCents();
    }
}

