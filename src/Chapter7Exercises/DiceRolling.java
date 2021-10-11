package Chapter7Exercises;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class DiceRolling {
    /** >>> Declare a one dimensional array of length 6
     * >>> Using Random number generator once to roll the first dice
     * >>> Using Random number generator once to roll the second dice
     * >>> using a loop Roll the dice 36,000,000 times
     * >>> Each dice can show an int value between 1-6
     * >>> Calculate the sum of both values generated.
     * >>> The Sum of the values will vary from 2-12 with 7 as the most frequent value
     * >>> Display the result in a tabular form.
     * */


    public static void main(String[] args) {
        int[]diceGame = new int[12];
        int[]tally = new int[12];
        int index = 0;
        SecureRandom numGen = new SecureRandom();
        int face1;
        int face2;
        int sum = 0;
        for (int roll = 0; roll <= diceGame.length -1; roll++) {
            face1 = 1 + numGen.nextInt(6);
            face2 = 1 + numGen.nextInt(6);
            sum = face1 + face2;
            diceGame[index] = sum;
            index++;

            switch(sum){
                case 1:
                    if(sum == 2){
                        tally[0]++;
                    }
                case 2:
                    if(sum == 3){

                    }

            }
        }
        //tally[sum]++;
        System.out.println(Arrays.toString(diceGame));
        System.out.println("Number of times each value occurs in Dice Game array is:");
        System.out.println(Arrays.toString(tally));
    }
}
