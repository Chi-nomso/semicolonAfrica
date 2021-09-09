package Chapter6Exercises.GuessingGame;

import java.security.SecureRandom;
import java.util.Random;

public class GameMethod {
    /** ---> A Guessing game app, using te random object selection to generate random Mystery Number between 1-1000
     *  ---> prompt user to input number 3times (1 per time)
     *  ---> if first input is > than random number >> print too ig, guess again.
     *  --> if second input in < than random number >> print too low
     *  ---> if third input is == random number >> print Congratulations
     */

    public static int guessNumber(){
        SecureRandom random = new SecureRandom();
        int mysteryNumber = 1 + random.nextInt(10);
        return mysteryNumber;
    }
}
