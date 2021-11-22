package Chapter9Exercise.designPatterns.observePattern4;

import java.util.ArrayList;
import java.util.List;

public class CricketData implements Subject {
    private List<Observer> observers;
    private double run;
    private double bowl;

    public CricketData(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        int removedObserver = observers.indexOf(observer);
        observers.remove(removedObserver);
        System.out.println("This Viewer has been removed");
    }

    @Override
    public void display() {
        this.run = run;
        this.bowl = bowl;
    }

    @Override
    public void notifyViewers() {
        for(Observer viewer: observers){
            viewer.update(run, bowl);
        }
    }

    public void setRunRate(double run){
        this.run = run;
        notifyViewers();
    }

    public void setBowlingRate(double bowl){
        this.bowl = bowl;
        notifyViewers();
    }
}
