Hello.java:
----------
public class Hello {

    private String name;

    public Hello (String yourName){
        name = yourName;
    }

    public void english(){
        System.out.print("Hello ");
        System.out.print(name);
        System.out.println("!");
    }

    public void spanish(){
        System.out.print("Hola ");
        System.out.print(name);
        System.out.println("!");
    }

    public void french(){
        System.out.print("Bonjour ");
        System.out.print(name);
        System.out.println("!");
    }

    public void german(){
        System.out.print("Hallo ");
        System.out.print(name);
        System.out.println("!");
    }

    public void russian(){
        System.out.print("Privet ");
        System.out.print(name);
        System.out.println("!");
    }

    public void chinese(){
        System.out.print("Ni hao ");
        System.out.print(name);
        System.out.println("!");
    }
}

HelloTester.java:
----------------
import java.util.Scanner;

public class HelloTester
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        Hello hi = new Hello("Carlton");
            hi.english();
            hi.french();
            hi.chinese();
        
    }
}
