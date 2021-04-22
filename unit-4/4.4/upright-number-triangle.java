public class NumberTriangle
{
    public static void main(String[] args)
    {
       // Call makeNumberTriangle 
       makeNumberTriangle();
    }
    
    // Makes an upright triangle with the numbers 1-5
    public static void makeNumberTriangle()
    {
        int i, j;
        
        for(i = 1; i <= 5; i++)
        {
            for(j = 1; j <= 0 + i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
    }
}
