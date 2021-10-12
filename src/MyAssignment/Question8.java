package MyAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question8 {
    /**>>>  Write a Java program to copy an array by iterating the array
     * */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] values = new int[10];
        int[] newValues =  new int[values.length];

        for (int i = 0; i < values.length; i++) {
            System.out.println("enter 10 numbers");
            values[i] = input.nextInt();
            newValues = Arrays.copyOf(values,values.length);
        }
        System.out.print("Original Array: ");
        System.out.println(Arrays.toString(values));
        System.out.print("Copied Array: ");
        System.out.println(Arrays.toString(newValues));
    }
}
