BotTester.java:
--------------
import java.util.Scanner;

public class BotTester
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Hello. What is your name?");
        String aName = input.nextLine();
        
        Bot bot = new Bot(aName);
        
        bot.greeting();
        bot.help();
        
        System.out.println("What's the weather like?");
        bot.weather();
        System.out.println("How many feet in a mile?");
        bot.feetInMile();
        bot.goodbye();
        
        
    }
}

Bot.java:
--------
public class Bot {

    private String name;

    public Bot (String yourName){
        name = yourName;
    }

    public void greeting(){
        System.out.print("Hello ");
        System.out.print(name);
        System.out.println("! My name is Hal!");
        System.out.println("How are you today!");
    }

    public void help(){
        System.out.println("You can ask me about the weather,");
        System.out.println("or how many feet are in a mile.");
        System.out.println("I can even convert feet to meters!");
    }

    public void weather(){
        System.out.println("Its always warm and dry inside your computer!");
    }

    public void feetInMile() {
        System.out.println("There are 5280 feet in a mile.");
    }

    public void goodbye(){
        System.out.println("It was nice talking with you!");
        System.out.println("Have a great day!");
    }

    public void favoriteNumber(int yourNumber){
        System.out.println("My favorite number is 8.");
        System.out.print("That is ");
        System.out.print(yourNumber - 8);
        System.out.println(" away from your number");
    }

    public double feetToMeters(double feet){
        double meters = feet * 0.3048;
        return meters;
    }

}
