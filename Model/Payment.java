package Model;

public class Payment{


    public Amount amountPaid;
    Amount change;


    public Payment(Amount _amountPaid, Amount price){
        this.amountPaid = _amountPaid;


    }
    public void updateRegister(Amount amt, Amount price, Amount _change){
        Register register = new Register(amt, price, Change(price));
        register.printRegister(amt, price, _change);
    }
    public Amount Change(Amount price){
        change = amountPaid.amountMinus(price);
        return change;
    }


}
