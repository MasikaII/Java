// An application that inputs from the user the radius of a circle as an integer
// and print's the circle's diameter, circumference and area using the
// floating-point value 3.14159 for π.
import java.util.Scanner;

public class Circle
{
    // method main begins execution of Java application
    public static void main(String[] args)
    {
        // Creating a new Scanner object
        Scanner input = new Scanner(System.in);

        // Declaring variables
        int radius; //radius of the circle
        double PI = Math.PI;

        System.out.print("Enter radius of the circle: ");
        radius = input.nextInt();

        System.out.printf("The diameter of the circle is %d%n", (2 * radius));
        System.out.printf("The circumference of the circle is %f%n", (2 * PI * radius));
        System.out.printf("The area of the circle is %f%n", (PI * radius * radius));
    }
}