// EmployeeTest.java
// Creates and manipulates objects of class Employee
import java.util.Scanner;

public class EmployeeTest
{
    public static void main(String[] args)
    {
        // Creating objects of class Employee
        Employee employee1 = new Employee("NULL", "NULL", 0.0);
        Employee employee2 = new Employee("NULL", "NULL", 0.0);

        // Displaying initial values stored in the objects
        System.out.printf("%s %s: %n", employee1.getFirstName(), employee1.getLastName());
        System.out.printf("Monthly Salary: $%.2f%n", employee1.getMonthlySalary());
        System.out.printf("Yearly Salary: $%.2f%n", employee1.getYearlySalary(employee1.getMonthlySalary()));

        System.out.printf("%s %s: %n", employee2.getFirstName(), employee2.getLastName());
        System.out.printf("Monthly Salary: $%.2f%n", employee2.getMonthlySalary());
        System.out.printf("Yearly Salary: $%.2f%n", employee2.getYearlySalary(employee2.getMonthlySalary()));

        // Creating a Scanner object to obtain input from command window
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee1's first name: \n");
        String firstName = input.nextLine();
        employee1.setFirstName(firstName); // Setting first name
        System.out.print("Enter employee1's last name: \n");
        String lastName = input.nextLine();
        employee1.setLastName(lastName); // Setting last name
        System.out.print("Enter employee1's monthly salary: \n");
        double monthlySalary = input.nextDouble();
        employee1.setMonthlySalary(monthlySalary); // Setting monthly salary
        System.out.print("Enter employee1's raise: \n ");
        double raise1 = input.nextDouble();

        // Employee1's credentials
        System.out.printf("%s %s: %n", employee1.getFirstName(), employee1.getLastName());
        System.out.printf("Monthly Salary: $%.2f%n", employee1.getMonthlySalary());
        System.out.printf("Yearly Salary: $%.2f%n", employee1.getYearlySalary(employee1.getMonthlySalary()));
        System.out.printf("Yearly Salary after raise: $%.2f%n", employee1.getRaisedSalary
                (employee1.getYearlySalary(monthlySalary), raise1));

        System.out.print("Enter employee2's first name: \n");
        String firstName2 = input.nextLine();
        employee2.setFirstName(firstName2); // Setting first name
        System.out.print("Enter employee2's last name: \n");
        String lastName2 = input.nextLine();
        employee2.setLastName(lastName2); // Setting last name
        System.out.print("Enter employee2's monthly salary: \n");
        double monthlySalary2 = input.nextDouble();
        employee2.setMonthlySalary(monthlySalary2); // Setting monthly salary
        System.out.print("Enter employee2's raise:  \n ");
        double raise2 = input.nextDouble();


        // Employee2's credentials
        System.out.printf("%s %s: %n", employee2.getFirstName(), employee2.getLastName());
        System.out.printf("Monthly Salary: $%.2f %n", employee2.getMonthlySalary());
        System.out.printf("Yearly Salary: $%.2f %n", employee2.getYearlySalary(employee2.getMonthlySalary()));
        System.out.printf("Yearly Salary after raise: $%.2f%n", employee2.getRaisedSalary
                (employee2.getYearlySalary(monthlySalary), raise2));

    }
}