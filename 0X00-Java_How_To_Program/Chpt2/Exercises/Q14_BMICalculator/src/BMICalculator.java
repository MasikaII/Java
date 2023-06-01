// A BMI calculator that reads the user's weight and height, then calculates and
// displays the user's body mass index
import java.util.Scanner;

public class BMICalculator
{
    // method main begins execution of Java application
    public static void main(String[] args)
    {
        // Creating a new Scanner object
        Scanner input = new Scanner(System.in);

        // Declaring variables
        double height; // Height of user
        double weight; // Weight of user
        double BMI = 0; // BMI of user
        int system; // Metric or Imperial

        System.out.print("Enter 1 for metric and 2 for imperial: "); // prompt
        system = input.nextInt();

        // Calculating the body mass index
        if(system == 1)
        {
            System.out.print("Enter your height in meters: "); // prompt
            height = input.nextDouble();

            System.out.print("Enter your weight in kilograms: "); // prompt
            weight = input.nextDouble();

            BMI = weight / (height * height);
        }

        if(system == 2)
        {
            System.out.print("Enter your height in inches: "); // prompt
            height = input.nextDouble();

            System.out.print("Enter your weight in pounds: "); // prompt
            weight = input.nextDouble();

            BMI = (weight * 703) / (height * height);
        }

        // Displaying information from Department Of Health and Human Services
        if(BMI < 18.5)
            System.out.print("You are underweight\n");

        if(BMI > 18.5)
            if(BMI < 24.9)
                System.out.print("Normal body mass index\n");

        if(BMI > 25)
            if(BMI < 29.9)
                System.out.print("You are overweight\n");

        if(BMI > 30)
            System.out.print("You are obese\n");

    }

}