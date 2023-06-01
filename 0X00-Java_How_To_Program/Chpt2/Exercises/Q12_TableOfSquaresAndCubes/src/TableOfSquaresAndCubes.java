// An application that calculates the squares and cubes of the numbers from
// 0 to 10 and prints the resulting values in table format

public class TableOfSquaresAndCubes
{
    // main method begins execution of Java application
    public static void main(String[] args)
    {
        // Declaring variables
        int num, num1, num2, num3, num4, num5, num6, num7, num8, num9, num10;
        int sq, sq1, sq2, sq3, sq4, sq5, sq6, sq7, sq8, sq9, sq10;
        int c, c1, c2, c3, c4, c5, c6, c7, c8, c9, c10;

        // Calculating squares and cubes of numbers
        num = 0; sq = num * num; c = num * num * num;
        num1 = 1; sq1 = num1 * num1; c1 = num1 * num1 * num1;
        num2 = 2; sq2 = num2 * num2; c2 = num2 * num2 * num2;
        num3 = 3; sq3 = num3 * num3; c3 = num3 * num3 * num3;
        num4 = 4; sq4 = num4 * num4; c4 = num4 * num4 * num4;
        num5 = 5; sq5 = num5 * num5; c5 = num5 * num5 * num5;
        num6 = 6; sq6 = num6 * num6; c6 = num6 * num6 * num6;
        num7 = 7; sq7 = num7 * num7; c7 = num7 * num7 * num7;
        num8 = 8; sq8 = num8 * num8; c8 = num8 * num8 * num8;
        num9 = 9; sq9 = num9 * num9; c9 = num9 * num9 * num9;
        num10 = 10; sq10 = num10 * num10; c10 = num10 * num10 * num10;

        // Displaying table os squares and cubes
        System.out.print("number\tsquare\tcube\n");
        System.out.printf("%d\t%d\t%d%n", num, sq, c);
        System.out.printf("%d\t%d\t%d%n", num1, sq1, c1);
        System.out.printf("%d\t%d\t%d%n", num2, sq2, c2);
        System.out.printf("%d\t%d\t%d%n", num3, sq3, c3);
        System.out.printf("%d\t%d\t%d%n", num4, sq4, c4);
        System.out.printf("%d\t%d\t%d%n", num5, sq5, c5);
        System.out.printf("%d\t%d\t%d%n", num6, sq6, c6);
        System.out.printf("%d\t%d\t%d%n", num7, sq7, c7);
        System.out.printf("%d\t%d\t%d%n", num8, sq8, c8);
        System.out.printf("%d\t%d\t%d%n", num9, sq9, c9);
        System.out.printf("%d\t%d\t%d%n", num10, sq10, c10);
    }

}