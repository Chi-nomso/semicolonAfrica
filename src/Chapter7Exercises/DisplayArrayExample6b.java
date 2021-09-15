package Chapter7Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class DisplayArrayExample6b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[]points = new int[5];
        int count;
        for(count = 0; count < 5; count++) {
            System.out.println("enter numbers");
            points[count] = input.nextInt();
        }
        System.out.println(Arrays.toString(points));
    }
}
