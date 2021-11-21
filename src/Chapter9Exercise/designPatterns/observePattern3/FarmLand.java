package Chapter9Exercise.designPatterns.observePattern3;

public interface FarmLand {
    void add(Shop shop);
    void notifyShop();
    void remove (Shop shop);

}
