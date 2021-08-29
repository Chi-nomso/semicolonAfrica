package Chapter6Exercises;

import java.security.SecureRandom;

//import static sun.jvm.hotspot.runtime.BasicObjectLock.size;

public class DisplayRandom {
    /**
     * --> Display a Random number from the sequence of numbers
     * 2,4,6,8,10
     * 3,5,7,9,11
     * 6,10,14,18,22
     * int number = shiftValue + difference * randNum.nextInt(scalingFactor)
     */

    public int getRandomOfSequence(int shiftValue, int difference) {
        SecureRandom randValues = new SecureRandom();
        int sequence = shiftValue + difference * randValues.nextInt(5);
        return sequence;
    }
}