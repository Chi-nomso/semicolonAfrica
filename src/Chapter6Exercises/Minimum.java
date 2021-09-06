package Chapter6Exercises;

public class Minimum {
    public double getMinimum3(double num1, double num2, double num3) {
        double minimum = Math.min(num1, Math.min(num2, num3));
        return minimum;
    }
}
