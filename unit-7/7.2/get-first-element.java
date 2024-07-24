import java.util.ArrayList;

public class Numbers
{
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        // Add 5 numbers to `numbers`
        numbers.add(0,1);
        numbers.add(1,2);
        numbers.add(2,3);
        numbers.add(3,4);
        numbers.add(4,5);
        
        // Print out the first element in `numbers`
        System.out.print(numbers.get(0));
    }
}
