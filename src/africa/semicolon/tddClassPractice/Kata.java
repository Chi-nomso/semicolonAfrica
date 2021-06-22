package africa.semicolon.tddClassPractice;

import java.util.Scanner;

public class Kata {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Enter your 3 digit Number: ");
        number = input.nextInt();

        if (number / 100 == number % 10) {
            System.out.println("The Number you entered is a palindrome");
        } else {
            System.out.print("The Number you entered is not a palindrome");
        }
    }

    public String getReverseNumber(int number) {

        int first = number / 10000;
        int one = number % 10000;
        int second = one / 1000;
        int two = one % 1000;
        int third = two / 100;
        int three = two % 100;
        int fourth = three / 10;
        int four = three % 10;
        int five = four;
        return five + "" + fourth + "" + third + "" + second + "" + first;

    }

    public int getFactorial(int number) {
        int factor = 1;
        while (number > 1) {
            factor = factor * number;
            number -= 1;
        }
        return factor;
    }


    public int collectMoney(int money) {
//        money = 1;
        int moneyCount = 1;
        while (money >= 1) {
            money = money + moneyCount++;
            }
        return money;
            }

   public void getBinaryReturn(){

   }
}

