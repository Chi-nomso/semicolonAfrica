package Chapter6Exercises;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseNumberTest {
    @Test
    @DisplayName("Reverse a Number")
    void testThatANumberCanBeReversed(){
        ReverseNumber reversed = new ReverseNumber();
        assertEquals(654321, reversed.numberReversed(123456));
    }


}