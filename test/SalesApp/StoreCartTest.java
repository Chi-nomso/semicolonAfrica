package SalesApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class StoreCartTest {
    @Test
    public void setUp(){
        StoreCart cart = new StoreCart();
        assertNotNull(cart);
    }

    @Test
    void CartCanAddAnItem(){
        StoreCart cart = new StoreCart();
        Item item = new Item("Pampers", 1000.0, 4);
        Item item2 = new Item("Baby Oil", 500.0, 4);
        Item item3 = new Item("Baby Soap", 300.0, 4);
        cart.add(item);
        cart.add(item2);
        cart.add(item3);
        assertEquals(3, cart.getItem().size());
    }

    @Test
    void CartCanRemoveAnItem(){
        StoreCart cart = new StoreCart();
        Item item = new Item("Pampers", 1000.0, 4);
        Item item2 = new Item("Baby Oil", 500.0, 4);
        Item item3 = new Item("Baby Soap", 300.0, 4);
        cart.add(item);
        cart.add(item3);
        cart.remove(item2);
        assertEquals(2,cart.getItem().size());
    }
}
