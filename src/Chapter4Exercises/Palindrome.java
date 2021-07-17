package Chapter4Exercises;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 5 digit number");
        int number = input.nextInt();

        int one = number%10000;
        int b = one / 1000;
        int two = b % 1000;
        int c = two / 100;
        int three = c % 100;

        }
}

