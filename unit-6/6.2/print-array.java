public class PrintArray
{
    public static void main(String[] args)
    {
        String[] arr = new String[] {"a", "b", "c"};
        printArr(arr);
    }
    public static void printArr(String[] arr)
    {
        // Print everything in the array on its own line
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
