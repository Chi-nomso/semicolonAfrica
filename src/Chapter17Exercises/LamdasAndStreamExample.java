package Chapter17Exercises;

import java.util.stream.IntStream;

public class LamdasAndStreamExample {
    /** --> using the IntStream.rangeClosed() method-> which includes all the values(or stream of values of type Int)
     in from the given argument(1 to 10, including 10)
     --> Method sum() in the method call, is a REDUCTION method (that adds up the sequence of
     numbers into One number of type Int)
     */
    public static void main(String[] args) {
        System.out.printf("Sum of 1 through 10 is: %d%n", IntStream.rangeClosed(1,10).sum());
    }
}
