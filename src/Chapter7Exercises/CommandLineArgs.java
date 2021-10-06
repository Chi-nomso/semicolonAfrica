package Chapter7Exercises;

public class CommandLineArgs {
    public static void main(String[] args) {
        int[] values = new int[10];

        System.out.printf("%s%8s%n", "Index", "Number");
        for (int counter = 0; counter < values.length; counter++) {
            System.out.printf("%5d%8d%n", counter, values[counter]);
        }
    }
}
