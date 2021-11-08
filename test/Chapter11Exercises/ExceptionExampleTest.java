package Chapter11Exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExceptionExampleTest {
    ExceptionExample example1;

    @BeforeEach
    void setUp() {
        //example1 = new ExceptionExample();
    }

    @Test
    void testToFindTheQuotientOfTwoIntegers(){
        example1 = new ExceptionExample();
        assertEquals(2, example1.findQuotient(20,10));
    }

    @Test
    void testToThatAnExceptionWhenDenominatorIsZero(){
        example1 = new ExceptionExample();
        try{
        assertEquals(1, example1.findQuotient(30,20));
    }catch(ArithmeticException mistake){
            System.out.println("Zero is an invalid denominator");
        }
    }
}