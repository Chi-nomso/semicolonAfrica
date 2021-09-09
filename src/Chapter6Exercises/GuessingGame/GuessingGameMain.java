package Chapter6Exercises.GuessingGame;

import java.util.Scanner;

public class GuessingGameMain {
    /** ---> A Guessing game app, using te random object selection to generate random Mystery Number between 1-1000
     *  ---> prompt user to input number 3times (1 per time)
     *  ---> if first input is > than random number >> print too ig, guess again.
     *  --> if second input in < than random number >> print too low
     *  ---> if third input is == random number >> print Congratulations
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int guess = 0;
        System.out.println("Guess a Number");
        while(guess != -1){
            guess = input.nextInt();
            if(guess == GameMethod.guessNumber()){
                System.out.println("Congratulations, Number is correct");
            }else if(guess > GameMethod.guessNumber()){
                System.out.println("Number is larger, try again");
            }else if(guess < GameMethod.guessNumber()){
                System.out.println("Number is Smaller, try again");
            }
        }
        System.out.println("Mystery Number is " + GameMethod.guessNumber());
    }
}
