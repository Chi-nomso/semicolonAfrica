package Chapter8Exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleClassTest {
    RectangleClass rectangle;

    @BeforeEach
    void setUp() {
       rectangle = new RectangleClass();
    }

    @Test
    void testThatTheLengthOfRectangleIsADecimalNumber() {
        rectangle.setLength(12.0);
        assertEquals(12.0, rectangle.getLength());
    }

    @Test
    void testThatRectangleWidthIsADecimalNumber() {
        rectangle.setWidth(15.65);
        assertEquals(15.65, rectangle.getWidth());
    }

    @Test
    void testToCalculateThePerimeterOfTheRectangle(){
        //given
        rectangle.setLength(12.0);
        rectangle.setWidth(15.65);
        //assert
        assertEquals(55.3, rectangle.getParameter());
    }

    @Test
    void testToCalculateTheAreaOfTheRectangle(){
        //given
        rectangle.setLength(12.0);
        rectangle.setWidth(15.65);
        //assert
        assertEquals(187.8, rectangle.getArea());
    }
}