# EXERCISE
Questions on concepts covered in the section

## QUESTIONS
1. (Modified class Account)Modify class Account:
    ```java
    1. //Account class with a double instance variable balance and a
    2. //constructor and deposit method that perform validation
    3. 
    4. public class Account
    5. {
    6.      private String name; //instance variable
    7.      private double balance; //instance variable
    8.      
    9.      //Account constructor that receives two parameters
    10.     public Account(String name, double balance)
    11.     {
    12.            this.name = name; //assign name to instance variable name
    13.            
    14.            //validate that the balance is greater than 0.0; if it's not
    15.            //instance variable balance keeps its default initial value of 0.0
    16.            if(balance > 0.0) //if the balance is valid
    17.                 this.balance = balance; //assign it to instance variable balance
    18.     }
    19.
    20.     //method that deposits (adds) only a valid amount to the balance
    21.     public void deposit(double depositAmount)
    22.     {
    23.            if(depositAmount > 0.0) //if the depositAmount is valid
    24.                 balance = balance + depositAmount; //add it to the balance
    25.     }
    26.     
    27.     //method returns the account balance
    28.     public double getBalance()
    29.     {
    30.         return balance;
    31.     }
    32.
    33.     //method that sets the name
    34.     public void setName(String name)
    35.     {
    36.         this.name = name;
    37.     }
    38.
    39.     //method that returns the name
    40.     public String getName()
    41.     {
    42.         return name; //give value of name back to caller
    43.     } //end getName
    44. }
    ```
    to provide a method called withdraw that withdraws money from an Account. Ensure that the withdrawal amount does not exceed the Account’s balance. If it does, the balance should be left unchanged and the method should print a message indicating "Withdrawal amount exceeded account balance." Modify class AccountTest to test method withdraw:
    ```java
    1. //inputting and outputting floating point numbers with Account object
    2. import java.util.Scanner;
    3. 
    4. public class AccountTest
    5. {
    6.      public static void main(String[] args)
    7.      {
    8.              Account account1 = new Account("Jane Green", 50.00);
    9.              Account account2 = new Account("John Blue", -7.53);
    10.     
    11.             //display initial balance of each object
    12.             System.out.printf("%s balance: $%.2f%n",
    13.                 account1.getName(), account1.getBalance());
    14.             System.out.printf("%s balance: $%.2f%n",
    15.                 account2.getName(), account2.getBalance());
    16.            
    17.             //create a Scanner to obtain input from the command window
    18.             Scanner input = new Scanner(System.in);
    19.
    20.             System.out.print("Enter deposit amount for account1: "); //prompt
    21.             double depositAmount = input.nextDouble(); //obtain user input
    22.             System.out.printf("%nadding %.2f to account1 balance %n%n",
    23.                 depositAmount);
    24.             account1.deposit(depositAmount); //add to account1's balance
    25.     
    26.             //display balances
    27.             System.out.printf("%s balance: $%.2f%n",
    28.                 account1.getName(), account1.getBalance());
    29.             System.out.printf("%s balance: $%.2f%n%n",
    30.                 account2.getName(), account2.getBalance());
    31.     
    32.             System.out.print("Enter deposit amount for account2: ");
    33.             depositAmount = input.nextDouble(); //obtain user input
    34.             System.out.printf("%nadding %.2f to account2 balance %n%n",
    35.                 depositAmount);
    36.             account2.deposit(depositAmount); //add to account2 balance
    37.     
    38.             //display balances
    39.             System.out.printf("%s balance: $%.2f%n",
    40.                 account1.getName(), account1.getBalance());
    41.             System.out.printf("%s balance: $%.2f%n",
    42.                 account2.getName(), account2.getBalance());
    43.             } //end main
    44. } //end class AccountTest
    ```
