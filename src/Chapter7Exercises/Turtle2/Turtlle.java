package Chapter7Exercises.Turtle2;

import Turtle.Sketchpad;

public class Turtlle {
    private String name;
    private Penn pen;
    private int xCordinate;
    private int yCordinate;
    private CardinalPoint direction;

    public Turtlle(){
        pen = new Penn();
        pen.setPosition(PenPosition.UP);
        direction = CardinalPoint.EAST;
    }

    public Turtlle(String name){
        this();
        this.name = name;
    }

    public Turtlle(String name, int xCordinate, int yCordinate){
        this.xCordinate = xCordinate;
        this.yCordinate = yCordinate;
    }

    public Penn getPen() {
        return pen;
    }

    public void setPen(Penn pen) {
        this.pen = pen;
    }

    public int getxCordinate() {
        return xCordinate;
    }

    public void setxCordinate(int xCordinate) {
        this.xCordinate = xCordinate;
    }

    public int getyCordinate() {
        return yCordinate;
    }

    public void setyCordinate(int yCordinate) {
        this.yCordinate = yCordinate;
    }

    public CardinalPoint getDirection() {
        return direction;
    }

    public void setDirection(CardinalPoint direction) {
        this.direction = direction;
    }

    public void changePenPosition(PenPosition position){
        this.getPen().setPosition(position);
    }
    public void turnRight(){
        switch(direction) {
            case EAST -> setDirection(CardinalPoint.SOUTH);
            case SOUTH -> setDirection(CardinalPoint.WEST);
            case WEST -> setDirection(CardinalPoint.NORTH);
            case NORTH -> setDirection(CardinalPoint.EAST);
        }
    }

    public void turnLeft(){
        switch(direction) {
            case EAST -> setDirection(CardinalPoint.NORTH);
            case SOUTH -> setDirection(CardinalPoint.EAST);
            case WEST -> setDirection(CardinalPoint.SOUTH);
            case NORTH -> setDirection(CardinalPoint.WEST);
        }
    }

    public void moveForward(int numberOfSteps){
        if(direction.equals(CardinalPoint.EAST)){
            xCordinate +=numberOfSteps-1;
        }else if(direction.equals(CardinalPoint.SOUTH)){
            yCordinate +=numberOfSteps-1;
        }else if(direction.equals(CardinalPoint.WEST)){
            yCordinate -=numberOfSteps-1;
        }else if(direction.equals(CardinalPoint.NORTH)){
            yCordinate -=numberOfSteps-1;
        }
    }
    public void moveForward(int numberOfSteps, Sketchpad pad)throws TurtleException {
        if (numberOfSteps > pad.getFloor().length - 1) {
            throw new TurtleException("You don pass?");
        }
        if (direction.equals(CardinalPoint.EAST)) {
            int destination = xCordinate + numberOfSteps - 1;
            if (destination > pad.getFloor().length - 1) {
                throw new TurtleException("You don Pass");
            }
        } else if (direction.equals(CardinalPoint.SOUTH)) {
            int destination = xCordinate + numberOfSteps - 1;
            if (destination > pad.getFloor().length - 1) {
                throw new TurtleException("You don Pass");
            }

        }else if(direction.equals(CardinalPoint.WEST)) {
            int destination = xCordinate + numberOfSteps - 1;
            if (destination < pad.getFloor().length - 1) {
                throw new TurtleException("You don Pass");
            }
        }
        moveForward(numberOfSteps);
    }
}
