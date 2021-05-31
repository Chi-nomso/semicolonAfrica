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
        myDate.setdateMonth(6);
        assertEquals(6, myDate.getdateMonth());
    }

    @Test
    public void testThatDateHasADayNumber(){
        myDate.setdateDayNumber(18);
        assertEquals(18, myDate.getdateDayNumber());
    }

    @Test
    public void testThatDateHasAYear(){
        myDate.setdateYear(2021);
        assertEquals(2021, myDate.getdateYear());
    }

    @Test
    public void testThatDateAligns(){
        //given
        myDate.setdateMonth(6);
        assertEquals(6, myDate.getdateMonth());
        //and
        myDate.setdateDayNumber(18);
        assertEquals(18, myDate.getdateDayNumber());
        //also
        myDate.setdateYear(2021);
        assertEquals(2021, myDate.getdateYear());
        //then

    }

    @Test
    public void testDisplayDate(){
        System.out.println(myDate.displayDate());
        assertEquals("06/18/2021", myDate.displayDate());
    }
}
