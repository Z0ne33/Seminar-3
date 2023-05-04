package Model;

import Integration.ExternalSystem;

import java.time.LocalDateTime;

public class SaleDTO {

    int quantity;
    Amount amtPaid;
    Amount change;
    Item itemType;

    Amount totalVatRate;
    Amount totalPrice;
    LocalDateTime dateTime;

    public SaleDTO(int quantity,Amount amountPaid, Amount change, Item itemType, LocalDateTime timeDate, Amount totPrice) {
        this.quantity = quantity;
        this.amtPaid = amountPaid;
        this.change = change;
        this.itemType = itemType;
        this.dateTime = timeDate;
        this.totalPrice = totPrice;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public Amount getChange() {
        return change;
    }

    public Amount getAmtPaid() {
        return amtPaid;
    }

    public Item getItemType() {return itemType;}

    public int getQuantity() {
        return quantity;
    }

    public Amount getTotalPrice() {totalPrice  = new Amount(totalPrice.amount);return totalPrice;}

    public Amount getTotalVatRate() {totalVatRate = new Amount(itemType.vatRate.amount * quantity);return totalVatRate;}
}
