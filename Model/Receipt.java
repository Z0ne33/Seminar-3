package Model;

import Integration.Printer;

public class Receipt {

    public SaleDTO saleInfo;

    public Receipt(SaleDTO sale){
        this.saleInfo = sale;
        Printer printer = new Printer(saleInfo);

    }
}
