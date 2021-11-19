package Chapter9Exercise.designPatterns.observePattern2;

//This is the Observer interface
public interface Bucket {
    void update(int quantity, String waterType, String waterColor);
}
