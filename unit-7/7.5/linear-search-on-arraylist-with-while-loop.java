import java.util.ArrayList;

public class ArrayListSearch
{
    public static void main(String[] args) {
        ArrayList<Double> array = new ArrayList<Double>();
        array.add(4.5);
        array.add(6.7);
        array.add(5.0);
        array.add(2.9);
        array.add(7.0);
        System.out.println(search(array, 5.0));
    }

    public static int search(ArrayList<Double> array, double key)
    {
        int searchNum = -1;
        for(int i = 0; i < array.size(); i++)
        {
            if(array.get(i) == key)
            {
                searchNum = i;
            }
        }
        return searchNum;
    }
}
