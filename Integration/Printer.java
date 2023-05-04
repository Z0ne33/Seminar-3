package Integration;
import static java.lang.System.out;


import Model.Receipt;
import Model.SaleDTO;

public class Printer {
    SaleDTO saleInfo;
    public Printer(SaleDTO sale){
        saleInfo = sale;
        printReceipt();
    }

    // This method is used for to print the receipt based on the sale info
    public void printReceipt(){
        out.println("\n   RECEIPT   ");
        out.println("Name of item: " + saleInfo.getItemType().itemID);
        out.println("Quantity: " + saleInfo.getQuantity() + " Total Price: " + saleInfo.getTotalPrice().amount);
        out.println("Vat for entire Sale: " + saleInfo.getTotalVatRate().amount);
        out.println("Amount Paid: " + saleInfo.getAmtPaid().amount + " Amount Change: " + saleInfo.getChange().amount);
        out.println("Time of sale: " + saleInfo.getDateTime());



    }
}
