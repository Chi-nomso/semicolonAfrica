package Chapter6Exercises;

public class EvenOrOdd {
    /** --> Declare a Method isEven()
     * --> method takes in an int parameter
     * --> find out if the parameter is an even number
     * --> if number % 2 == 0, then number is an even number
     * --> return true; else return false;
     * */

    public boolean isEven(int number) {
        boolean result;
        result = number % 2 == 0;
        return result;
    }
}
