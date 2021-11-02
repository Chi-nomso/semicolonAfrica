package designPatterns.strategyPattern3;

public class MoveByWalking implements Movable{
    @Override
    public String move() {
        return "I walk around the World";
    }
}
