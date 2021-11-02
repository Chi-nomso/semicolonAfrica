package designPatterns.strategyPattern3;

public class Reptile extends Animalia {
    public Reptile() {
        super();

        movement = new MoveByCrawling();
        speaking = new SpeakBySqueaking();
    }
}
