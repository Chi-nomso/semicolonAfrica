package MyAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question2 {
    /** Write a Java program to sum values of an array
     * */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] values = new int[10];
        int sum = 0;

        for (int i = 0; i < values.length; i++) {
            System.out.println("enter 20 numbers");
            values[i] = input.nextInt();
            sum = sum + values[i];
        }

        System.out.println("This is the array of numbers inputed");
        System.out.println(Arrays.toString(values));
        System.out.println("This is the sum of the values: " + sum);
    }
}
