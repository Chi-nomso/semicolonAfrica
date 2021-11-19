package Chapter9Exercise.designPatterns.observerPattern;

public class StockObserver implements Observer {
    private Observable stockExchange;
    private double ibmPrice;
    private double applPrice;
    private double goodPrice;

    private int stockId;
    private static int stockTrackingId = 0;

    public StockObserver(Observable stockExchange) {
        this.stockExchange = stockExchange;
        stockId = ++stockTrackingId;
        System.out.println("New Observer " + stockId);
        stockExchange.register(this);
    }

    public void printThePrice(){
        System.out.println(stockId + "\nIBM " + ibmPrice + "\nAPPL " + applPrice + "\nGOOD " + goodPrice );
    }

    @Override
    public void update(Double ibmPrice, Double applPrice, Double goodPrice) {
        this.ibmPrice = ibmPrice;
        this.applPrice = applPrice;
        this.goodPrice = goodPrice;
        printThePrice();
    }
}
