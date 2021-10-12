package MyAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question5 {
    /** >>>Write a Java program to test if an array contains a specific value.
     * >>> print the index that contains the value.
     * */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] values = new int[10];
        int target = 30;
        for (int i = 0; i < values.length; i++) {
            System.out.println("enter 10 numbers");
            values[i] = input.nextInt();
        }
        for (int value : values) {
            if(value == target){
                System.out.println("True " +target + " is present in this array.");
                break;
        }
        }
        System.out.println(Arrays.toString(values));
    }
}
