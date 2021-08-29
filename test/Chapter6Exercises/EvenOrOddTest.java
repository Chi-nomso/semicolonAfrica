package Chapter6Exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOrOddTest {
    @Test
    public void testThatNumberImputedIsAnEvenNumber() {
        EvenOrOdd check = new EvenOrOdd();
        assertTrue(check.isEven(20));
    }

}