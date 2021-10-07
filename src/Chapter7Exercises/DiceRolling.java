package Chapter7Exercises;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class DiceRolling {
    /** >>> Simulate the rolling of 2 dice
        * >>> Using Random number generator once to roll the first dice
     * >>> Using Random number generator once to roll the second dice
     * >>> Roll the dice 36,000,000 times...Using a one-dimensional array
     * >>> Each dice can show an int value between 1-6
     * >>> Calculate the sum of both values generated.
     * >>> The Sum of the values will vary from 2-12 with 7 as the most frequent value
     * >>> Display the result in a tabular form.
     * */


    public static void main(String[] args) {
        int[]diceGame = new int[6];
        SecureRandom numGen = new SecureRandom();
        int index = 0;
//        int index2 = 0;
//        int index3 = 0;
//        int index4 = 0;
//        int index5 = 0;
//        int index6 = 0;
        for (int roll = 0; roll <= 36000000; roll++) {
            int face = 1 + numGen.nextInt(6);
            diceGame[index] = face;
            index++;
        }
        System.out.println("Face\tFrequency");
        System.out.printf("%d\t", Arrays.toString(diceGame));

    }
}
