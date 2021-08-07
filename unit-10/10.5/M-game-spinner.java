GameSpinner.java:
----------------
import java.lang.Math;

public class GameSpinner 
{
   private int spinner;
   private int spinNum;
   private int run;
   
   public GameSpinner(int spinner)
   {
       this.spinner = spinner;
       this.spinNum = 0;
       this.run = 0;
   }
   
   public int currentRun()
   {
       return run;
   }
   
   public int spin()
   {
       int randomNum = (int)(Math.random() * 4) + 1;
       int oldSpinNum = spinNum;
       spinNum = randomNum;
       
       if(oldSpinNum == spinNum)
       {
           run++;
       } else {
           run = 1;
       }
       
       return randomNum;
   }
}

MyProgram.java:
--------------
public class MyProgram
{
    public static void main(String[] args)
    {
        GameSpinner g = new GameSpinner(4); 
        System.out.println("Length of current run = " + g.currentRun()); 
        System.out.println("Random number = " + g.spin());
        System.out.println("Length of current run = " + g.currentRun());
        System.out.println("Random number = " + g.spin());
        System.out.println("Length of current run = " + g.currentRun());
        System.out.println("Random number = " + g.spin());
        System.out.println("Length of current run = " + g.currentRun());
        System.out.println("Random number = " + g.spin());
        System.out.println("Length of current run = " + g.currentRun());
        System.out.println("Random number = " + g.spin());
        System.out.println("Random number = " + g.spin());
        System.out.println("Random number = " + g.spin());
        System.out.println("Length of current run = " + g.currentRun());
        
         System.out.println("\n\n******************* Next test case********************");
         g = new GameSpinner(6); 
        System.out.println("Length of current run = " + g.currentRun()); 
        System.out.println("Random number = " + g.spin());
        System.out.println("Length of current run = " + g.currentRun());
        System.out.println("Random number = " + g.spin());
        System.out.println("Length of current run = " + g.currentRun());
        System.out.println("Random number = " + g.spin());
        System.out.println("Length of current run = " + g.currentRun());
        System.out.println("Random number = " + g.spin());
        System.out.println("Length of current run = " + g.currentRun());
        System.out.println("Random number = " + g.spin());
        System.out.println("Random number = " + g.spin());
        System.out.println("Random number = " + g.spin());
        System.out.println("Length of current run = " + g.currentRun());
    }
}
