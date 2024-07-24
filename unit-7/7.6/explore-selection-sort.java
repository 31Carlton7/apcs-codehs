import java.util.Arrays;

public class SelectionSort
{
    public static void main(String[] args)
    {
        int[] array1 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] array2 = {5, 6, 4, 8, 9, 7, 3, 1, 2};
        
        System.out.print("First array: ");
        System.out.println(Arrays.toString(array1));
        System.out.print("Second array: ");
        System.out.println(Arrays.toString(array2));
        System.out.println();

        // sort first array
        selectionSort(array1);
        // sort second array
        selectionSort(array2);

        System.out.print("First array sorted: ");
        System.out.println(Arrays.toString(array1));
        System.out.print("Second array sorted: ");
        System.out.println(Arrays.toString(array2));
    }
    
    /*
     * Selection sort takes in an array of integers and
     * returns a sorted array of the same integers.
     */
    public static int[] selectionSort(int[] arr)
    {
        int numberOfSwaps = 0;
        int currentMinIndex;
        for (int i = 0; i < arr.length - 1; i++)
        {
            currentMinIndex = i;
            for (int j = i + 1; j < arr.length; j++)
            {
                if(arr[j] < arr[currentMinIndex])
                {
                    currentMinIndex = j;
                }
            }
            
            // swap numbers if needed
            if (i != currentMinIndex)
            {
                numberOfSwaps++;
                int temp = arr[currentMinIndex];
                arr[currentMinIndex] = arr[i];
                arr[i] = temp;
            }
        }
        
        // Print out the number of swaps that took place here
        // before returning arr
        System.out.println(numberOfSwaps);
        
        return arr;
    }
}
