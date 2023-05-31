//A program that compares two integers input by the user
import java.util.Scanner;

public class Comparison
{
    //method main begins execution of Java application
    public static void main(String[] args)
    {
        //Creating a new Scanner object
        Scanner input = new Scanner(System.in);

        //Declaring variables
        int x; //first integer input by user
        int y; //second integer input by user

        System.out.print("Enter first integer: "); //prompt
        x = input.nextInt();

        System.out.print("Enter second integer: "); //prompt
        y = input.nextInt();

        if(x > y)
            System.out.printf("%d is larger", x);

        if(y > x)
            System.out.printf("%d is larger", y);

        if(x == y)
            System.out.print("These numbers are equal");
    }//end of method main
}//end of class Comparison