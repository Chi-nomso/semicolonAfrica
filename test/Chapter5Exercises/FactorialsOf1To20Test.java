package Chapter5Exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialsOf1To20Test {
    @Test
    public void ProgramCanCalculateFactorialsOfNumber(){
        FactorialsOf1To20 factorials = new FactorialsOf1To20();
        //factorials.findNumber();
        assertNotNull(1);
    }

    @Test
    void CalculateFactorialOfTwo(){
        FactorialsOf1To20 factorials = new FactorialsOf1To20();
       assertEquals(2, factorials.getFactorialsOfNumbers(2));
    }

    @Test
    void CalculateFactorialOfFive(){
        FactorialsOf1To20 factorials = new FactorialsOf1To20();
        assertEquals(120, factorials.getFactorialsOfNumbers(5));
    }

    @Test
    void CalculateFactorialOfTwenty(){
        FactorialsOf1To20 factorials = new FactorialsOf1To20();
        assertEquals(2432902008176640000l, factorials.getFactorialsOfNumbers(20));
    }
}