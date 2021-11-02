package designPatterns.strategyPattern3;

public class Mammal extends Animalia {
    public Mammal() {
        super();

        movement = new MoveByWalking();

        speaking = new SpeakByTalking();
    }
}
