package Chapter6Exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoundingNumbersTest {

    @Test
    void theFirstMethodFirstRoundWorks() {
        assertEquals(23,RoundingNumbers.firstRound(23.3));
    }

    @Test
    void thatTheSecondMethodSecondRoundWorks() {
        assertEquals(23.4,RoundingNumbers.secondRound(23.35));
    }

    @Test
    void thatTheThirdMethodThirdRoundWorks() {
        assertEquals(23.46,RoundingNumbers.thirdRound(23.456));
    }

    @Test
    void thatTheFourthMethodFourthRoundWorks() {
        assertEquals(23.346,RoundingNumbers.fourthRound(23.3456));
    }

    @Test
    void main() {
    }
}