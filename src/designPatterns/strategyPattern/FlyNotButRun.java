package designPatterns.strategyPattern;

public class FlyNotButRun implements Flying{
    @Override
    public String fly() {
        return  "I can't flyable, I can only Run";
    }
}
