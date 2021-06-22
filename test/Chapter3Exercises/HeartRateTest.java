package Chapter3Exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeartRateTest {
    private HeartRate myHeartRate;
    private Date myDate;
    @BeforeEach
    public void setUp(){
        myHeartRate = new HeartRate("firstname", "lastname", new Date(06, 18,1999));
    }

    @Test
    public void testThatPatientHasAFirstName(){
        myHeartRate.setPatientName("Best");
        assertEquals("Best", myHeartRate.getPatientName());
    }

    @Test
    public void testThatPatientHasALastName(){
        myHeartRate.setlastName("Nancy");
        assertEquals("Nancy", myHeartRate.getlastName());
    }

    @Test
    public void testForPatientDateOfBirth(){
        myDate = new Date (06, 18, 1999);
        assertEquals("06/18/1999", myDate.displayDate());
    }

    @Test
    public void testForPatientFullName(){
        myHeartRate.setPatientName("Best");
        myHeartRate.setlastName("Nancy");
        myHeartRate.displayName();
    }

    @Test
    public void testForPatientAge(){
        myDate = new Date (06,18,1999);
        assertEquals(22, myHeartRate.getAge());
    }

    @Test
    public void testForPatientMaximumHeartRate(){
        myDate = new Date(06,18,1999);
    }
}

