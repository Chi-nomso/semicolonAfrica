package designPatterns.strategyPattern3;

public class MoveByCrawling implements Movable{
    @Override
    public String move() {
        return "I crawl around the World";
    }
}
