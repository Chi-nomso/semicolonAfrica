package Chapter9Exercise.designPatterns.observerPattern;

public class StockMain {
    public static void main(String[] args) {

        StockExchange stockExchange = new StockExchange();

        StockObserver stockObserver1 = new StockObserver(stockExchange);
        stockExchange.setIbmPrice(768.9);
        stockExchange.setApplPrice(654.9);
        stockExchange.setGoodPrice(432.9);

        StockObserver stockObserver2 = new StockObserver(stockExchange);
        stockExchange.setIbmPrice(324.1);
        stockExchange.setApplPrice(467.90);
        stockExchange.setGoodPrice(534.90);

        stockExchange.unregister(stockObserver2);


    }
}
