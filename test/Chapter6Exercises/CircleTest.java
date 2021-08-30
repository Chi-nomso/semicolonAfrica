package Chapter6Exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    public void testToCalculateTheAreaOfTheCircle(){
        Circle circle = new Circle();
        assertEquals(78.53981633974483, circle.circleArea(5));
    }

}