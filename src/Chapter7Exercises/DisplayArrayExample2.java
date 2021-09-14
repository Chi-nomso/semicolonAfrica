package Chapter7Exercises;

public class DisplayArrayExample2 {
    public static void main(String[] args) {
        int[] scores = {32,27,64,18,95,14,90,70,60,37};
        System.out.printf("%s%10s%n", "Index", "Value");
        for (int counter = 0; counter < scores.length; counter++) {
            System.out.printf("%d%10d%n", counter, scores[counter]);
        }
    }
}
