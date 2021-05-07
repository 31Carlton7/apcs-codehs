import java.util.ArrayList;
public class isEqual
{
    public static void main(String[] args)
    {
        //This code is just to test your equals method
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(10);
        list1.add(9);
        list1.add(5);
        list1.add(2);
        list1.add(9);
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(10);
        list2.add(9);
        list2.add(5);
        list2.add(2);
        list2.add(9);
        boolean isEqual = equals(list1, list2);
        System.out.println("List 1 is equal to List 2: "+isEqual);
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        list3.add(1);
        list3.add(9);
        list3.add(5);
        list3.add(2);
        list3.add(9);
        boolean isEqual2 = equals(list2, list3);
        System.out.println("List 2 is equal to List 3: "+isEqual2);
        
    }
    
    //Write your method here!
    public static boolean equals(ArrayList<Integer> array1, ArrayList<Integer> array2)
    {
        boolean result = true;
        
        for(int i = 0; i < array1.size(); i++)
        {
            Integer elem = array1.get(i);
            Integer elemTwo = array2.get(i);
            int timesCorrect = 0;
            
            if(array1.size() != array2.size())
            {
                result = false;
                break;
            }
            
            if(elem == elemTwo)
            {
                timesCorrect++;
            }
            else
            {
                result = false;
                break;
            }
            
            if(timesCorrect == array1.size())
            {
                result = true;
            }
        }
        return result;
    }
}
