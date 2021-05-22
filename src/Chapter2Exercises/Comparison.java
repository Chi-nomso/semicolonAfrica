package Chapter2Exercises;

import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Oya Drop NumberOne");
        int number = input.nextInt();

        System.out.println("Gimme another number");
        int numberTwo = input.nextInt();

        if(number > numberTwo) {
            System.out.printf("%d is Larger na!", number);
        }
        if(numberTwo > number) {
            System.out.printf("%d is Larger na, you no see am ni!", numberTwo);
        }
        if(number == numberTwo) {
            System.out.printf("%d and %d are Equal na, wetin dey worry you sef!", number, numberTwo);
        }
    }
}
