WebsiteTester.java:
------------------
public class WebsiteTester
{
    public static void main(String[] args)
    {
        Website com = new Website();
        Website goodschool = new Website("goodSchool", "edu");
        Website codehs = new Website("codehs", "com", 1000000);
        
        System.out.println(com);
        System.out.println(goodschool);
        System.out.println(codehs);
    }
}

Website.java:
------------
public class Website
{
    String domain;
    String topLevelDomain;
    int numUsers;
    
    public Website()
    {
        domain = "";
        topLevelDomain = "com";
        numUsers = 0;
    }
    
    public Website(String domainName, String topDomain)
    {
        domain = domainName;
        topLevelDomain = topDomain;
        numUsers = 0;
    }
    
    public Website(String domainName, String topDomain, int numPeople)
    {
        domain = domainName;
        topLevelDomain = topDomain;
        numUsers = numPeople;
    }

    public String toString()
    {
        String res =  "https://www." + domain + "." + topLevelDomain;
        res += " has " + numUsers + " users";
        
        return res;
    }
}


