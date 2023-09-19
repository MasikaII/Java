// InvoiceTest.java
// Creates and manipulates Invoice objects
import java.util.Scanner;

public class InvoiceTest
{
    public static void main(String[] args)
    {
        // Creating Invoice object
        Invoice myInvoice = new Invoice("Default", "Default", 0, 0.0);

        // displaying initial value of invoice
        System.out.println("INVOICE");
        System.out.printf("Part number: %s%n", myInvoice.getPartNumber());
        System.out.printf("Part description: %s%n", myInvoice.getPartDescription());
        System.out.printf("Quantity: %d%n", myInvoice.getQuantity());
        System.out.printf("Price: $%.2f%n", myInvoice.getPrice());
        System.out.printf("Invoice amount: $%.2f%n", myInvoice.getInvoiceAmount(myInvoice.getQuantity(),
                myInvoice.getPrice()));

        // Create a Scanner object to obtain input from command window
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the part number: "); // prompt
        String partNumber = input.nextLine();
        myInvoice.setPartNumber(partNumber);
        System.out.print("Enter part description: "); // prompt
        String partDescription = input.nextLine();
        myInvoice.setPartDescription(partDescription);
        System.out.print("Enter quantity purchased: "); // prompt
        int quantity = input.nextInt();
        myInvoice.setQuantity(quantity);
        System.out.print("Enter the price of item: "); // prompt
        double price = input.nextDouble();
        myInvoice.setPrice(price);

        // displaying initial value of invoice
        System.out.println("\n\nINVOICE");
        System.out.printf("Part number: %s%n", myInvoice.getPartNumber());
        System.out.printf("Part description: %s%n", myInvoice.getPartDescription());
        System.out.printf("Quantity: %d%n", myInvoice.getQuantity());
        System.out.printf("Price: $%.2f%n", myInvoice.getPrice());
        System.out.printf("Invoice amount: $%.2f%n", myInvoice.getInvoiceAmount(myInvoice.getQuantity(),
                myInvoice.getPrice()));
    }

}