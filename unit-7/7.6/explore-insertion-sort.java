import java.util.Arrays;

public class InsertionSort
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
        insertionSort(array1);
        // sort second array
        insertionSort(array2);

        System.out.print("First array sorted: ");
        System.out.println(Arrays.toString(array1));
        System.out.print("Second array sorted: ");
        System.out.println(Arrays.toString(array2));
    }
    
    /*
     * Insertion sort takes in an array of integers and
     * returns a sorted array of the same integers.
     */

    public static void insertionSort(int[] arr)
    {
        System.out.println(Arrays.toString(arr));

        // note: we start with 1 instead of 0
        for (int i = 1; i < arr.length; i++)
        {
            int curNumber = arr[i];
            
            // Set index to be place to the left
            int curIndex = i-1;
            
            // We are still inbounds and the current number
            // is less than the current index
            while (curIndex >= 0 && arr[curIndex] < curNumber)
            {
                // Shift the value at curIndex to the right one place
                arr[curIndex+1] = arr[curIndex];
                curIndex--;
            }
            
            // Put this number in the proper location
            arr[curIndex + 1] = curNumber;
            System.out.println(Arrays.toString(arr));
        }
    }
}
