// An application that reads two integers and determines whether the first is
// a multiple of the second
import java.util.Scanner;

public class Multiples
{
    // method main begins program execution
    public static void main(String[] args)
    {
        // Creating a new Scanner object
        Scanner input = new Scanner(System.in);

        // Declaring variables
        int number1;
        int number2;

        System.out.print("Enter the first integer: "); // prompt
        number1 = input.nextInt();

        System.out.print("Enter the second integer: "); // prompt
        number2 = input.nextInt();

        // Determining if the second integer is a multiple of the first
        if(number2 % number1 == 0)
            System.out.println("The second integer is a multiple of the first");

        if(number2 % number1 != 0)
            System.out.println("The second integer is not a multiple of the first");

    }

}