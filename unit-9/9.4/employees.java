HourlyEmployee.java:
-------------------
public class HourlyEmployee extends Employee
{
    private double hoursPerWeek;
    
    // Call the Employee constructor and pass it a calculated annual salary
    public HourlyEmployee(String name, double hourlySalary, double hoursPerWeek)
    {
        super(name, hourlySalary * hoursPerWeek * 52);
        this.hoursPerWeek = hoursPerWeek;
        
    }
    // Get the annual salary from the superclass and convert it back
    // to hourly.
    public double getHourlySalary()
    {
        return super.getAnnualSalary() / 52 / hoursPerWeek;
    }
    // Use the input to set the annual salary in the superclass
    public void setHourlySalary(double hourlySalary)
    {
        super.setAnnualSalary(hourlySalary * hoursPerWeek * 52);
    }
    /**
     * Example output:
     * Mike makes $18.0 per hour
     */
     
    public String toString()
    {
        return super.getName() + " makes $" + getHourlySalary() + " per hour";
    }
}

EmployeeTester.java:
-------------------
public class EmployeeTester
{
    public static void main(String[] args)
    {
        HourlyEmployee eric = new HourlyEmployee("Eric B", 13.0, 28);
        System.out.println(eric);
        eric.setHourlySalary(15.0);
        System.out.println(eric);
    }
}


Employee.java:
-------------
public class Employee
{
    private String name;
    private double salary;
    
    public Employee(String name, double annualSalary)
    {
        this.name = name;
        this.salary = annualSalary;
    }
    public String getName()
    {
        return name;
    }
    public double getAnnualSalary()
    {
        return salary;
    }
    public void setAnnualSalary(double annualSalary)
    {
        salary = annualSalary;
    }
    /**
     * Example output:
     * Mr. Karel makes $75000.0 per year
     */
     
    public String toString()
    {
        return name + " makes $" + salary + " per year";
    }
}
