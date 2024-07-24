SortTester.java:
---------------
import java.util.ArrayList;
public class SortTester
{
    public static void main(String[] args)
    {
        int[] testArray;
        long startTime, endTime;
        int arraySize = 20000;
        
        // selectionSort
        // Make array
        testArray = makeRandomArray(arraySize);
        
        // Record start time
        startTime = System.currentTimeMillis();
        
        // Sort array using selectionSort static method
        Sorter.selectionSort(testArray);
        
        // Record end time
        endTime = System.currentTimeMillis();
        
        // Print out results
        System.out.println("Selection Sort: " + (endTime - startTime));
        
        // insertionSort
        // Make array
        testArray = makeRandomArray(arraySize);
        
        // Record start time
        startTime = System.currentTimeMillis();
        
        // Sort array using insertionSort static method
        Sorter.insertionSort(testArray);
        
        // Record end time
        endTime = System.currentTimeMillis();
        
        // Print out results
        System.out.println("Insertion Sort: " + (endTime - startTime));
        
        //mergeSort
        // Make array
        testArray = makeRandomArray(arraySize);
        
        // Record start time
        startTime = System.currentTimeMillis();
        
        // Sort array using mergeSort static method
        Sorter.mergeSort(testArray, arraySize);
        
        // Record end time
        endTime = System.currentTimeMillis();
        
        // Print out results
        System.out.println("Merge Sort: " + (endTime - startTime));
        
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


Sorter.java:
-----------
public class Sorter
{
    public static void selectionSort(int[] arr)
    {
        int currentMinIndex;
        for(int i = 0; i < arr.length - 1; i++)
        {
            currentMinIndex = i;
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[j] < arr[currentMinIndex])
                {
                    currentMinIndex = j;
                }
            }
            // swap numbers if needed
            if(i != currentMinIndex)
            {
                int temp = arr[currentMinIndex];
                arr[currentMinIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }
    public static void insertionSort(int[] arr)
    {
        // note: we start with 1 instead of 0
        for(int i = 1; i < arr.length; i++)
        {
            int curNumber = arr[i];
            
            // Set index to be place to the left
            int curIndex = i - 1;
            
            // We are still inbounds and the current number
            // is less than the current index
            while(curIndex >= 0 && arr[curIndex] > curNumber)
            {
                // Shift the value at curIndex to the right one place
                arr[curIndex + 1] = arr[curIndex];
                curIndex--;
            }
            // Put this number in the proper location
            arr[curIndex + 1] = curNumber;
        }
    }
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
