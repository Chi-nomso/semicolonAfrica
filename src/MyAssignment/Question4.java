package MyAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question4 {
    /**>>>  Write a Java program to calculate the average value of array elements.
     * */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] values = new int[10];
        int sum = 0;
        double average = 0;

        for (int i = 0; i < values.length; i++) {
            System.out.println("enter 10 numbers");
            values[i] = input.nextInt();
            sum = sum + values[i];
        }
        average =  (double)sum/ values.length;
        System.out.print("The array of values inputed is: ");
        System.out.println(Arrays.toString(values));
        System.out.println("The average of the array is: " + average);
    }
}
