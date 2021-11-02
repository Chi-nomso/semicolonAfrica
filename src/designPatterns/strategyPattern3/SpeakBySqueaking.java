package designPatterns.strategyPattern3;

public class SpeakBySqueaking implements Speakable{
    @Override
    public String speak() {
        return "I squeak anyhow";
    }
}
