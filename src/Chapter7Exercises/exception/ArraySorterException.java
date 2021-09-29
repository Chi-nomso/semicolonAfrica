package Chapter7Exercises.exception;

public class ArraySorterException extends Exception {
    public ArraySorterException() {
    }

    public ArraySorterException(String message) {
        super(message);
    }

    public ArraySorterException(String message, Throwable cause) {
        super(message, cause);
    }

    public ArraySorterException(Throwable cause) {
        super(cause);
    }
}

