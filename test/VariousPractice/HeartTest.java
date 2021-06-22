package VariousPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HeartTest {
    @Test
    void testThatHeartClassExists(){
        //given
        //when
        Heart heart = new Heart();
        //assert
        assertNotNull(heart);
        assertTrue(heart instanceof Heart);
    }

    @Test
    void classShouldIncludePatientFirstName(){
        //given
        Heart heart = new Heart();
        //when
        String returnFirstName = heart.getFirstName();
        //assert
        assertEquals("Confidence", returnFirstName);
        //when
        heart.setFirstName("Nomso");
        returnFirstName = heart.getFirstName();
        assertEquals("Nomso", returnFirstName);
    }



    
}
