package Chapter6Exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExponentiationTest {
    @Test
    void testThatNumberCanHaveABaseExponent(){
        Exponentiation expo = new Exponentiation();
        assertEquals(8, expo.integerPower(2,3));
    }

}