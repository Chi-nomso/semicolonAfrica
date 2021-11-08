package Chapter9Exercise.designPatterns.strategyPattern4;

public class DoubleSlayKick implements Action{
    @Override
    public String kick() {
        return "double slay kick is how i make them suffer";
    }

    @Override
    public String Display() {
        return "display my double kick";
    }
}
