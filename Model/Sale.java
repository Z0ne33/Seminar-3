package Model;

import Integration.ExternalSystem;
import Integration.Printer;
import View.View;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Scanner;

import static java.lang.System.out;


public  class Sale {

    ExternalSystem externalSystem = new ExternalSystem();
    LocalDateTime current = LocalDateTime.now();
    public Amount change = new Amount(0);
    public Item searchedItem;


    public Sale(String  _itemID, Amount payment, int quantity){
        Item itemType = getItemType(_itemID);
        searchedItem = itemType;
        Amount totalPrice = new Amount((itemType.price.amount + itemType.vatRate.amount) * quantity);
        change = receiveChange(payment, totalPrice);
        SaleDTO saleDTO = new SaleDTO(quantity, payment, change, itemType,timeOfSale(current), totalPrice );
        createReceipt(saleDTO);

    }


    private Item getItemType(String itemID) {return externalSystem.returnItem(itemID);}

    private Amount receiveChange(Amount amt, Amount price){Payment pay = new Payment(amt, price);return pay.Change(price);}
    private void createReceipt(SaleDTO sale){Receipt receipt = new Receipt(sale);}
    private LocalDateTime timeOfSale(LocalDateTime dateTime){return dateTime;}


}
