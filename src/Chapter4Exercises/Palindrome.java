package Chapter4Exercises;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 5 digit number");
        int number = input.nextInt();
        if(number / 10000 == 0){
            System.out.println("This is not a 5digit number! Kindly enter a 5 digit number");
            System.out.println("And");
        }

        int one = number / 10000;
        int a = number % 10000;
        int two = a / 1000;
        int b = a % 1000;
        int three = b / 100;
        int c = b % 100;
        int four = c / 10;
        int d = c % 10;

        if(d == one && four == two){
            System.out.println("This is a Palindrome");
        }else{
            System.out.print("This is not a Palindrome");
        }

        }
}

