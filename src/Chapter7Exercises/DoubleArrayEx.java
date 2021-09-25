package Chapter7Exercises;

import java.util.Arrays;

public class DoubleArrayEx {
    public static void displayArray(int[][]score){
        for (int row = 0; row < score.length; row++) {
            for (int column = 0; column < score[row].length; column++){
                System.out.print(score[row][column] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int[][] score1 = {{1,2,3},{4,5,6}};
        int[][]score2 = {{1,2},{3},{4,5,6}};

        System.out.println("The values in score1 by row are:");
        displayArray(score1);
        System.out.println("The values in score2 by row are:");
        displayArray(score2);

    }
}
