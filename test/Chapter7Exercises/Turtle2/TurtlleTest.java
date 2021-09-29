package Chapter7Exercises.Turtle2;

import Turtle.Sketchpad;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TurtlleTest {
    private Turtlle ijapa;
    private Sketchpad drawingBoard;

    @BeforeEach
    void setUp() {
        ijapa= new Turtlle("ijapa");
        drawingBoard = new Sketchpad(20,20);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void changePenPositionFromUpToDown(){
        assertEquals(PenPosition.UP, ijapa.getPen().getPosition());
        ijapa.changePenPosition(PenPosition.DOWN);
        assertEquals(PenPosition.DOWN, ijapa.getPen().getPosition());
    }

    @Test
    void changePenPositionFromDownToUp(){
        assertEquals(PenPosition.UP, ijapa.getPen().getPosition());
        ijapa.changePenPosition(PenPosition.DOWN);
        assertEquals(PenPosition.DOWN, ijapa.getPen().getPosition());
        ijapa.changePenPosition(PenPosition.UP);
        assertEquals(PenPosition.UP, ijapa.getPen().getPosition());
    }

    @Test
    void turnRightFromEast(){
        ijapa.setDirection(CardinalPoint.EAST);
        ijapa.turnRight();
        assertEquals(CardinalPoint.SOUTH, ijapa.getDirection());
    }

    @Test
    void turnRightFromWest(){
        ijapa.setDirection(CardinalPoint.WEST);
        ijapa.turnRight();
        assertEquals(CardinalPoint.NORTH, ijapa.getDirection());
    }

    @Test
    void turnRightFromNorth(){
        ijapa.setDirection(CardinalPoint.NORTH);
        ijapa.turnRight();
        assertEquals(CardinalPoint.EAST, ijapa.getDirection());
    }

    @Test
    void turnRightFromSouth(){
        ijapa.setDirection(CardinalPoint.SOUTH);
        ijapa.turnRight();
        assertEquals(CardinalPoint.WEST, ijapa.getDirection());
    }

    @Test
    void turnLeftFromEast(){
        ijapa.setDirection(CardinalPoint.EAST);
        ijapa.turnLeft();
        assertEquals(CardinalPoint.NORTH, ijapa.getDirection());
    }

    @Test
    void turnLeftFromWest(){
        ijapa.setDirection(CardinalPoint.WEST);
        ijapa.turnLeft();
        assertEquals(CardinalPoint.SOUTH, ijapa.getDirection());
    }

    @Test
    void turnLeftFromNorth(){
        ijapa.setDirection(CardinalPoint.NORTH);
        ijapa.turnLeft();
        assertEquals(CardinalPoint.WEST, ijapa.getDirection());
    }

    @Test
    void turnLeftFromSouth(){
        ijapa.setDirection(CardinalPoint.SOUTH);
        ijapa.turnLeft();
        assertEquals(CardinalPoint.EAST, ijapa.getDirection());
    }

    @Test
    void moveForwardFromEast(){
        assertEquals(CardinalPoint.EAST,ijapa.getDirection());
        ijapa.setDirection(CardinalPoint.EAST);
        assertEquals(0, ijapa.getxCordinate());
        assertEquals(0, ijapa.getyCordinate());
        ijapa.moveForward(12);
        assertEquals(11, ijapa.getxCordinate());
        assertEquals(0, ijapa.getyCordinate());
    }

    @Test
    void moveForwardFromSouth(){
        ijapa.setDirection(CardinalPoint.SOUTH);
        ijapa.moveForward(12);
        assertEquals(0, ijapa.getxCordinate());
        assertEquals(11, ijapa.getyCordinate());
    }

    @Test
    void moveForwardFromWest(){
        ijapa.setDirection(CardinalPoint.WEST);
        assertEquals(0, ijapa.getxCordinate());
        ijapa.setxCordinate(11);
        ijapa.moveForward(12);
        assertEquals(0, ijapa.getxCordinate());
        assertEquals(0, ijapa.getyCordinate());
    }

    @Test
    void moveForwardFromNorth(){
        ijapa.setDirection(CardinalPoint.NORTH);
        ijapa.setyCordinate(11);
        assertEquals(0, ijapa.getxCordinate());
        try{
        ijapa.moveForward(12);
        assertEquals(0, ijapa.getxCordinate());
        assertEquals(0, ijapa.getyCordinate());
    } catch (Exception e) {
            e.printStackTrace();
        }
    }

        @Test
        void moveForwardFromEastWithExcessSteps(){
        assertEquals(CardinalPoint.EAST,ijapa.getDirection());
        ijapa.setxCordinate(10);
        assertEquals(0, ijapa.getyCordinate());
        assertThrows(TurtleException.class, ()-> ijapa.moveForward(12, drawingBoard));
        assertEquals(10, ijapa.getxCordinate());
        assertEquals(0, ijapa.getyCordinate());
    }

}
