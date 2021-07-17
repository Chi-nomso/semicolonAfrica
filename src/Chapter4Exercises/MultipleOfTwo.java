package Chapter4Exercises;

import java.util.Scanner;

public class MultipleOfTwo {
    public static void main(String[] args) {

        int number = 2;

        while (number != -1) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
            number *= 2;
        }
    }
}
