package SalesApp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StoreCart {
    private  List<Item> items = new ArrayList<>();

    public void add(Item item) {
        items.add(item);
    }

    public List<Item> getItem() {
        return items;
    }


    public void remove(Item item2) {
        items.remove(item2);
    }
}