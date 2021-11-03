package designPatterns.strategyPattern4;

public class SlidingGroundKick implements Action{
    @Override
    public String kick() {
        return "Sliding kick make them suffer more";
    }

    @Override
    public String Display() {
        return "display my sliding kick";
    }
}
