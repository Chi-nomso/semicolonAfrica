package Chapter17Exercises;

import java.util.stream.IntStream;

public class LambdaSum {
    /** --> using the IntStream.range() method-> which includes all the values(or stream of values of type Int)
       from the given argument(1 to 10, excluding 10)
     --> Method sum() in the method call, is a REDUCTION method (that adds up the sequence of
     numbers into One number of type Int)
     */
    public static void main(String[] args) {
        System.out.printf("Sum of 1 through 10 is: %d%n", IntStream.range(1,10).sum());

    }
}
