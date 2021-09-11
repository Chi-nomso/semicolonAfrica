package Chapter6Exercises;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI {
    /** ---> A Program that helps a child learn multiplication
     * ---> Use SecureRandom object to generate 2 positive integers
     * ---> Use a Method to Prompt the child with a question>> e.g How much is 2 times 4?
     * ---> check if the child's answer is correct, display "Very good" else display "No. Please try again"
     * ---> ask the child the same question till she gets it
     * */

    public static void quiz(int firstNum, int secondNum){
        System.out.println("How much is " + firstNum + " times " + secondNum);
    }

    public static void main(String[] args) {
        SecureRandom numGen = new SecureRandom();
        int firstNum = numGen.nextInt(10);
        int secondNum = numGen.nextInt(10);
        int product = firstNum * secondNum;
        Scanner input = new Scanner(System.in);
        int response = 0;
        while (response != -1) {
            quiz(firstNum,secondNum);
            response = input.nextInt();
            if (response != product) {
                System.out.println("Wrong answer try again!");
            } else {
                System.out.println("Correct! Very good");
                firstNum = numGen.nextInt(10);
                secondNum = numGen.nextInt(10);
                product = firstNum * secondNum;
            }
        }
    }
}
