package Chapter9Exercise.designPatterns.observePattern2;

import java.util.ArrayList;
import java.util.List;

public class BestTank implements WaterTank{
    List<Bucket> buckets;
    private int quantity;
    private String waterType;
    private String waterColor;

    public BestTank() {
        buckets = new ArrayList<Bucket>();
    }

    @Override
    public void add(Bucket bucket) {
        buckets.add(bucket);
    }

    @Override
    public void remove(Bucket bucket) {
        int removedBucket = buckets.indexOf(bucket);
        buckets.remove(removedBucket);
    }

    @Override
    public void notifyBuckets() {
        for(Bucket bucket: buckets){
            bucket.update(quantity,waterType,waterColor);
        }
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        notifyBuckets();
    }

    public void setWaterType(String waterType) {
        this.waterType = waterType;
        notifyBuckets();
    }

    public void setWaterColor(String waterColor) {
        this.waterColor = waterColor;
        notifyBuckets();
    }
}
