package Model;

import Integration.ExternalSystem;

import java.util.UUID;

public class Item {


    public String itemID;
    public String Descritption;
    public Amount price;
    public Amount vatRate;

    public Item(String _itemID){this.itemID = _itemID;}

}
