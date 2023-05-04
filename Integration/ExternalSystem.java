package Integration;

import Model.Amount;
import Model.Item;
import Model.SaleDTO;

public class ExternalSystem {

  Item [] items = new Item[2];


    public ExternalSystem(){
        items[0] = new Item("apple");
        items[1] = new Item("orange");
        LoadItemPrice();
        LoadVatRate();
    }
    private void loadItemDescription(){}
    private void LoadItemPrice(){
        items[0].price = new Amount(10);
        items[1].price = new Amount(15);

    }
    private void LoadVatRate(){
        for(int i = 0; i < items.length; i++){
           items[i].vatRate = new Amount(items[i].price.amount * 20/100);
        }

    }

    // The Following method has the task to return The item thas is being purchased
    public Item returnItem(String ItemID){
        for (int i = 0; i < items.length; i++){
            if (items[i].itemID == ItemID){
                return items[i];
            }
        }
        return items[0];

    }

}
