public class InsertionvSelection
{
    public static void main(String[] args)
    {
        /*
        This program evaluates the speed that Selection and Insertion sort are able to 
        sort different arrays. What do you notice about the difference in speed?
        Why do you think that's the case?
        */
        
        //Try changing the size of the array by changing the value of makeReverseArray()
        //Does that change the results?
        int[] reverse = makeReverseArray(100);
        System.out.println("Reversed Array:");
        printArray(reverse);
        long startTime = System.nanoTime();
        selectionSort(reverse);
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("\nSelection Sort on Reversed Array:");
        printArray(reverse);
        System.out.println("Time elapsed: "+ timeElapsed + " nanoseconds.");
        
        //Try changing the size of the array by changing the value of makeReverseArray()
        //Does that change the results?
        int[] reverse2 = makeReverseArray(100);
        System.out.println("\nReversed Array:");
        printArray(reverse2);
        long newstartTime = System.nanoTime();
        insertionSort(reverse2);
        long newendTime = System.nanoTime();
        long newtimeElapsed = newendTime - newstartTime;
        System.out.println("\nInsertion Sort on Reversed Array:");
        printArray(reverse2);
        System.out.println("Time elapsed: "+ newtimeElapsed + " nanoseconds.\n");
        
        checkSpeed(timeElapsed, newtimeElapsed);
        
        System.out.println("\n==================================================");
        //Try changing the size of the array by changing the value of makeAlmostSortedArray()
        //Does that change the results?
        int[] almostSorted = makeAlmostSortedArray(100);
        System.out.println("Almost Sorted Array:");
        printArray(almostSorted);
        startTime = System.nanoTime();
        selectionSort(almostSorted);
        endTime = System.nanoTime();
        timeElapsed = endTime - startTime;
        System.out.println("\nSelection Sort on Almost Sorted Array:");
        printArray(almostSorted);
        System.out.println("Time elapsed: "+ timeElapsed + " nanoseconds.");
        
        //Try changing the size of the array by changing the value of makeAlmostSortedArray()
        //Does that change the results?
        int[] almostSorted2 = makeAlmostSortedArray(100);
        System.out.println("\nAlmost Sorted Array:");
        printArray(almostSorted2);
        newstartTime = System.nanoTime();
        insertionSort(almostSorted2);
        newendTime = System.nanoTime();
        newtimeElapsed = newendTime - newstartTime;
        System.out.println("\nInsertion Sort on Almost Sorted Array:");
        printArray(almostSorted2);
        System.out.println("Time elapsed: "+ newtimeElapsed + " nanoseconds.\n");
        
        checkSpeed(timeElapsed, newtimeElapsed);
    }
    
    public static void insertionSort(int[] array)
    {
        for(int index = 1; index < array.length; index++)
        {
            int currentIndexValue = array[index];
            
            int sortedIndex = index - 1;
            
            while( sortedIndex > -1 && array[sortedIndex] > currentIndexValue)
            {
            	array[sortedIndex + 1] = array[sortedIndex];
            	
            	sortedIndex--;
            }
            
            array[sortedIndex + 1] = currentIndexValue;
        }
    }
    
    public static void selectionSort(int[] array)
    {
        for(int index = 0; index < array.length - 1; index++)
        {
        	int minIndex = index;
            for(int i = index; i < array.length; i ++)
            {
            	if(array[i] < array[minIndex])
            	{
            		minIndex = i;
            	}
            }
            int tempValue = array[index];
            array[index] = array[minIndex];
            array[minIndex] = tempValue;
        }
    }
    
     public static void printArray(int[] array)
    {
        for(int elem: array)
        {
            System.out.print(elem+ " ");
        }
        System.out.println();
    }
    
     /**
     * This method returns an array in reverse order starting from the parameter number
     * and going to the value 0.
     * @param number- the length of the desired almost sorted array
     * @return array - returns an array length number. Index 0 is the value number, and 
     * index array.length-1 is 0
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
        for(int i= 0; i < number; i++)
        {
            array[i] = i+1;
        }
        int temp = array[array.length-1];
        array[array.length-1] = array[array.length - 2];
        array[array.length - 2] = temp;
        return array;
        
    }
    
    /**
     * This method compares the speed of Selection Sort and Insertion Sort and prints
     * the results depending on which Sort method is faster.
     * @param selectionTime- the time elapsed during the selection sort
     * @param insertionTime- the time elapsed during insertion sort
     */
    public static void checkSpeed(long selectionTime, long insertionTime)
    {
        if(selectionTime > insertionTime)
        {
            System.out.println("Insertion time is faster than Selection time by " + (selectionTime- insertionTime) + " nanoseconds.");
        }
        else
        {
            System.out.println("Selection time is faster than Insertion time by "+ (insertionTime- selectionTime) + " nanoseconds.");

        }
    }
    
}
