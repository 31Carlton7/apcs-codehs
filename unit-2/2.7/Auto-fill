FormFill.java:
-------------
public class FormFill
{
    private String fName;
    private String lName;
    private String email;
    private int birthMonth;
    private int birthYear;
    
    
    // Constructor that sets the first and last name
    // The other variables will initialize themselves
    public FormFill(String firstName, String lastName){
        fName = firstName;
        lName = lastName;
    }
    
    // Sets birthMonth and birthyear to the given
    // values
    public void setBirthday(int month, int year){
        birthMonth = month;
        birthYear  = year ;
    }
    
   
    // Sets the email address
    public void setEmailAddress(String emailAddress){
        email = emailAddress;
    }
    
    // Returns a string with the name formatted like
    // a doctor would write the name on a file
    // 
    // Return string should be formatted 
    // with the last name, then a comma and space, then the first name.
    // For example: LastName, FirstName
    public String fullName(){
        return lName + ", " + fName;
    }
    
    // Returns basic contact information formatted 
    // like this example:
    // 
    // LastName
    // Email: smith@emailprovider.com
    //
    // Fill in the last name and email address
    // with the instance variables.
    //
    // You will need to use the escape character \n
    // To create a new line in the String
    public String contactInformation(){
        return (lName + "\nEmail: " + email);
    }
    
    // Returns a string with the birthday
    // formatted like this:
    // 
    // month/year
    public String birthday(){
        return birthMonth + "/" + birthYear;
    }
    
}

FormFillTester.java:
-------------
public class FormFillTester
{
    public static void main(String[] args)
    {
        FormFill filler = new FormFill("Karel", "The Dog");
        filler.setBirthday(5, 2012);
        filler.setEmailAddress("coolDog@email.com");
        
        System.out.println(filler.fullName());
        System.out.println(filler.birthday());
        System.out.println(filler.contactInformation());
        
    }
}
