OnlineCompany.java:
------------------
public class OnlineCompany extends Company{

    private String webAddress;

    public OnlineCompany(String name, String webAddress)
    {
        super(name);
        this.webAddress = webAddress;
    }

    //Return the website address
    
    @Override
    public String address()
    {
        return webAddress;
    }

    /**
    * Remember To get name from superclass, use super.getName()
    * 
    * Example Output:
    * CodeHS
    * www.codehs.com
    */
    
    @Override
    public String toString()
    {
        return super.getName() + "\n" + webAddress;
    }
}


Company.java:
------------
public class Company {
    
    private String name;
    private String streetAddress;
    private String city;
    private String state;

    // Set missing values to null
    public Company(String name)
    {
        this.name = name;
        this.streetAddress = null;
        this.city = null;
        this.state = null;
    }
    

    public Company(String name, String streetAddress, String city, String state)
    {
       this.name = name;
       this.streetAddress = streetAddress;
       this.city = city;
       this.state = state;
    }

    public String getName()
    {
       return name;
    }

    /**
    * Example output:
    * 123 Main St
    * Springfield, OH
    */
    public String address()
    {
       return streetAddress + "\n" + city + ", " + state;
    }

    /**
    * Example output:
    * Widget Company
    * 123 Main St
    * Springfield, OH
    */
    public String toString()
    {
       return name + "\n" + streetAddress + "\n" + city + ", " + state;
    }
}

CompanyTester.java:
------------------
public class CompanyTester
{
    public static void main(String[] args)
    {
        Company myCompany = new Company("Canton Inc.", "31742 West 33rd St", "Manhattan", "NY");
        OnlineCompany myOnlineCompany = new OnlineCompany("Canton Inc.", "www.canton.com");
        
        System.out.println(myCompany);
        System.out.println(myOnlineCompany);
    }
}

