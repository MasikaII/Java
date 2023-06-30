//Using dialog-based input and output with the methods of class JOptionPane
//to perform simple addition
import javax.swing.JOptionPane;

public class Addition
{
    public static void main(String[] args)
    {
        //obtaining user input
        String number1 = JOptionPane.showInputDialog("Enter first number");
        String number2 = JOptionPane.showInputDialog("Enter second number");

        //convert inputs from String to int
        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);

        //Adding the two numbers
        int sum = num1 + num2;

        //message to be displayed
        String message = String.format("The sum is: %d", sum);

        //Displaying the message
        JOptionPane.showMessageDialog(null, message);
    }
}