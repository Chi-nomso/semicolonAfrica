package Chapter3Exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateTest {
    private Date myDate;
    @BeforeEach
    public void setUp(){
        myDate = new Date(6, 18, 2021);
    }
    @Test
    public void testThatDateHasMonth(){
        myDate.setDateMonth(6);
        assertEquals(6, myDate.getDateMonth());
    }

    @Test
    public void testThatDateHasADayNumber(){
        myDate.setDateDayNumber(18);
        assertEquals(18, myDate.getDateDayNumber());
    }

    @Test
    public void testThatDateHasAYear(){
        myDate.setDateYear(2021);
        assertEquals(2021, myDate.getDateYear());
    }

    @Test
    public void testThatDateAligns(){
        //given
        myDate.setDateMonth(6);
        assertEquals(6, myDate.getDateMonth());
        //and
        myDate.setDateDayNumber(18);
        assertEquals(18, myDate.getDateDayNumber());
        //also
        myDate.setDateYear(2021);
        assertEquals(2021, myDate.getDateYear());
        //then

    }

    @Test
    public void testDisplayDate(){
        System.out.println(myDate.displayDate());
        assertEquals("06/18/2021", myDate.displayDate());
    }
}
