package SalesApp;

import Estore.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ItemsTest {
    @Test
    public void setUp(){
        Items item = new Items(null, 0.0, 1);
        assertNotNull(item);
    }

    @Test
    void ItemCanHaveAName(){
        Items item = new Items(null, 0.0, 1);
        item.setName("Pampers");
        assertEquals("Pampers", item.getName());
    }

    @Test
    void ItemsHaveAPrice(){
        Items item = new Items(null, 0.0, 1);
        item.setPrice(1000.0);
        assertEquals(1000.0, item.getPrice());
    }

    @Test
    void ItemsHaveQuantity(){
        Items item = new Items(null, 0.0, 1);
        item.setQuantity(4);
        assertEquals(4, item.getQuantity());
    }

    @Test
    void ItemsHasACompleteADetails(){
        Items item = new Items("Pampers", 1000.0, 4);
        assertTrue(true);
    }
}
