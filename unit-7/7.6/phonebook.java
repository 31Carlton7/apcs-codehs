PhoneNumber.java:
----------------
public class PhoneNumber
{
    private String name;
    private String number;

    public PhoneNumber(String name, String number)
    {
        this.name = name;
        this.number = number;
    }

    public String getName()
    {
        return name;
    }

    public String getNumber()
    {
        return number;
    }
}


Phonebook.java:
--------------
import java.util.ArrayList;

public class Phonebook
{
    ArrayList<PhoneNumber> myPhonebook = new ArrayList<PhoneNumber>();
    
    public void addNumber(PhoneNumber phoneNumber)
    {
        myPhonebook.add(phoneNumber);
        sort();
    }
    
    private void sort()
    {
        int n = myPhonebook.size();
        for (int i = 1; i < n; ++i) 
        {
            String key = myPhonebook.get(i).getName();
            PhoneNumber key2 = myPhonebook.get(i);
            int j = i - 1;

            while (j >= 0 && myPhonebook.get(j).getName().compareTo(key) > 0) 
            {
                myPhonebook.set(j + 1, myPhonebook.get(j));
                j -= 1;
            }
            
            myPhonebook.set(j + 1, key2);
        }
    }
    
    public void printPhoneBook()
    {
        for(int i = 0; i < myPhonebook.size(); i++)
        {
            System.out.println(myPhonebook.get(i).getName());
        }
    }
}

PhonebookTester.java:
--------------------
public class PhonebookTester
{
    public static void main(String[] args)
    {
        Phonebook test = new Phonebook();
        test.addNumber(new PhoneNumber("Sherry", "12312312"));
        test.addNumber(new PhoneNumber("Dylan", "12312312"));
        test.addNumber(new PhoneNumber("Kevin", "12312312"));
        test.addNumber(new PhoneNumber("Bob", "12312312"));
        test.addNumber(new PhoneNumber("Alex", "12312312"));
        test.printPhoneBook();
    }
}

