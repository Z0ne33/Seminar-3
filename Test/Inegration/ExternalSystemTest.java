package Test.Inegration;

import Integration.ExternalSystem;
import Model.Amount;
import Model.Item;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ExternalSystemTest {

    private Item testItem;
    private ExternalSystem testExternal;
    @BeforeEach
     void setUp(){
        testItem = new Item("orange");
        testExternal = new ExternalSystem();

    }
    @AfterEach
     void tearDown(){
        testItem = null;
    }
    @Test
     void testReturnItemIsNull(){
        Object other = null;
        boolean expResult = false;
        boolean result = testExternal.returnItem(testItem.itemID).equals(other);
        assertEquals(expResult, result, "Is equal to null");

    }

}