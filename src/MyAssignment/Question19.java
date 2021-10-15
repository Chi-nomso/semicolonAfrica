package MyAssignment;

import java.util.Arrays;

public class Question19 {
    /**>>>Write a Java program to add two matrices of the same size
     * */

    public static int sumOfMatrices(int[][]number1, int[][]number2){
        int[][]number3 = new int[number1.length][number2.length];
        int sum = 0;

        for (int i = 0; i < number1.length; i++) {
            for (int j = 0; j < number2.length; j++) {
                sum = number1[i][j] + number2[i][j];
                number3[i][j] = sum;
            }
        }
        System.out.print(Arrays.deepToString(number3)+ " "+ "\n");
        System.out.println();
        return sum;

    }


    public static void main(String[] args) {
        int[][] number1 = {{43,54,23,65},{12,23,34,45},{56,67,78,89},{65,54,43,32}};
        int[][]number2 = {{11,12,22,23,33},{99,98,88,77},{66,65,55,54},{44,43,33,32}};
        Question19.sumOfMatrices(number1,number2);
    }
}
