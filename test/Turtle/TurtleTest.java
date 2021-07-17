package Turtle;

import org.junit.jupiter.api.Test;

import static Turtle.PenPosition.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {
    @Test
    public void turtleCanBeConstructed(){
        Turtle turtle = new Turtle();
        assertNotNull(turtle);
    }

    @Test
    public  void turtleHasAPen(){
        Turtle turtle = new Turtle();
        Pen biro = new Pen();
        turtle.setPen(biro);

        assertSame(biro, turtle.getPen());
    }

    @Test
    public void turtleHasPenOnCreation(){
        Pen biro = new Pen();
        Turtle turtle = new Turtle();
        assertNotNull(turtle.getPen());
    }

    @Test
    public void PenHasPosition(){
        Pen biro = new Pen();
        assertNotNull(biro.getPosition());
    }

    @Test
    void penPostionIsUp(){
        Pen biro = new Pen();
        assertSame(UP, biro.getPosition());
    }

    @Test
    void TurtleCanTurnPenDown(){
        Turtle turtle = new Turtle();
        turtle.penDown();
        assertSame(DOWN, turtle.getPenPosition());

        turtle.penUp();
        assertSame(UP, turtle.getPenPosition());
    }

    @Test
    void turtleCanTurnRightWhenFacingEast(){
        Turtle turtle = new Turtle();
        assertSame(Direction.EAST, turtle.getDirection());

        turtle.turnRight();
        assertSame(Direction.SOUTH, turtle.getDirection());
    }

    @Test
    void turtleCanTurnRightWhenFacingSouth(){
        Turtle turtle = new Turtle();
        turtle.turnRight();
        assertSame(Direction.SOUTH, turtle.getDirection());

        turtle.turnRight();
        assertSame(Direction.WEST, turtle.getDirection());
    }
 //todo facing west and facing north;

    @Test
    void turtleCanTurnLeftWhileFacingEast(){
        Turtle turtle = new Turtle();
        assertSame(EAST, turtle.getDirection());

        turtle.turnLeft();
        assertSame(Direction.NORTH, turtle.getDirection());
    }
    //todo north,west,south, turnLefts();

    @Test
    void turtleCanMoveForwardWhileFacingEast(){
        Turtle turtle = new Turtle();
        TurtlePosition position = turtle.getTurtlePosition();
        assertEquals(0,position.getColumnPosition());
        assertEquals(0,position.getRowPosition());

        //when
        turtle.move(5);
        TurtlePosition newPosition = turtle.getTurtlePosition();
        assertEquals(5,newPosition.getColumnPosition());
        assertEquals(0,newPosition.getRowPosition());
    }

    @Test
    void turtleCanMoveForwardWhileFacingSouth(){
        Turtle turtle = new Turtle();
        TurtlePosition position = turtle.getTurtlePosition();
        assertEquals(0,position.getColumnPosition());
        assertEquals(5,position.getRowPosition());

        //when
        turtle.move(5);
        TurtlePosition newPosition = turtle.getTurtlePosition();
        assertEquals(0,newPosition.getColumnPosition());
        assertEquals(5,newPosition.getRowPosition());
    }

    @Test
    public void turtleCanWriteEastwardsWhenPenIsDown(){
        //given
        Sketchpad sketchpad = new Sketchpad(20,20);
        Turtle turtle = new Turtle();
        turtle.penDown();
        //when
        turtle.move(5, sketchpad);
        //assert
        assertEquals(1,sketchpad.getFloor()[0][0]);
        assertEquals(1,sketchpad.getFloor()[0][1]);
        assertEquals(1,sketchpad.getFloor()[0][2]);
        assertEquals(1,sketchpad.getFloor()[0][3]);
        assertEquals(1,sketchpad.getFloor()[0][4]);
        assertEquals(0,sketchpad.getFloor()[0][5]);

        TurtlePosition position = new TurtlePosition();

    }
}