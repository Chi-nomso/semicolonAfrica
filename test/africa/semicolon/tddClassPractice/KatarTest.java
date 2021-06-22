package africa.semicolon.tddClassPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KatarTest {
    @Test
    public void testThatUserCanInputNumber(){
        //given
        Katar binary = new Katar();
        int userInput = 12;
        //when
        binary.setUserInput(userInput);
        //assert
        assertEquals(12, binary.getUserInput());
    }

    @Test
    public void testThatUserInputReturnsBinary(){
        //given
        Katar binary = new Katar();
        int userInput = 12;
        //when
        binary.setUserInput(userInput);
        assertEquals(12, binary.getUserInput());
        //then
        binary.setUserInputBinary(10011);
        assertEquals(10011,binary.getUserInputBinary());

    }

    @Test
    public void testThat(){

    }
}
