TwoDArray.java:
--------------
public class TwoDArray
{
    private Object[][] myArray;
    
    public TwoDArray(Object[][] input)
    {
        myArray = input;
    }
    public boolean equals(Object[][] other)
    {
        int smallerRow = 0;
        if (myArray.length <= other.length)
        {
            smallerRow = myArray.length;
        }
        else 
        {
            smallerRow = other.length;
        }
        
        int smallerCol = 0;
        if (myArray[0].length <= other[0].length)
        {
            smallerCol = myArray[0].length;
        }
        else 
        {
            smallerCol = other[0].length;
        }
        
        for (int i = 0; i < smallerRow; i++)
        {
            for (int j = 0; j < smallerCol; j++)
            {
                if(!myArray[i][j].equals(other[i][j])) 
                {
                    return false;
                }
            }
        }
        return true;
    }
}


TwoDTester.java:
---------------
public class TwoDTester
{
    public static void main(String[] args)
    {
        Integer[][] firstArray = {{2, 3}, {3, 4}, {4, 5}};
        Integer[][] secondArray = {{2, 3}, {3, 4}, {4, 5}};
        TwoDArray first = new TwoDArray(firstArray);
        
        System.out.println(first.equals(secondArray));
        
        String[][] thirdArray = {{"Hello", "Goodbye"}, {"Hola", "Adios"}, {"Bonjour", "Au revoir"}};
        String[][] fourthArray = {{"Hello", "Goodbye"}, {"Ciao", "Addio"}, {"Bonjour", "Au revoir"}};
        TwoDArray third = new TwoDArray(thirdArray);
        
        System.out.println(third.equals(fourthArray));
    }
}
