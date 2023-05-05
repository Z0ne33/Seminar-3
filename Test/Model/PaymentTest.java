package Test.Model;

import Model.Amount;
import Model.Payment;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentTest {

    Payment pay;
    Amount amoundPaid;
    Amount price;

    @BeforeEach
    void setUp() {
        amoundPaid = new Amount(100);
        price = new Amount(30);
        pay = new Payment(amoundPaid, price);
    }

    @AfterEach
    void tearDown() {
        amoundPaid = null;
        price = null;
        pay = null;
    }
    @Test
    void payment(){
        Amount other = new Amount(amoundPaid.amount);
        Boolean expResult = true;
        Boolean result = pay.current.equals(other) ;
        assertEquals(expResult, result, "You have indeed paid");

    }
    @Test
    void testIfReceiveChange(){
        Amount other = amoundPaid.amountMinus(price);
        Boolean expResult = true;
        Boolean result = pay.Change(price).equals(other);
        assertEquals(expResult, result, "The right change was received");

    }



}