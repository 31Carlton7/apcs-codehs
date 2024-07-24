ScopeTester.java:
----------------
public class ScopeTester
{
    public static void main(String[] args)
    {
        // Start here!
        Scope scope = new Scope();
        scope.printScope();
    }
}

Scope.java:
----------
public class Scope
{
    private int a;
    private int b;
    private int c;

    public Scope(){
        a = 5;
        b = 10;
        c = 15;
    }

    public void printScope(){
       //Start here
       System.out.println("A = " + getA());
       System.out.println("B = " + getB());
       System.out.println("C = " + getC());
       System.out.println("D = " + getD());
       System.out.println("E = " + getE());
    }

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public int getC() {
		return c;
	}

    public int getD(){
        int d = a + c;
        return d;
    }

	public int getE() {
        int e = b + c;
		return e;
	}
}

