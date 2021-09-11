package Chapter6Exercises;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI2 {
    /** ---> A Program that helps a child learn multiplication
     * ---> Use SecureRandom object to generate 2 positive integers
     * ---> Use a Method to Prompt the child with a question>> e.g How much is 2 times 4?
     * ---> check if the child's answer is correct:
     * ---> if the response is correct or wrong:
     use random number to choose between 1-4 to display
     i>>   Very good            ELSE DISPLAY:           i>> "No. Please try again"
     ii>>  Excellent                                    ii>> Wrong. Try once more.
     iii>> Nice work!                                   iii>> Don't give up!
     iv>>  Keep up the good work!                       iv> No. Keep trying.
     * ---> ask the child the same question till she gets it
     * */

    public static void quiz(int firstNum, int secondNum){
        System.out.println("How much is " + firstNum + " times " + secondNum);
    }
    public static void goodComments(){
        SecureRandom numGen = new SecureRandom();
        int tip = 1 + numGen.nextInt(4);
        switch (tip) {
            case 1 -> System.out.println("Very good!");
            case 2 -> System.out.println("Excellent!");
            case 3 -> System.out.println("Nice work!");
            case 4 -> System.out.println("Keep up the good work!");
        }
    }
    public static void badComments(){
        SecureRandom numGen = new SecureRandom();
        int tip = 1 + numGen.nextInt(4);
        switch (tip) {
            case 1 -> System.out.println("No. Please try again");
            case 2 -> System.out.println("Wrong. Try once more");
            case 3 -> System.out.println("Don't give up!");
            case 4 -> System.out.println("No. Keep trying.");
        }
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
                badComments();
            } else {
                goodComments();
                firstNum = numGen.nextInt(10);
                secondNum = numGen.nextInt(10);
                product = firstNum * secondNum;
            }
        }
    }
}
