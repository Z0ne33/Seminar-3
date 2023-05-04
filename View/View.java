package View;
import static java.lang.System.out;
import Controller.Controller;
import Model.Amount;

import java.util.Scanner;

public class View {

    String itemID = "";
    int quantity = 0;
    Amount pay = new Amount(0);
    public View( ){

        userInterface();
        Controller contr = new Controller(quantity, pay, itemID);

    }
    private void userInterface(){
        Scanner myObj = new Scanner(System.in);
        out.println("Enter Item ID: " );
        itemID = myObj.nextLine();

        out.println("Enter quantity: " );
        quantity = myObj.nextInt();

        out.println("Enter payment: " );
        pay = new Amount(myObj.nextInt());

    }
}
