import java.util.Scanner;

public class MovieRatings
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter movie rating (as a decimal)");
        double rating = input.nextDouble();
        
        int ratingRounded = (int)(rating + 0.5);
        
        System.out.println("Rating rounded: " + ratingRounded);
        
       
    }
}
