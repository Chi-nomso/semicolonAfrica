package Chapter6Exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultipleTest {
    @Test
    public void testThatTheSecondNumberIsAMultipleOfTheFirstNumber(){
        Multiple findMultiple = new Multiple();
        assertTrue(findMultiple.isMultiple(2,8));
    }
}