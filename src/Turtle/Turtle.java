package Turtle;

import static Turtle.Direction.*;
import static Turtle.PenPosition.DOWN;

public class Turtle {
    private Pen pen;
    private Direction direction;
    private TurtlePosition myPosition;

    public Turtle() {
        pen = new Pen();
        direction = Direction.EAST;
        myPosition = new TurtlePosition();
    }

    public void setPen(Pen biro) {
        pen = biro;

    }

    public Pen getPen() {
        return pen;
    }

    public void penDown() {
        pen.setPosition(DOWN);
    }

    public PenPosition getPenPosition() {
        return pen.getPosition();
    }

    public void penUp() {
        pen.setPosition(PenPosition.UP);
    }

    public Direction getDirection() {
        return direction;
    }

    public void turnRight() {
        if(direction == SOUTH) direction = WEST;

        if(direction == EAST) direction = SOUTH;

    }

    public void turnLeft() {
        if(direction == EAST) direction = NORTH;
    }

    public TurtlePosition getTurtlePosition() {
        return myPosition;
    }

    public void move(int numberOfSteps) {
        if(direction == EAST) myPosition.increaseColumnPositionBy(numberOfSteps);
    }

    public void move(int numberOfSteps, Sketchpad sketchpad) {
        if(pen.getPosition().equals(DOWN)){
            int columnPosition = myPosition.getColumnPosition();
            int rowPosition = myPosition.getRowPosition();
            switch (direction){
                case EAST -> {
                    for(int i = columnPosition; i < columnPosition+numberOfSteps; i++){
                        sketchpad.getFloor()[rowPosition][i] = 1;
                    }
                }
            }
        }
        move(numberOfSteps);
    }
}
