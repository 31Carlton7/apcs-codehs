BankTester.java:
---------------

public class BankTester
{
    public static void main(String[] args)
    {
        StudentAccount s = new StudentAccount("Jem", 300);
        System.out.println(s);
        s.deposit(20);
        System.out.println(s);
    }
}


Account.java:
------------
public class Account
{
    private String name;
    private double balance;
    
    // Initialize values in constructor
    public Account(String clientName, double openingBal)
    {
        name = clientName;
        balance = openingBal;
    }
    // Complete the accessor method
    public double getBalance()
    {
        return balance;
    }
    // Add amount to balance
    public void deposit(double amount)
    {
        balance += amount;
        
    }
    // Subtract amount from balance
    public void withdrawal(double amount)
    {
        balance -= amount;
        
    }
    // Should read: Regular account with a balance of $__.__
    public String toString()
    {
        return "Regular account with a balance of $" + balance;
    }
}

StudentAccount.java:
-------------------
public class StudentAccount extends Account
{
    // Complete this class with Override methods.
    public StudentAccount(String clientName, double openingBal)
    {
        super(clientName, openingBal);
    }
    // Students get a $1 bonus on depositing
    public void deposit(double amount)
    {
        super.deposit(amount + 1);
        
    }
    // Students pay a $2 fee for withdrawing
    public void withdrawal(double amount)
    {
        super.withdrawal(amount + 2);
        
    }
    // toString() Should read: Student account with a balance of $__.__
    public String toString()
    {
        return "Student account with a balance of $" + super.getBalance();
    }
}
