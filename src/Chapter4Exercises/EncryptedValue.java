package Chapter4Exercises;

import java.util.Scanner;

public class EncryptedValue {
    /* This program is for encrypting(hiding) numbers, by giving it another number or another value.
    case study is 4digit--> 1234, when encrypted you'll get 8901, when decrypted you get back 1234.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Put in a 4 digit number:");
        int number = input.nextInt();
        int digit1 = number / 1000;
        int cryptOne =  (digit1 + 7)% 10;
        int digit2 = number/ 100 % 10;
        int cryptTwo = (digit2 + 7) % 10;
        int digit3 = number % 100 / 10;
        int cryptThree = (digit3 + 7) % 10;
        int digit4 = number % 10;
        int cryptFour = (digit4 + 7) % 10;

        System.out.printf("%d%d%d%d", cryptOne, cryptTwo,cryptThree, cryptFour);
    }
}
