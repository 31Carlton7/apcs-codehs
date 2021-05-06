import java.util.ArrayList;

public class Odds
{
    public static void main(String[] args)
    {
        ArrayList<Integer> odds = new ArrayList<Integer>();
        // Pre-load the array list with values.
        for(int index = 1; index <101; index++)
        {
            odds.add(index);
            odds.add(index);
        }
        //call removeEvens on the array above!
        removeEvens(odds);
    }
    
    public static void removeEvens(ArrayList<Integer> array)
    {
        for(int i = 0; i < array.size(); i++)
        {
            if(array.get(i) % 2 == 0)
            {
                array.remove(i);
                i--;
            }
        }
        for(int num : array)
        {
            System.out.println(num);
        }
    }
}
