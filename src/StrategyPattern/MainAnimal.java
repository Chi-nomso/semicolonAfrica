package StrategyPattern;

public class MainAnimal {
    public static void main(String[] args) {
       Animal ugo = new Bird();
       Animal nkita = new Dog();
       Animal azun = new Fish();

       //Implementing individual methods on each Client.

       ugo.setFlyable(new FlyByFlapping());
       System.out.println("Bird " + ugo.getFlyable());

       nkita.setFlyable(new FlyNotButRun());
        System.out.println("Dog "+ nkita.getFlyable());

        azun.setFlyable(new FlyNotButSwim());
        System.out.println("Fish " + azun.getFlyable());
        System.out.println();

        //Implementing the fly method on Dog Client
        Animal aja = new Dog();
        aja.setFlyable(new FlyByFlapping());
        System.out.println("Dog " + aja.getFlyable());
        System.out.println();

        //Implementing the Swimming method on Bird
        Animal eye = new Bird();
        eye.setFlyable(new FlyNotButSwim());
        System.out.println("Bird " + eye.getFlyable());


    }
}
