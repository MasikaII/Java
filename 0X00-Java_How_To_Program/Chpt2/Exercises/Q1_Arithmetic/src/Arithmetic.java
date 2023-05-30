//A program that computes the sum, product, difference and quotient(division)
//of two numbers input by the user
import java.util.Scanner;

public class Arithmetic
{
    //method main begins execution of Java application
    public static void main(String[] args)
    {
        //Creating a new Scanner object
        Scanner input = new Scanner(System.in);

        //Declaring variables
        int x; //first number input by user
        int y; //second number input by user

        System.out.print("Enter first integer: "); //prompt
        x = input.nextInt();

        System.out.print("Enter second integer: "); //prompt
        y = input.nextInt();

        System.out.printf("Sum of the two numbers is: %d%n", (x + y));
        System.out.printf("Product of the two numbers is: %d%n", (x * y));
        System.out.printf("Difference of the two numbers is: %d%n", (x - y));
        System.out.printf("Quotient of the two numbers is: %d%n", (x / y));
    } //end of method main
} //end of class Arithmetic