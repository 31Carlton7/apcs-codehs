CompanyTester.java:
------------------
import java.util.*;
public class CompanyTester
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Company> companies = new ArrayList<Company>();
        
        //keep looping until it is broken by the `break` statement
        while(true)
        {
            System.out.print("Please enter a company name, enter 'exit' to quit: ");
            String companyName = sc.nextLine();
            if(companyName.equals("exit")) {
                break;
            }
            System.out.print("Is this an online company, 'yes' or 'no': ");
            String online = sc.nextLine();
            if(online.equals("yes"))
            {
                System.out.print("Please enter the website address: ");
                String website = sc.nextLine();
                
                OnlineCompany onlineCompany = new OnlineCompany(companyName, website);
                companies.add(onlineCompany);
            }
            else
            {
                System.out.print("Please enter the street address: ");
                String streetAddress = sc.nextLine();
                System.out.print("Please enter the city address: ");
                String city = sc.nextLine();
                System.out.print("Please enter the state address: ");
                String state = sc.nextLine();
                
                Company company = new Company(companyName, streetAddress, city, state);
                companies.add(company);
            }
        }
        //print out arraylist
        for(Company company : companies)
        {
            System.out.println(company.toString());
            System.out.println("");
        }
    }
}


Company.java:
------------
public class Company
{
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
        return streetAddress;
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


OnlineCompany.java:
------------------
public class OnlineCompany extends Company
{
    private String webAddress;
    
    public OnlineCompany(String name, String webAddress)
    {
        super(name);
        this.webAddress = webAddress;
    }
    //Return the website address
    public String address()
    {
        return webAddress;
    }
    /**
     * Remember: To get name from superclass, use super.getName()
     * Example Output:
     * CodeHS
     * www.codehs.com
     */
     
    public String toString()
    {
        return super.getName() + "\n" + webAddress;
    }
}
