// A program that accepts three integers from user and computes the sum, average
// and product and determines the smallest and largest integer
import java.util.Scanner;

public class Arithmetic
{
    // method main begins execution of Java application
    public static void main(String[] args)
    {
        // Creating a new Scanner object
        Scanner input = new Scanner(System.in);

        // Declaring variables
        int number1; // first number input by user
        int number2; // second number input by user
        int number3; // third number input by user
        int sum; // sum of the numbers
        int product; // product of the numbers
        int average; // average of the numbers

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        System.out.print("Enter third integer: ");
        number3 = input.nextInt();

        // Computing sum, average and product of integers
        sum = number1 + number2 + number3;
        product = number1 * number2 * number3;
        average = (number1 + number2 + number3) / 3;

        System.out.printf("Sum of the numbers is %d%n", sum);
        System.out.printf("Product of the numbers is %d%n", product);
        System.out.printf("Average of the numbers is %d%n", average);

        // Finding largest and smallest integers
        if(number1 > number2)
            if(number1 > number3)
                System.out.printf("%d is the largest%n", number1);

        if(number2 > number1)
            if(number2 > number3)
                System.out.printf("%d is the largest%n", number2);

        if(number3 > number1)
            if(number3 > number2)
                System.out.printf("%d is the largest%n", number3);

        if(number1 < number2)
            if(number1 < number3)
                System.out.printf("%d is the smallest%n", number1);

        if(number2 < number1)
            if(number2 < number3)
                System.out.printf("%d is the smallest%n", number2);

        if(number3 < number1)
            if(number3 < number2)
                System.out.printf("%d is the smallest%n", number3);
    }//end of method main
}//end of class Arithmetic