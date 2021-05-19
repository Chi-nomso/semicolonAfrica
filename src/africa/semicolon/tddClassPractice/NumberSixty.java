package africa.semicolon.tddClassPractice;

import java.util.Scanner;

public class NumberSixty {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.println("Gimme a Number");
        number = input.nextInt();

        if (number >= 60) {
            System.out.println("You have Passed");
        }
        if (number < 60) {
            System.out.println("You have Failed woefully!!");
        }
    }

}
