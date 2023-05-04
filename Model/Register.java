package Model;
import static java.lang.System.out;


public class Register {
    public Amount amountPresent = new Amount(0);
    public Amount amountPaid;


    public Register(Amount _amountPaid, Amount price, Amount change){
        this.amountPaid = _amountPaid;
        this.amountPresent = amountPaid.amountMinus(price);

    }
    // method is used in order to print receipt
    public void printRegister(Amount payment, Amount totalPrice, Amount change){
        out.println("\n   REGISTER   ");
        out.println("Payment: " + payment.amount);
        out.println("Total price: " + totalPrice.amount);
        out.println("Change : " + change.amount);
    }


}