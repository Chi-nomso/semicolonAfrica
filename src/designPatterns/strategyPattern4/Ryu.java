package designPatterns.strategyPattern4;

public class Ryu extends Fighter{
    public Ryu() {
        super();
        kickAct = new SlidingGroundKick();
        displayAct = new SlidingGroundKick();
    }
}
