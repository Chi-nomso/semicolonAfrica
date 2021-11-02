package designPatterns.strategyPattern3;

public class Pisces extends Animalia {
    public Pisces() {
        super();

        movement = new MoveBySwimming();

        speaking = new SpeakByBubbling();
    }
}
