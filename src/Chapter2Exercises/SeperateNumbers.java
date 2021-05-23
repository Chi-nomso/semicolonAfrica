package Chapter2Exercises;

import java.util.Scanner;
 class SeperateNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the numbers your have");
        int number = input.nextInt();

        int digit = number;

        int first = digit/10000;
        int one = digit % 10000;
        int second =  one/ 1000;
        int two = digit % 1000;
        int third = two / 100;
        int three = digit % 100;
        int fourth = three /10;
        int four = digit % 10;
        int fifth = four / 1;
        int five = digit % 1;

        System.out.printf("%d   %d   %d   %d   %d", first, second, third, fourth, fifth);
    }
}
