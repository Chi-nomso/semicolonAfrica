package Chapter9Exercise.designPatterns.observePattern2;

public class Main {
    public static void main(String[] args) {
        BestTank bestTank = new BestTank();

        FirstBucket bucket1 = new FirstBucket(bestTank);

         bestTank.setQuantity(200);
         bestTank.setWaterType("Rain water");
         bestTank.setWaterColor("Brown");
        System.out.println();

         FirstBucket bucket2 = new FirstBucket(bestTank);
        bestTank.setQuantity(300);
        bestTank.setWaterType("Tap water");
        bestTank.setWaterColor("Yellow");
        System.out.println();

        FirstBucket bucket3 = new FirstBucket(bestTank);
        bestTank.setQuantity(400);
        bestTank.setWaterType("Stream water");
        bestTank.setWaterColor("Blue");

    }

}
