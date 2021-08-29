package Chapter6Exercises;

public class Exponentiation {
    /** --> Declare a method integerPower
     * --> Method returns a value of a Base(^exponent)
     * --> Math.exp(value)
     * */
    public int integerPower(int base, int exponent){
        int e = 1;
        for(int count = 1; count <= exponent; count++){
            e *= base;
        }
        return e;
    }
}
