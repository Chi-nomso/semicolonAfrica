package designPatterns.strategyPattern3;

public class SpeakByTalking implements Speakable{
    @Override
    public String speak() {
        return "I can talk as I like";
    }
}
