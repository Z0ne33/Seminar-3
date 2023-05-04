package Model;

public class Amount {
     public int amount;

     public Amount(int _amount){this.amount = _amount;}
     public Amount amountMinus(Amount otherAmount){
         return new Amount(amount - otherAmount.amount);
     }

}
