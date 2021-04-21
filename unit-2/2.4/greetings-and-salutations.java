Salutations.java:
----------------
public class Salutations
{
    private String name;
    
    public Salutations(String aName){
        name = aName;
    }
    
    public void addressLetter(){
        System.out.println("Dear " + name);
    }
    public void signLetter(){
        System.out.println("Sincerely,");
        System.out.println(name);
    }
    public void addressMemo(){
        System.out.println("To whom it may concern");
    }
    public void signMemo(){
        System.out.println("Best,");
        System.out.println(name);
    }

}


SalutationsTester.java:
----------------------
public class SalutationsTester
{
    public static void main(String[] args)
    {
        Salutations one = new Salutations("Carlton");
        one.addressLetter();
        one.signLetter();
        one.addressMemo();
        one.signMemo();
    }
}

