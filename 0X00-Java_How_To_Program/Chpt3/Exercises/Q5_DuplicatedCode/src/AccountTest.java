// AccountTest.java
// Inputting and outputting floating point numbers with Account objects
// AccountTest.java also introduces a method to eliminate duplicate statements
import java.util.Scanner;

public class AccountTest
{
    // method main begins execution of Java application
    public static void main(String[] args)
    {
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        // display initial balance of each object
        displayAccount(account1);
        displayAccount(account2);


        // create a Scanner object to obtain input from the command window
        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: "); // prompt
        double depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount); // add to account1's balance

        // display balances
        displayAccount(account1);
        displayAccount(account2);

        System.out.print("Enter deposit amount for account2: "); // prompt
        depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount); // add to account1's balance

        // display balances
        displayAccount(account1);
        displayAccount(account2);

        System.out.print("Enter the amount to be withdrawn from account1: "); // prompt
        double withdrawAmount = input.nextDouble(); // obtain user input
        System.out.printf("%nsubtracting %.2f from account1 balance%n%n", withdrawAmount);
        account1.withdraw(withdrawAmount); // subtract from account1's balance

        // display balances
        displayAccount(account1);
        displayAccount(account2);

        System.out.print("Enter the amount to be withdrawn from account2: "); // prompt
        withdrawAmount = input.nextDouble(); // obtain user input
        System.out.printf("%nsubtracting %.2f from account2 balance%n%n", withdrawAmount);
        account2.withdraw(withdrawAmount); // subtract from account2's balance

        // display balances
        displayAccount(account1);
        displayAccount(account2);
    }

    // method displayAccount eliminates duplicate statements used to display
    // Account objects' names and balance
    public static void displayAccount(Account accountToDisplay)
    {
        System.out.printf("%s balance: $%.2f%n", accountToDisplay.getName(), accountToDisplay.getBalance());
    }

}