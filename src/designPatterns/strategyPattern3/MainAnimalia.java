package designPatterns.strategyPattern3;

public class MainAnimalia {
    public static void main(String[] args) {
       Animalia lion = new Mammal();
       Animalia shark = new Pisces();
       Animalia lizard = new Reptile();

        //Implementing each method on each client Mammal.

        System.out.println("Mammal " + lion.getMovement());
        System.out.println("Mammal " + lion.getSpeaking());
        System.out.println();

        System.out.println("Pisces " + shark.getMovement());
        System.out.println("Pisces " + shark.getSpeaking());
        System.out.println();

        System.out.println("Reptiles " + lizard.getMovement());
        System.out.println("Reptiles " + lizard.getSpeaking());
        System.out.println();

        Animalia snake = new Reptile();
        snake.setMovement(new MoveBySwimming() );
        System.out.println("reptile " + snake.getMovement());

    }
}
