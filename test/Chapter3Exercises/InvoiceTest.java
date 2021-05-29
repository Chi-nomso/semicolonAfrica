package Chapter3Exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvoiceTest {
    private Invoice nomsoInvoice;
    @BeforeEach
    public void setUp(){
    nomsoInvoice = new Invoice("001", "Car radiator", 8, 100);
    }

    @Test
    public void testThatInvoiceHasAPartNumber(){
        assertEquals("001", nomsoInvoice.getPartNumber());
        nomsoInvoice.setPartNumber("001");
    }

    @Test
    public void testThatInvoiceHasPartDescription(){
        nomsoInvoice.setPartDescription("Car radiator");
        assertEquals("Car radiator", nomsoInvoice.getPartDescription());
    }

    @Test
    public void testForQuantityOfItemPurchased(){
        nomsoInvoice.setpurchasedItemQuantity(8);
        assertEquals(8, nomsoInvoice.getpurchasedItemQuantity());
    }

    @Test
    public void testForEachItemPrice(){
        nomsoInvoice.seteachItemPrice(100.0);
        assertEquals(100.0, nomsoInvoice.geteachItemPrice());
    }

    @Test
    public void testForInvoiceAmount(){
        //when
        nomsoInvoice.seteachItemPrice(100.0);
        assertEquals(100.0, nomsoInvoice.geteachItemPrice());
        //and
        nomsoInvoice.setpurchasedItemQuantity(8);
        assertEquals(8, nomsoInvoice.getpurchasedItemQuantity());
        //then
        assertEquals(800.0,nomsoInvoice.getinvoiceAmount());
        }

    @Test
    public void testForNegativePrice(){
        nomsoInvoice.seteachItemPrice(-100.0);
        assertEquals(100.0, nomsoInvoice.geteachItemPrice());
        }

    @Test
    public void testForNegativeQuantity(){
        nomsoInvoice.setpurchasedItemQuantity(-8);
        assertEquals(8,nomsoInvoice.getpurchasedItemQuantity());
    }
 }

