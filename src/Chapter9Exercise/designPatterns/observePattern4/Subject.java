package Chapter9Exercise.designPatterns.observePattern4;


public interface Subject {
    void add(Observer viewer);
    void remove(Observer viewer);
    void display();
    void notifyViewers();

}
