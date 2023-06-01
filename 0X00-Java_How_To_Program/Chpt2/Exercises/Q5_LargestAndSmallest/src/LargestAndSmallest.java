// A program that determines the smallest and largest integer in a group of five
// input by the user
import java.util.Scanner;

public class LargestAndSmallest
{
    // main method begins execution of Java application
    public static void main(String[] args)
    {
        // Creating a new Scanner object
        Scanner input = new Scanner(System.in);

        // Declaring variables
        int a, b, c, d, e; // Integers input by user

        System.out.print("Enter the first integer: "); // Prompt
        a = input.nextInt();

        System.out.print("Enter the second integer: "); // Prompt
        b = input.nextInt();

        System.out.print("Enter the third integer: "); // Prompt
        c = input.nextInt();

        System.out.print("Enter the fourth integer: "); // Prompt
        d = input.nextInt();

        System.out.print("Enter the fifth integer: "); // Prompt
        e = input.nextInt();

        // Finding the largest and smallest values
        if(a > b)
            if(a > c)
                if(a > d)
                    if(a > e)
                        System.out.printf("%d is the largest%n", a);

        if(b > a)
            if(b > c)
                if(b > d)
                    if(b > e)
                        System.out.printf("%d is the largest%n", b);

        if(c > a)
            if(c > b)
                if(c > d)
                    if(c > e)
                        System.out.printf("%d is the largest%n", c);

        if(d > a)
            if(d > b)
                if(d > c)
                    if(d > e)
                        System.out.printf("%d is the largest%n", d);

        if(e > a)
            if(e > b)
                if(e > c)
                    if(e > d)
                        System.out.printf("%d is the largest%n", e);

        if(a < b)
            if(a < c)
                if(a < d)
                    if(a < e)
                        System.out.printf("%d is the smallest%n", a);

        if(b < a)
            if(b < c)
                if(b < d)
                    if(b < e)
                        System.out.printf("%d is the smallest%n", b);

        if(c < a)
            if(c < b)
                if(c < d)
                    if(c < e)
                        System.out.printf("%d is the smallest%n", c);

        if(d < a)
            if(d < b)
                if(d < c)
                    if(d < e)
                        System.out.printf("%d is the smallest%n", d);

        if(e < a)
            if(e < b)
                if(e < c)
                    if(e < d)
                        System.out.printf("%d is the smallest%n", e);

    }//end of method main
}//end of class LargestAndSmallest