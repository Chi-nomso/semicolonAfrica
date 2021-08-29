package Chapter6Exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HypothenuseCalcTest {
    @Test
    public void testForTheHypothenuseOfTheGivenTriangleSides(){
        HypothenuseCalc calculate = new HypothenuseCalc();
        assertEquals(13.0, calculate.hypothenuse(5.0,12.0));
    }

}