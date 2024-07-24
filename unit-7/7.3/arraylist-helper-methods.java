ArrayListMethodsTester.java:
---------------------------
import java.util.ArrayList;

public class ArrayListMethodsTester
{
    public static void main(String[] args)
    {
        ArrayList<String> stringArray = new ArrayList<String>();
        stringArray.add("This");
        stringArray.add("is");
        stringArray.add("an");
        stringArray.add("ArrayList");
        stringArray.add("of");
        stringArray.add("Strings");
        
        ArrayListMethods.print(stringArray);
        System.out.println("\nArrayList is condensing:");
        ArrayListMethods.condense(stringArray);
        ArrayListMethods.print(stringArray);
        System.out.println("\nArrayList is duplicating:");
        ArrayListMethods.duplicate(stringArray);
        ArrayListMethods.print(stringArray);
        
    }
}


ArrayListMethods.java:
---------------------
import java.util.ArrayList;
public class ArrayListMethods
{
    static void print(ArrayList<String> array) 
    {
        for(String string : array)
        {
            System.out.println(string);
        }
    }
    
    static void condense(ArrayList<String> array)
    {
        for(int i = 0; i < array.size(); i++)
        {
            array.set(i, (array.get(i) + array.get(i + 1)));
            array.remove(i + 1);
            
            if(((array.size()) % 2) != 0)
            {
                break;
            }
        }
    }
    
    static void duplicate(ArrayList<String> array)
    {
        for(int i = 0; i < array.size(); i++)
        {
            array.add(i + 1, array.get(i));
            
            i++;
        }
        
    }
}
