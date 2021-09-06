package Chapter6Exercises;

import java.util.Scanner;

public class SeparatingDigits {
    /** --> Declare methods that calculates:
     *   :>> the integer part of the quotient(int value before the decimal point) when int a is divided by int b;
     *   :>> the integer remainder(int value after the decimal point) when int a is divided by int b
     *   :>> use the methods to create a Method separateDigits(takes in int numbers); and displays them with space
     *   :>> e.g 2345 -->> 2 3 4 5;
     * ---> using the division and modulus operators
     * */

    public int getIntegerPartOfQuotient(int a, int b){
        int quotient = a / b;
        return quotient;
    }

    public int getIntegerRemainder(int a, int b){
        int remainder = a % b;
        return remainder;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Put in a 4 digit number");
        int value = input.nextInt();
        System.out.println(new SeparatingDigits().getIntegerPartOfQuotient(3345,10));

    }
}
