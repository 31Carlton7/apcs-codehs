public class WorkShift
{
    public static void main(String[] args)
    {
        int hours = 20;
        int minutes = 42;
        int seconds = 16;
        
        hours *= 3600;
        minutes *= 60;
        seconds += hours+minutes;
        
        System.out.println("The doctor has worked " + seconds + " seconds");
    }
}
