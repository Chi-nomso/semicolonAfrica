package designPatterns.strategyPattern4;

public class FlyingDutchKick implements Action{
    @Override
    public String kick() {
        return "this kick is sooo kooooolll";
    }

    @Override
    public String Display() {
        return "display my flying dutch kick";
    }
}
