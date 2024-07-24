Sorter.java:
-----------
public class Sorter
{
    public static void mergeSort(int[] current, int length)
    {
        if(length < 2)
        {
            return ;
        }
        int mid = length / 2;
        int[] left = new int[mid];
        int[] right = new int[length - mid];
        
        for(int i = 0; i < mid; i++)
        {
            left[i] = current[i];
        }
        for(int i = mid; i < length; i++)
        {
            right[i - mid] = current[i];
        }
        mergeSort(left, mid);
        mergeSort(right, length - mid);
        
        merge(current, left, right);
    }
    private static void merge(int[] current, int[] left, int[] right)
    {
        int leftSize = left.length;
        int rightSize = right.length;
        
        int i = 0, j = 0, k = 0;
        while(i < leftSize && j < rightSize)
        {
            if(left[i] <= right[j])
            {
                current[k++] = left[i++];
            }
            else
            {
                current[k++] = right[j++];
            }
        }
        while(i < leftSize)
        {
            current[k++] = left[i++];
        }
        while(j < rightSize)
        {
            current[k++] = right[j++];
        }
    }
}

SortTester.java:
---------------
import java.util.ArrayList;
public class SortTester
{
    public static void main(String[] args)
    {
        int[] testArray;
        long startTime, endTime;
        int arraySize = 50000;
        
        // Random Array
        // Make array
        testArray = makeRandomArray(arraySize);
        
        // Record start time
        startTime = System.currentTimeMillis();
        
        // Sort array using Merge Sort static method
        Sorter.mergeSort(testArray, arraySize);
        
        // Record end time
        endTime = System.currentTimeMillis();
        
        // Print out results
        System.out.println("Random Array: " + (endTime - startTime));
        
        // Almost Sorted Array
        // Make array
        testArray = makeAlmostSortedArray(arraySize);
        
        // Record start time
        startTime = System.currentTimeMillis();
        
        // Sort array using Merge Sort static method
        Sorter.mergeSort(testArray, arraySize);
        
        // Record end time
        endTime = System.currentTimeMillis();
        
        // Print out results
        System.out.println("Almost Sorted Array: " + (endTime - startTime));
        
        // Reverse Array
        // Make array
        testArray = makeReverseArray(arraySize);
        
        // Record start time
        startTime = System.currentTimeMillis();
        
        // Sort array using Merge Sort static method
        Sorter.mergeSort(testArray, arraySize);
        
        // Record end time
        endTime = System.currentTimeMillis();
        
        // Print out results
        System.out.println("Reverse Array: " + (endTime - startTime));
        
    }
    /**
     * This method returns an array in random order
     * @param number- the length of the desired almost sorted array
     * @return array - returns an array length number.
     */
     
    public static int[] makeRandomArray(int number)
    {
        int[] array = new int[number];
        ArrayList<Integer> sorted = new ArrayList<Integer>(number);
        // Create the sorted list
        for(int i = 0; i < number; i++)
        {
            sorted.add(i);
        }
        // Now shuffle it.
        int index = 0;
        while(sorted.size() > 0)
        {
            int randomIndex = (int)(Math.random() * sorted.size());
            array[index] = sorted.remove(randomIndex);
            index++;
        }
        return array;
    }
    /**
     * This method returns an array in reverse order starting from the parameter number
     * and going to the value 0.
     * @param number- the length of the desired almost sorted array
     * @return array - returns an array length number. Index 0 is the value number, and
     * index array.length - 1 is 0
     */
    public static int[] makeReverseArray(int number)
    {
        int[] array = new int[number];
        int counter = number;
        for(int i = 0; i < number; i++)
        {
            array[i] = counter;
            counter--;
        }
        return array;
    }
    /**
     * This method returns an array that is almost sorted, but the last index
     * and last index-1 are switched.
     * @param number- the length of the desired almost sorted array
     * @return array - returns an array length number with index array.length - 1
     * and array.length- 2 swapped.
     */
    public static int[] makeAlmostSortedArray(int number)
    {
        int[] array = new int[number];
        for(int i = 0; i < number; i++)
        {
            array[i] = i + 1;
        }
        int temp = array[array.length - 1];
        array[array.length - 1] = array[array.length - 2];
        array[array.length - 2] = temp;
        return array;
    }
}
