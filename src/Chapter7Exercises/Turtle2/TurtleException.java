package Chapter7Exercises.Turtle2;

public class TurtleException extends Exception {

    public TurtleException() {
    }

    public TurtleException(String message) {
        super(message);
    }

    public TurtleException(String message, Throwable ex) {
        super(message, ex);
    }

    public TurtleException(Throwable cause) {
        super(cause);
    }
}
