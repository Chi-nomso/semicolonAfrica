package Chapter11Exercises;

import java.util.Scanner;

public class ExceptionExample {
    public int findQuotient(int numerator, int denominator) throws ArithmeticException{
        int quotient = numerator / denominator;
        return quotient;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int denominator = 1;
        System.out.println("Input the numerator");
        int numerator = input.nextInt();
        do {
            try {
                System.out.println("input the denominator");
                denominator = input.nextInt();
                System.out.println(new ExceptionExample().findQuotient(numerator, denominator));
            } catch (ArithmeticException mistake) {
                System.out.println("Zero is an invalid denominator, input again");
            }
        } while (denominator < 1);
    }
}
