package Controller;

import Model.*;
import Startup.Main;

public class Controller {
    int quantity;

    public Controller(int _quantity, Amount payment, String _itemID){

        Item searhedItem = new Item(_itemID);
        this.quantity = _quantity;
        startSale(searhedItem, payment, _quantity);
    }

    public void startSale(Item item, Amount amtPayment, int quantity){

        item = new Item(item.itemID);
        Sale sale = new Sale(item.itemID, amtPayment, quantity);
        payItem(amtPayment,sale, quantity);

    }
    public void payItem(Amount payment, Sale sale, int quantity){
        Payment pay = new Payment(payment, sale.searchedItem.price);
        Amount totalPrice = new Amount(sale.searchedItem.price.amount * quantity);
        pay.updateRegister(payment, totalPrice,sale.change);
    }
    public void endSale(){
        System.out.println("Sale has ended");
        System.exit(0);
    }

}
