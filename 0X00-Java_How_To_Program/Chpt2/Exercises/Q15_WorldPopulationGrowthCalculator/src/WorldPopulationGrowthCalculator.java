// An application that inputs the current world population and the annual world
// population growth rate, then displays the estimated world population after
// one, two, three, four and five years
import java.util.Scanner;

public class WorldPopulationGrowthCalculator
{
    // method main begins execution of Java application
    public static void main(String[] args)
    {
        // Creating a new Scanner object
        Scanner input = new Scanner(System.in);

        // Declaring variables
        double currentPop; // Current world population
        double growthRate; // Annual world population growth rate
        double year1, year2, year3, year4, year5;

        System.out.print("Enter the current world population: ");
        currentPop = input.nextDouble();

        System.out.print("Enter the annual world population growth rate: ");
        growthRate = input.nextDouble();

        // Estimating world population for the next five
        year1 = currentPop + (currentPop * growthRate);
        year2 = year1 + (year1 * growthRate);
        year3 = year2 + (year2 * growthRate);
        year4 = year3 + (year3 * growthRate);
        year5 = year4 + (year4 * growthRate);

        System.out.printf("Estimated population after one year is %f%n", year1);
        System.out.printf("Estimated population after two years is %f%n", year2);
        System.out.printf("Estimated population after three years is %f%n", year3);
        System.out.printf("Estimated population after four years is %f%n", year4);
        System.out.printf("Estimated population after five years is %f%n", year5);
    }
}