package designPatterns.strategyPattern4;

public class Ken extends Fighter{
    public Ken() {
        super();

        kickAct = new FlyingDutchKick();

        displayAct = new FlyingDutchKick();
    }
}
