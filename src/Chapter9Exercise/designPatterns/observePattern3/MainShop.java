package Chapter9Exercise.designPatterns.observePattern3;

public class MainShop {
    public static void main(String[] args) {
        SweetFarms farm = new SweetFarms();

        AdaShop shop1 = new AdaShop(farm);
        farm.setSize(20);
        farm.setLocation("Semicolon");
        farm.setProductCapacity(5000);
        System.out.println();

        AdaShop shop2 = new AdaShop(farm);
        farm.setSize(50);
        farm.setLocation("Yaba");
        farm.setProductCapacity(50000);
        System.out.println();

        AdaShop shop3 = new AdaShop(farm);
        farm.setSize(100);
        farm.setLocation("Yaba");
        farm.setProductCapacity(100000);
        System.out.println();

//        farm.add(shop1);
//        farm.add(shop2);
//        farm.add(shop3);
//        farm.getShops();
        farm.remove(shop1);





    }
}
