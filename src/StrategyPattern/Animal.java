package StrategyPattern;
/**Bird returns I can flyable
 * Dog returns I can't flyable
 * Fish returns I can't flyable, I can only swim.
 * Interface Fly()
 *Move my flying, swimming, running
 * make Dog flyable
 * make Bird swim
 * */
public class Animal {
    Flying flyable;

    public void setFlyable(Flying flyable) {
        this.flyable = flyable;
    }

    public String getFlyable() {
        return flyable.fly();
    }
}
