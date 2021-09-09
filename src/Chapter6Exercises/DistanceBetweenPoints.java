package Chapter6Exercises;

import java.util.Scanner;

public class DistanceBetweenPoints {
    public static double getDistance(int x1, int y1, int x2, int y2){
        double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2,2));
        return distance;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input te coordinate for x1");
        int x1 = input.nextInt();
        System.out.println("Input te coordinate for x2");
        int x2 = input.nextInt();
        System.out.println("Input te coordinate for y1");
        int y1 = input.nextInt();
        System.out.println("Input te coordinate for y2");
        int y2 = input.nextInt();

        System.out.println("Distance is " + DistanceBetweenPoints.getDistance(x2, x1, y2,
                y1));
    }
}
