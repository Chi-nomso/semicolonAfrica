import africa.semicolon.tddClassPractice.Kata;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    @Test
    public void testForReverseNumber(){
        Kata mykata = new Kata();
        assertEquals("54321", mykata.getReverseNumber(12345));
    }

    @Test
    public void testForNumberFactor(){
        Kata mykata = new Kata();
       assertEquals(120, mykata.getFactorial(5));

    }

    //keep collecting #20 until my record book is filled,
    //this is a while loop.
    @Test
    public void testToCollectMoney(){
        Kata myKata = new Kata();
        assertEquals(20, myKata.collectMoney(1));
    }
}
