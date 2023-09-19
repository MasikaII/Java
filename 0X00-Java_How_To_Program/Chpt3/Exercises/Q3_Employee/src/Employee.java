// Employee.java
// A class that contains the credentials of an employee and methods to manipulate
// them
public class Employee
{
    // Declaring instance variables
    private String firstName; // employee's first name
    private String lastName;  // employee's last name
    private double monthlySalary; // employee's monthly salary

    // Constructor for class Employee
    public Employee(String firstName, String lastName, double monthlySalary)
    {
        this.firstName = firstName;
        this.lastName = lastName;

        // validating the monthly salary before setting it
        if(monthlySalary > 0)
            this.monthlySalary = monthlySalary;
    }

    // method to set employee's first name
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    // method to retrieve employee's first name
    public String getFirstName()
    {
        return firstName;
    }

    // method to set employee's last name
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    // method to retrieve employee's last name
    public String getLastName()
    {
        return lastName;
    }

    // method to set employee's monthly salary
    public void setMonthlySalary(double monthlySalary)
    {
        this.monthlySalary = monthlySalary;
    }

    // method to retriev employee's monthly salary
    public double getMonthlySalary()
    {
        return monthlySalary;
    }

    // method to calculate employee's yearly salary
    public double getYearlySalary(double monthlySalary)
    {
        this.monthlySalary = monthlySalary;

        // calculating yearly salary
        double yearlySalary = monthlySalary * 12;

        return yearlySalary;
    }

    // method  to get employee's yearly salary after a raise
    public double getRaisedSalary(double yearlySalary, double raise)
    {
        double raisedSalary = ((raise / 100)* yearlySalary)+yearlySalary;

        return raisedSalary;
    }
}
