package Chapter6Exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MinimumTest {

    @Test
    @DisplayName("Finding the Minimum Value")
    void testToFindTheMinimumValue(){
        Minimum minNumber = new Minimum();
        assertEquals(23.44,minNumber.getMinimum3(50.43,23.44,32.0));
    }
}