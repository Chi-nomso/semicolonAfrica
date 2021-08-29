package Chapter6Exercises;

public class Multiple {
    /** --> Declare a Method isMultiple()
     * --> method takes in 2 parameters
     * --> find out if the second parameter is a multiple of the first
     * --> if second parameter % first parameter is == 0, then second is a multiple of first
     * */

    public boolean isMultiple(int first, int second){
        boolean result;
        result = second % first == 0;
        return result;
    }
}
