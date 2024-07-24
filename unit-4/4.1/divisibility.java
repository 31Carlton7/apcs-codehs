public class ExtractDigits
{
    public static void main(String[] args)
    {
        extractDigits(2938724);
        
    }
    
    public static void extractDigits(int num)
    {
        while (num > 0) 
        {
            System.out.println(num % 10);
            num = num / 10;
        }
    }
}
