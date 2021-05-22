package Chapter2Exercises;

import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bring Number One");
        int numberOne = input.nextInt();
        System.out.println("Gimme Another Number");
        int numberTwo = input.nextInt();
        System.out.println("Drop the Last Number now");
        int numberThree = input.nextInt();

        int sum = numberOne + numberTwo + numberThree;
        int average = (numberOne + numberTwo + numberThree) / 3;
        int product = numberOne * (numberTwo * numberThree);
        System.out.printf("The Sum of these number is %d%nThe Average is %d%nThe Product is %d%n", sum, average, product);

        if(numberOne > numberTwo && numberOne > numberThree) {
            System.out.printf("%d is the Largest here", numberOne);
        }else
            if(numberTwo > numberOne && numberTwo > numberThree){
                System.out.printf("%d is the Largest here", numberTwo);
        }else
            if(numberThree > numberOne && numberThree > numberTwo){
                System.out.printf("%d is the Largest here", numberThree);
        }
            if(numberOne < numberTwo && numberOne < numberThree) {
                System.out.printf("%n%d is the Smallest here", numberOne);
        }else
            if(numberTwo < numberOne && numberTwo < numberThree){
                System.out.printf("%n%d is the Smallest here", numberTwo);
        }else
            if(numberThree < numberOne && numberOne < numberTwo) {
                System.out.printf("%n%d is the Smallest here", numberThree);
        }
    }
}
