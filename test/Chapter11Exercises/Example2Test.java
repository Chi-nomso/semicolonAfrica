package Chapter11Exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Example2Test {
    Example2 exceptionExample;

    @BeforeEach
    void setUp() {
    }

    @Test
    void testToGenerateAnEmailAddressUsingTheFirstAndLastName(){
        exceptionExample = new Example2();
        assertEquals("sidneyJones@gmail.com", exceptionExample.findEmail("sidney", "Jones"));
    }

    @Test
    void testToThrowExceptionWhenAWrongDataIsInputed(){
        exceptionExample = new Example2();
        try{
            assertEquals("nancyMay@gmail.com", exceptionExample.findEmail("nancy", "May"));
        }catch(IllegalArgumentException exception){
            System.out.println("What did you just put in?!");
        }
    }
}