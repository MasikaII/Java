// A program that inputs five numbers and determines and prints the number of 
// negative numbers input, the number of positive numbers input and the number 
// of zeros input
import java.util.Scanner;

public class NegativePositiveZero
{
    // method main begins execution of Java application
    public static void main(String[] args)
    {
        // Creating a new Scanner object
        Scanner input = new Scanner(System.in);

        // Declaring variables
        int a, b, c, d, e; // numbers input by user
        int positive = 0;  // positive counter
        int negative = 0;  // negative counter
        int zero = 0; // zero counter

        System.out.print("Enter the first number: "); // Prompt
        a = input.nextInt();

        System.out.print("Enter the second number: "); // Prompt
        b = input.nextInt();

        System.out.print("Enter the third number: "); // Prompt
        c = input.nextInt();

        System.out.print("Enter the fourth number: "); // Prompt
        d = input.nextInt();

        System.out.print("Enter the fifth number: "); // Prompt
        e = input.nextInt();

        // Counting the number of positive numbers, negative numbers and zeros
        if(a > 0)
            positive = positive + 1;

        if(a < 0)
            negative = negative + 1;

        if(a == 0)
            zero = zero + 1;

        if(b > 0)
            positive = positive + 1;

        if(b < 0)
            negative = negative + 1;

        if(b == 0)
            zero = zero + 1;

        if(c > 0)
            positive = positive + 1;

        if(c < 0)
            negative = negative + 1;

        if(c == 0)
            zero = zero + 1;

        if(d > 0)
            positive = positive + 1;

        if(d < 0)
            negative = negative + 1;

        if(d == 0)
            zero = zero + 1;

        if(e > 0)
            positive = positive + 1;

        if(e < 0)
            negative = negative + 1;

        if(e == 0)
            zero = zero + 1;

        // Displaying count
        System.out.printf("Number of positive numbers input is %d%n", positive);
        System.out.printf("Number of negative numbers input is %d%n", negative);
        System.out.printf("Number of zeros input is %d%n", zero);
    }
}
