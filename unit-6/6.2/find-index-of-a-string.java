public class MatchingString
{
    private static String[] arr = {"Hello", "Karel", "CodeHS!"};
    
    public static int findString(String myString)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i].equals(myString)) {
                return i;
            }
        }
        return -1;
    }
}
