package Chapter6Exercises;

public class ValueOfX {
    public static void main(String[] args) {
        double x = Math.abs(7.5);
        double x1 = Math.floor(7.5);
        double x2 = Math.abs(0.0);
        double x3 = Math.ceil(0.0);
        double x4 = Math.abs(-6.4);
        double x5 = Math.ceil(-6.4);
        double x6 = Math.ceil(-Math.abs(-8 + Math.floor(-5.5)));

        System.out.printf("%.2f\n%.2f\n%.2f\n%.2f\n%.2f\n%.2f\n%.2f", x,x1,x2,x3,x4,x5,x6);
    }

}
