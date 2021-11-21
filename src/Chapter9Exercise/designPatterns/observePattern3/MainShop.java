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

        AdaShop shop4 = new AdaShop(farm);
        farm.setSize(300);
        farm.setLocation("zaba");
        farm.setProductCapacity(20000);
        System.out.println();


        farm.getShops();
       farm.remove(shop2);





    }
}
