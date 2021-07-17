package Turtle;

public class TurtlePosition {
    private  int columnPosition = 0;
    private int rowPosition = 0;

    public int getColumnPosition() {
        return columnPosition;
    }
    public int getRowPosition(){
        return rowPosition;
    }

    public void increaseColumnPositionBy(int numberOfSteps) {
        columnPosition+= numberOfSteps;
    }
}
