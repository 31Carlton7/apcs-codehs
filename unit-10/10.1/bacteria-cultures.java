import java.util.Scanner;
public class Bacteria
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many hours will the bacteria sit? ");
        int hours = input.nextInt();
        int bacteria = numBacteriaAlive(hours);
        System.out.println("After " + hours + ", there will be " + bacteria);
    }
    public static int numBacteriaAlive(int hour)
    {
        if(hour == 0) {
            return 10;
        }
        else {
            return numBacteriaAlive(hour - 1) * 3;
        }
    }
}
