//Account.java
//Account class with double instance variable balance and a constructor and
//methods deposit and withdraw that perform validation
public class Account
{
    private String name; //instance variable
    private double balance; //instance variable

    //Account constructor that receives two parameters
    public Account(String name, double balance)
    {
        this.name = name; //assign name to instance variable name

        //validate that balance is greater than 0.0; if it's not instance variable
        //balance keeps its default initial value of 0.0
        if(balance > 0.0) //if balance is valid
            this.balance = balance; //assign it to instance variable balance
    }

    //method that deposits (adds) only a valid amount to the balance
    public void deposit(double depositAmount)
    {
        if(depositAmount > 0.0) //if the depositAmount is valid
            balance = balance + depositAmount; //add it to the balance
    }

    //method that withdraws (subtracts) only a valid amount from the balance
    public void withdraw(double withdrawAmount)
    {
        if(withdrawAmount < balance) //if withdrawAmount is valid
            balance = balance - withdrawAmount; //withdraw from account
        if(withdrawAmount > balance)
            System.out.print("Withdrawal amount exceeded account balance. \n");
    }

    //method that returns account balance
    public double getBalance()
    {
        return balance;
    }

    //method that sets the name
    public void setName(String name)
    {
        this.name = name;
    }

    //method that returns the name
    public String getName()
    {
        return name;
    }
}
