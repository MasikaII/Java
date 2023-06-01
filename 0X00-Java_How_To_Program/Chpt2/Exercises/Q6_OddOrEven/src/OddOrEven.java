// A program that reads an integer and determines whether it is odd or even
import java.util.Scanner;

public class OddOrEven
{
    // main method begins execution of Java application
    public static void main(String[] args)
    {
        // Creating a new Scanner object
        Scanner input = new Scanner(System.in);

        // Declaring variables
        int number;

        System.out.print("Enter an integer: ");
        number = input.nextInt();

        // Determining if number is odd or even
        if(number % 2 == 0)
            System.out.printf("%d is even%n", number);

        if(number % 2 != 0)
            System.out.printf("%d is odd%n", number);
    }

}
