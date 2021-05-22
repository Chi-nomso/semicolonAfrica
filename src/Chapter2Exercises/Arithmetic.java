package Chapter2Exercises;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System. in);

        System.out.println("Oya gimme FirstNumber");
                int firstNumber = input.nextInt();
        System.out.println("Gimme Second number Joor!");
        int secondNumber = input.nextInt();

        int sum = firstNumber +secondNumber;
        int product = firstNumber * secondNumber;
        int difference = firstNumber - secondNumber;
        int quotient = firstNumber/secondNumber;

        System.out.printf("The Sum is %d%nThe Product is %d%nThe Difference is %d%nThe Quotient is %d%n", sum,product, difference, quotient);
    }
}
