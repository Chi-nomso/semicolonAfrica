package designPatterns.strategyPattern3;

public class SpeakByBubbling implements Speakable{
    @Override
    public String speak() {
        return "I blow up some bubble in the water";
    }
}
