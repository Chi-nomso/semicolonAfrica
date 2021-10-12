package MyAssignment;

import java.util.Arrays;

public class Question10 {
    /**>>> Write a Java program to find the maximum and minimum value of an array.
     * */

    public static void main(String[] args) {
        int[] values = {23,11,12,24,43,45,54,56,65,67};
        int max = 1;
        int min = values[0];

        for (int i = 0; i < values.length; i++) {
            if (values[i] < min){
                min = values[i];
            }
            if(values[i] > max){
                max = values[i];
            }
        }
        System.out.println(Arrays.toString(values));
        System.out.println("The minimum is " + min);
        System.out.println("The maximum is "+ max);

    }
}
