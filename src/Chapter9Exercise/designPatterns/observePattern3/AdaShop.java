package Chapter9Exercise.designPatterns.observePattern3;

public class AdaShop implements Shop{
    private FarmLand shop;
    private int size;
    private String location;
    private int productCapacity;

    private int checker;
    private static int shopTracker = 0;

    public AdaShop(FarmLand shop){
        this.shop = shop;
        checker = ++shopTracker;
        System.out.println("Shop number " + checker+ " created");
        shop.add(this);
    }

    public void printInformation(){
        System.out.print("The Shop size is "+size + ", located at "+ location + " and has the capacity to take in " + productCapacity+ " products");
        System.out.println();
    }



    @Override
    public void update(int size, String location, int productCapacity) {
        this.size = size;
        this.location = location;
        this.productCapacity = productCapacity;
        printInformation();
    }
}
