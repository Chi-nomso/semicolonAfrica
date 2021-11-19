package Chapter9Exercise.designPatterns.observerPattern;

public interface Observable {
    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObserver();

}
