public class PrintOdds
{
   public static void main(String[] args)
   {
     int[ ] values = {17, 34, 56, 2, 19, 100};
        
     for (int num : values)
     {
       if (num % 2 == 1)
           System.out.println(num + " is odd");
     }
   }
}
