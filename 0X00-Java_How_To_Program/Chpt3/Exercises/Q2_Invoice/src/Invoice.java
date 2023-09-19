// Invoice.java
// An invoice that a hardware store might use to represent an invoice for an
// item sold at the store

public class Invoice
{
    // instance variables
    private String partNumber; // part number of item
    private String partDescription; // description of item
    private int quantity; // quantity of item being purchased
    private double price; // price of item being sold

    // Invoice constructor to initialize the instance variable
    public Invoice(String partNumber, String partDescription, int quantity, double price)
    {
        this.partNumber = partNumber; // assign partNumber to instance variable partNumber
        this.partDescription = partDescription;// assign partDescription to instance variable partDescription

        // validating quantity and price
        if(quantity > 0) // if quantity is a positive value
            this.quantity = quantity; // assign quantity to instance variable quantity
        if(price > 0.0) // if price is a positive value
            this.price = price; // assign price to instance variable price
    }

    // method to set the part number
    public void setPartNumber(String partNumber)
    {
        this.partNumber = partNumber;
    }

    // method to retrieve the part number
    public String getPartNumber()
    {
        return partNumber;
    }

    // method to set the part description
    public void setPartDescription(String partDescription)
    {
        this.partDescription = partDescription;
    }

    // method to retrieve the part description
    public String getPartDescription()
    {
        return partDescription;
    }

    // method to set the quantity
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    // method to retrieve the quantity
    public int getQuantity()
    {
        return quantity;
    }

    // method to set price
    public void setPrice(double price)
    {
        this.price = price;
    }

    // method to retrieve price
    public double getPrice()
    {
        return price;
    }

    // method that calculates the invoice amount
    public double getInvoiceAmount(int quantity, double price)
    {
        // obtaining the price and quantity
        this.quantity = quantity;
        this.price = price;

        // calculating the invoice amount
        double amount = quantity * price;

        return amount;
    }
}
