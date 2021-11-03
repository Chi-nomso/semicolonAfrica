
package designPatterns.strategyPattern4;

public class ChunLi extends Fighter{
    public ChunLi() {
        super();
        kickAct = new DoubleSlayKick();
        displayAct = new DoubleSlayKick();
    }
}
