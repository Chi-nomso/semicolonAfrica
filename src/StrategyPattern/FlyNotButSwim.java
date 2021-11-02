package StrategyPattern;

public class FlyNotButSwim implements Flying{
    @Override
    public String fly() {
        return "I can't flyable, I can only swim.";
    }
}
