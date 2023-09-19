// Date.java
// A class that inputs the day, month, year and displays the date

public class Date
{
    // Declaring instance variables
    private int day;
    private int month;
    private int year;

    // Class Date's constructor
    public Date(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // method for setting the day
    public void setDay(int day)
    {
        this.day = day;
    }

    // method to retrieve the day
    public int getDay()
    {
        return day;
    }

    // method for setting the month
    public void setMonth(int month)
    {
        this.month = month;
    }

    // method to retrieve the month
    public int getMonth()
    {
        return month;
    }

    // method for setting the year
    public void setYear(int year)
    {
        this.year = year;
    }

    // method to retrieve the year
    public int getYear()
    {
        return year;
    }

    // method that displays the month, day and year separated by forward slashes(/)
    public void displayDate()
    {
        System.out.printf("%d/%d/%d%n", getDay(),getMonth(),getYear());
    }
}