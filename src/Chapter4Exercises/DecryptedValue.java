package Chapter4Exercises;

import java.util.Scanner;

public class DecryptedValue {
    /* This program is for decrypting(hiding) numbers, by giving it another number
   case study is 4digit--> 8901, when encrypted you'll get 1234, when decrypted you get back 1234.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Put in a 4 digit number:");
        int number = input.nextInt();
        int digit1 = number / 1000;
        if(digit1 < 7){
            digit1 = 10 + digit1;
        }
        int cryptOne =  (digit1 - 7)% 10;
        int digit2 = number/ 100 % 10;
        if(digit2 < 7){
            digit2 = 10 + digit2;
        }
        int cryptTwo = (digit2 - 7) % 10;
        int digit3 = number % 100 / 10;
        if(digit3 < 7){
            digit3 = 10 + digit3;
        }
        int cryptThree = (digit3 - 7) % 10;
        int digit4 = number % 10;
        if(digit4 < 7){
            digit4 = 10 + digit4;
        }
        int cryptFour = (digit4 - 7) % 10;
        System.out.printf("%d%d%d%d", cryptOne, cryptTwo,cryptThree, cryptFour);
       }

}

