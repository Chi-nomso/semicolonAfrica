package Chapter17Exercises;

import java.util.stream.IntStream;

public class FilterMethod {
    //This Application finds the stream of int values 1- 10, moves the stream to the filter method that creates a stream of
    // even numbers, moves to the next stream that multiplies the numbers by 3, moves to the terminal operation that
    // finds the sum of the numbers.
    public static void main(String[] args) {
//        IntStream intStream = IntStream.rangeClosed(1,10);
//        System.out.println(intStream.filter(x -> x % 2 == 0).map(x-> x * 3).sum());

        System.out.printf("The Sum of the even ints from 1 - 10 is: %d%n",IntStream.rangeClosed(1,10)
                .filter(x ->x % 2 == 0)   //this method is taking in a lambda expression(an anonymous method)
                .map((int x) -> {return x * 3;}).sum());
    }
}
