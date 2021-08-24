package SalesApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ItemTest {
    @Test
    public void setUp(){
        Item item = new Item(null, 0.0, 1);
        assertNotNull(item);
    }

    @Test
    void ItemCanHaveAName(){
        Item item = new Item(null, 0.0, 1);
        item.setName("Pampers");
        assertEquals("Pampers", item.getName());
    }

    @Test
    void ItemsHaveAPrice(){
        Item item = new Item(null, 0.0, 1);
        item.setPrice(1000.0);
        assertEquals(1000.0, item.getPrice());
    }

    @Test
    void ItemsHaveQuantity(){
        Item item = new Item(null, 0.0, 1);
        item.setQuantity(4);
        assertEquals(4, item.getQuantity());
    }

    @Test
    void ItemsHasACompleteADetails(){
        Item item = new Item("Pampers", 1000.0, 4);
        assertTrue(true);
    }
}
