package Chapter9Exercise.designPatterns.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class StockExchange implements Observable {
    List<Observer>observers;
    private double ibmPrice;
    private double applPrice;
    private double goodPrice;

    public StockExchange() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void unregister(Observer observer) {
        int deletedObserver = observers.indexOf(observer);
        observers.remove(deletedObserver);
        System.out.println("this observer " + deletedObserver + " has been deleted");
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers){
            observer.update(ibmPrice,applPrice,goodPrice);
        }
    }

    public void setIbmPrice(Double ibmPrice){
        this.ibmPrice = ibmPrice;
        notifyObserver();
    }


    public void setApplPrice(Double applPrice){
        this.applPrice = applPrice;
        notifyObserver();
    }

    public void setGoodPrice(Double goodPrice){
        this.goodPrice = goodPrice;
        notifyObserver();
    }
}
