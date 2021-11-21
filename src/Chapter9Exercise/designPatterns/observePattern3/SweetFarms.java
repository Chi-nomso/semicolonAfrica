package Chapter9Exercise.designPatterns.observePattern3;

import Chapter9Exercise.designPatterns.observerPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class SweetFarms implements FarmLand{
    List<Shop>shops;
    private int size;
    private String location;
    private int productCapacity;
    private int checker;
    private static int shopTracker = 1;

    public SweetFarms(){
        shops = new ArrayList<Shop>();
        checker = ++shopTracker;
    }

    public int getShops(){
        checker = ++shopTracker;
        System.out.println(checker + " Shop(s) are available");
        return checker;
    }

    @Override
    public void add(Shop shop) {
        shops.add(shop);
        //getShops();

    }

    @Override
    public void notifyShop() {
        for(Shop shop : shops) {
            shop.update(size,location,productCapacity);
        }
    }

    public void setSize(int size){
        this.size = size;
        notifyShop();
    }
    public void setLocation(String location){
        this.location = location;
        notifyShop();
    }
    public void setProductCapacity(int productCapacity){
        this.productCapacity = productCapacity;
        notifyShop();
    }

    @Override
    public void remove(Shop shop) {
        int removedShop = shops.indexOf(shop);
        shops.remove(removedShop);
        System.out.println("This Shop "+ removedShop +" has been removed from the registered shops");
    }
}
