
package Chapter9Exercise.designPatterns.strategyPattern4;

public class ChunLi extends Fighter{
    public ChunLi() {
        super();
        kickAct = new DoubleSlayKick();
        displayAct = new DoubleSlayKick();
    }
}
