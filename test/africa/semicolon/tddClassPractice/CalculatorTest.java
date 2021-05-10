package africa.semicolon.tddClassPractice;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void calculatorCanAddTest(){
        //given

       Calculator myCalculator = new Calculator();
       //when
       int sum = myCalculator.add(2,6);

       //check / assert
        assertEquals(8, sum);

    }
    @Test
    public void testThatCalculatorCanMultiply(){
        Calculator myCalculator = new Calculator();
        //when


        int result = myCalculator.multiply(3,4);
        //confirm
        assertEquals(12, result);
    }
    @Test
    public void testThatCalculatorCanSubtract(){
        Calculator myCalculator = new Calculator();
        //when
        int result = myCalculator.subtract(10,5);
        assertEquals(5, result);
    }
    @Test
    public void testThatCalculatorCanDivide(){
        Calculator myCalculator = new Calculator();
        //when
        double result = myCalculator.divide(50,10);
        assertEquals(5, result);
    }
    @Test
    public void testThatDivideReturnsZero(){
        Calculator myCalculator = new Calculator();
        //when
        double result = myCalculator.divide(20,0);
        assertEquals(0, result);

    }
}