2. (Invoice Class) Create a class called Invoice that a hardware store might use to represent an invoice for an item sold at the store. An Invoice should include four pieces of information as instance variables—a part number(type String), a part description (type String), a quantity of the item being purchased (type int) and a price per item (double). Your class should have a constructor that initializes the four instance variables. Provide a set and a get method for each instance variable. In addition, provide a method named getInvoiceAmount that calculates the invoice amount (i.e., multiplies the quantity by the price per item), then returns the amount as a double value. If the quantity is not positive, it should be set to 0. If the price per item is not positive, it should be set to 0.0. Write a test app named InvoiceTest that demonstrates class Invoice’s capabilities.
3. (Employee Class) Create a class called Employee that includes three instance variables—a first name (type String), a last name (type String) and a monthly salary (double). Provide a constructor that initializes the three instance variables. Provide a set and a get method for each instance variable. If the monthly salary is not positive, do not set its value. Write a test app named EmployeeTest that demonstrates class Employee’s capabilities. Create two Employee objects and display each object’s yearly salary. Then give each Employee a 10% raise and display each Employee’s yearly salary again.
4. (Date Class) Create a class called Date that includes three instance variables—a month (type int), a day (type int) and a year (type int). Provide a constructor that initializes the three instance variables and assumes that the values provided are correct. Provide a set and a get method for each instance variable. Provide a method displayDate that displays the month, day and year separated by forward slashes (/). Write a test app named DateTest that demonstrates class Date’s capabilities.
5. (Removing Duplicated Code in Method main) In the AccountTest class of Q1, method main contains six statements (lines 12–13, 14–15, 27–28, 29–30, 39–40 and 41–42) that each display an Account object’s name and balance. Study these statements and you’ll notice that they differ only in the Account object being manipulated—account1 or account2. In this exercise, you’ll define a new displayAccount method that contains one copy of that output statement. The method’s parameter will be an Account object and the method will output the object’s name and balance. You’ll then replace the six duplicated statements in main with calls to displayAccount, passing as an argument the specific Account object to output.
Modify class AccountTest class of Q1 to declare the following displayAccount method after the closing right brace of main and before the closing right brace of class AccountTest:
```java
    public static void displayAccount(Account accountToDisplay)
    {
    // place the statement that displays
    // accountToDisplay's name and balance here
    }
```
Replace the comment in the method’s body with a statement that displays accountToDisplay’s name and balance Recall that main is a static method, so it can be called without first creating an object of the class in which main is declared. We also declared method displayAccount as a static method. When main needs to call another method in the same class without first creating an object of that class, the other method also must be declared static. Once you’ve completed displayAccount’s declaration, modify main to replace the statements that display each Account’s name and balance with calls to displayAccount—each receiving as its argument the account1 or account2 object, as appropriate. Then, test the updated AccountTest class.

### MAKING A DIFFERENCE
6. (Target-Heart-Rate Calculator) While exercising, you can use a heart-rate monitor to see that your heart rate stays within a safe range suggested by your trainers and doctors. According to the American Heart Association (AHA) (www.americanheart.org/presenter.jhtml?identifier=4736), the formula for calculating your maximum heart rate in beats per minute is 220 minus your age in years. Your target heart rate is a range that’s 50–85% of your maximum heart rate. [Note: These formulas are estimates provided by the AHA. Maximum and target heart rates may vary based on the health, fitness and gender of the individual. Always consult a physician or qualified health-care professional before beginning or modifying an exercise program.] Create a class called HeartRates. The class attributes should include the person’s first name, last name and date of birth (consisting of separate attributes for the month, day and year of birth). Your class should have a constructor that receives this data as parameters. For each attribute provide set and get methods. The class also should include a method that calculates and returns the person’s age (in years), a method that calculates and returns the person’s maximum heart rate and a method that calculates and returns the person’s target heart rate. Write a Java app that prompts for the person’s information, instantiates an object of class HeartRates and prints the information from that object—including the person’s first name, last name and date of birth—then calculates and prints the person’s age in (years), maximum heart rate and target-heart-rate range.
7. (Computerization of Health Records) A health-care issue that has been in the news lately is the computerization of health records. This possibility is being approached cautiously because of sensitive privacy and security concerns, among others. [We address such concerns in later exercises.] Computerizing health records could make it easier for patients to share their health profiles and histories among their various health-care professionals. This could improve the quality of health care, help avoid drug conflicts and erroneous drug prescriptions, reduce costs and, in emergencies, could save lives. In this exercise, you’ll design a “starter” HealthProfile class for a person. The class attributes should include the person’s first name, last name, gender, date of birth (consisting of separate attributes for the month, day and year of birth), height (in inches) and weight (in pounds). Your class should have a constructor that receives this data. For each attribute, provide set and get methods. The class also should include methods that calculate and return the user’s age in years, maximum
heart rate and target-heart-rate range (see Q6), and body mass index (BMI). Write a Java app that prompts for the person’s information, instantiates an object of class HealthProfile for that person and prints the information from that object—including the person’s first name, last name, gender, date of birth, height and weight—then calculates and prints the person’s age in years, BMI, maximum heart rate and target-heart-rate range. It should also display the BMI values chart.