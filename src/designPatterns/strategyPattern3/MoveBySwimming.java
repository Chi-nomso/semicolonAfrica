package designPatterns.strategyPattern3;

public class MoveBySwimming implements Movable{

    @Override
    public String move() {
        return "I Swim around the world";
    }
}
