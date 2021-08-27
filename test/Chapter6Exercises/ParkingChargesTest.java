package Chapter6Exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingChargesTest {
    @Test
    void testMethod(){
        assertEquals(12.0, ParkingCharges.calculateCharges(12.0, 10));
    }

}