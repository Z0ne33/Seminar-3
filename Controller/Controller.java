package Controller;

import Model.*;
import Startup.Main;
import View.View;

import java.util.Objects;
import java.util.Scanner;

import static java.lang.System.out;

public class Controller {
    int quantity;
    String continueSale = "";



    public Controller(int _quantity, Amount payment, String _itemID){

        Item searhedItem = new Item(_itemID);
        this.quantity = _quantity;
        startSale(searhedItem, payment, _quantity);

        continueSale = saleContinue(continueSale);

        if (Objects.equals(continueSale, "n")){
            return;
        } else if (Objects.equals(continueSale, "y")) {
            new View();
        }


    }

    public void startSale(Item item, Amount amtPayment, int quantity){

        item = new Item(item.itemID);
        Sale sale = new Sale(item.itemID, amtPayment, quantity);
        payItem(amtPayment,sale, quantity);

    }
    private String saleContinue(String continueSale){
        Scanner myObj = new Scanner(System.in);
        out.println("Would you like to continue sale y or n");
        continueSale = myObj.nextLine();
        return continueSale;

    }
    public void payItem(Amount payment, Sale sale, int quantity){
        Payment pay = new Payment(payment, sale.searchedItem.price);
        Amount totalPrice = new Amount(sale.searchedItem.price.amount * quantity);
        pay.updateRegister(payment, totalPrice,sale.change);
    }
    private void endSale(){System.out.println("Sale has ended");System.exit(0);}



}
