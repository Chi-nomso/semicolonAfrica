package Chapter9Exercise.designPatterns.observePattern4;

public class DisplayCurrentScore implements Observer, DisplayElements{
    private double run;
    private double bowl;

    @Override
    public void display() {
        this.run = run;
        this.bowl = bowl;
    }

    @Override
    public void update(double run, double bowl) {
        this.run = run;
        this.bowl = bowl;
        display();
    }
}
