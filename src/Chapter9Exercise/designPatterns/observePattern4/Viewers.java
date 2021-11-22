package Chapter9Exercise.designPatterns.observePattern4;

public class Viewers implements Observer {
    private Subject cricketData;
    private double run;
    private double bowl;

    public Viewers(Subject cricketData){
        this.cricketData = cricketData;
        cricketData.add(this);

    }

    public void printResult(){
        System.out.println("The result is: ");
        update(run,bowl);
    }

    @Override
    public void update(double run, double bowl) {
        this.run = run;
        this.bowl = bowl;
        printResult();
    }
}
