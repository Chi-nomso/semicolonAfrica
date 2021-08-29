package Chapter6Exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoundingNumbersTest {
    @Test
    void theNumberImputedMustBeADecimalNumber() {
        //given
        double number = 23.4;
        assertEquals(23.4, number);
    }

    @Test
    void testThatSystemCanRoundOffDecimalNumberToAnInteger() {
        RoundingNumbers roundingNumbers = new RoundingNumbers();
        assertEquals(23, roundingNumbers.firstRound(23.5));
    }

    @Test
    void testThatSystemCanRoundOffNumberToTheTenthValue() {
        RoundingNumbers roundingNumbers = new RoundingNumbers();
        assertEquals(23.3, roundingNumbers.secondRound(23.345));
    }

    @Test
    void testThatSystemCanRoundOffNumberToTheHundredthValue() {
        RoundingNumbers roundingNumbers = new RoundingNumbers();
        assertEquals(23.35, roundingNumbers.thirdRound(23.345));
    }

    @Test
    void testThatSystemCanRoundOffNumberToTheThousandthValue() {
        RoundingNumbers roundingNumbers = new RoundingNumbers();
        assertEquals(23.345, roundingNumbers.fourthRound(23.345));
    }
}