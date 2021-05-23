package Chapter2Exercises;

import java.util.Scanner;

public class NegativeValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Five Digits");
        int digit = input.nextInt();

        int numbers = digit;
        int negative = 0-1;
        int positive = 0+1;
        int zero = 0;

        if(digit == 0){
            System.out.printf("The Count of negative digits here is %d%n", zero);
        }else
            if(digit < 0 ){
                System.out.printf("The count of positive digits here is %d%n", negative);
        }else
            if(digit > 0 ){
                System.out.printf("The count of zero digits here is %d%n", positive);
            }
      }
}
