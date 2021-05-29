package africa.semicolon.tddClassPractice;

import java.util.Scanner;

public class Katar {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Enter your 3 digit Number: ");
        number = input.nextInt();

        if(number/100 == number%10) {
            System.out.println("The Number you entered is a palindrome");
        }else{
                System.out.print("The Number you entered is not a palindrome");
            }
    }
}