package Chapter9Exercise.designPatterns.observePattern2;

public class FirstBucket implements Bucket{
    private WaterTank BestTank;
    private int quantity;
    private String waterType;
    private String waterColor;

    public FirstBucket(WaterTank bestTank) {
        BestTank = bestTank;
        bestTank.add(this);
    }

    @Override
    public void update(int quantity, String waterType, String waterColor) {
        this.quantity = quantity;
        this.waterType = waterType;
        this.waterColor = waterColor;
        printDetails();
    }

   public void printDetails(){
       System.out.println("the quantity: " + quantity + " the  water Type: " + waterType + " the watercolor: " + waterColor);
    }
}
