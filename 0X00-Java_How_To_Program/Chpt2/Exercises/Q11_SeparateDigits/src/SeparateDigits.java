// An application that inputs one number consisting of five digits from
// the user, separates the number into its individual digits and prints the
// digits separated from one another by three spaces each
import java.util.Scanner;

public class SeparateDigits
{
    // method main begins execution of Java application
    public static void main(String[] args)
    {
        // Creating a new Scanner object
        Scanner input = new Scanner(System.in);

        // Declaring variables
        int number;

        System.out.print("Enter a number consisting of five digits: ");
        number = input.nextInt();

        // Separating the number into individual digits
        System.out.printf("%d   ", (number / 10000));
        number = number - ((number / 10000) * 10000);
        System.out.printf("%d   ", (number / 1000));
        number = number - ((number / 1000) * 1000);
        System.out.printf("%d   ", (number / 100));
        number = number - ((number / 100) * 100);
        System.out.printf("%d   ", (number / 10));
        number = number - ((number / 10) * 10);
        System.out.printf("%d   %n", (number % 10));
    }

}