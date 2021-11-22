package Chapter9Exercise.designPatterns.observePattern4;

public class DisplayAverageScore implements Observer, DisplayElements{
    private double avgRunRate = 50.0;
    private double avgBowlingRate = 0.5;
    private double run;
    private double bowl;

    @Override
    public void display() {
        double totalAverageScore = (avgRunRate * run) / (avgBowlingRate * bowl);
        System.out.println("The average Score is " + totalAverageScore);
    }

    @Override
    public void update(double run, double bowl) {
        this.run = run;
        this.bowl = bowl;
        display();

    }
}
