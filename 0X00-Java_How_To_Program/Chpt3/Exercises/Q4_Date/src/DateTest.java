// DateTest.java
// A class that creates and manipulates objects of class Date
import java.util.Scanner;

public class DateTest
{
    public static void main(String[] args)
    {
        // Creating object of class Date
        Date date = new Date(0,0,0);

        // Creating a new Scanner object to read input from command window
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the day: "); // prompt
        int day = input.nextInt();
        date.setDay(day); // setting the day

        System.out.print("Enter the month: "); // prompt
        int month = input.nextInt();
        date.setMonth(month); // setting the month

        System.out.print("Enter the year: "); // prompt
        int year = input.nextInt();
        date.setYear(year); // setting the year

        // display the date
        date.displayDate();

    }

}