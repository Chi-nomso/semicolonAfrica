package Chapter7Exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VariableLengthArgumentListTest {
    @Test
    void testThatArrayCanTakeInIntegers(){
        VariableLengthArgumentList variable = new VariableLengthArgumentList();
        assertEquals(161280, variable.product(2,3,4,5,6,7,8,4));
    }
}