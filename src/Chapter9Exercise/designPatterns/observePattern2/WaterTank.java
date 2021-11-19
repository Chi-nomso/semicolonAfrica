package Chapter9Exercise.designPatterns.observePattern2;

//This is the Observable Interface

public interface WaterTank {
    void add (Bucket bucket);
    void remove(Bucket bucket);
    void notifyBuckets();

}
