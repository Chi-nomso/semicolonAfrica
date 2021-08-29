package Chapter6Exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DisplayRandomTest {
    /** --> Display a Random number from the sequence of numbers
     *  2,4,6,8,10
     *  3,5,7,9,11
     *  6,10,14,18,22
     *  int number = shiftValue + difference * randNum.nextInt(scalingFactor)
     * */
    @Test
    void testThatMethodCanGenerateRandomNumberFromSequenceOfNumbers(){
        DisplayRandom random = new DisplayRandom();
        assertEquals(11, new DisplayRandom().getRandomOfSequence(6,4));

    }

}