DataPurge.java:
--------------
import java.util.ArrayList; 

public class DataPurge 
{ 
    public static ArrayList<String> removeDuplicates(ArrayList<String> e) 
    { 
        ArrayList<String> temp = new ArrayList<>(); 
        for(int i=0; i<e.size()-1;i++)
        { 
            for(int j=i+1;j<e.size();j++)
            { 
                if(e.get(i).equals(e.get(j)))
                { 
                    temp.add(e.get(j)); 
                    e.remove(j); j--; 
                    
                } 
                
            } 
            
        } 
        return temp; 
        
    } 
    
    public static void removeAOL(ArrayList<String> e) 
    { 
        ArrayList<String> al = new ArrayList<>(); 
        System.out.println("Removed from emails ending in aol.com or @aol.com : " ); 
        for(int i = 0; i < e.size(); i ++)
        { 
            if(e.get(i).endsWith("aol.com"))
            { 
                System.out.println(e.get(i)); al.add(e.get(i)); 
            } 
            
        }
        e.removeAll(al);
    } 
    
    public static Boolean containsOnlyEmails(ArrayList<String> e) 
    { 
        int x = 0; 
        for(int i = 0; i < e.size(); i++) 
        { 
            if (e.get(i).indexOf("@") != -1 && e.get(i).indexOf(".") != -1) 
            { 
                x++; 
            } 
            
        } 
        return (x == e.size()); 
    } 
    
}

DataPurgeTester.java:
--------------------
import java.util.ArrayList;

public class DataPurgeTester
{
    public static void main(String[] args)
    {
        ArrayList<String> emails = new ArrayList<String>();
        addEmails(emails);
        System.out.println("List is all emails: " +DataPurge.containsOnlyEmails(emails));
        DataPurge.removeDuplicates(emails);
        DataPurge.removeAOL(emails);
        System.out.println(emails);
    }
    
    
    
    public static void addEmails(ArrayList<String> emails)
    {
        emails.add("tbmaddux@icloud.com");
        emails.add("rfisher@outlook.com");
        emails.add("anicolao@verizon.net");
        emails.add("openldap@me.com");
        emails.add("improv@gmail.com");
        emails.add("alias@sbcglobal.net");
        emails.add("portele@me.com");
        emails.add("doormat@icloud.com");
        emails.add("mailarc@aol.com");
        emails.add("portele@me.com");
        emails.add("rmcfarla@optonline.net");
        emails.add("chrisk@verizon.net");
        emails.add("gordonjcp@aol.com");
        emails.add("improv@gmail.com");
    }
}
