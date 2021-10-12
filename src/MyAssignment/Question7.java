package MyAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question7 {
    /**
     * Write a Java program to remove a specific element from an array
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] values = new int[10];
        int[] newValues = new int[values.length];
        int indexToRemove = 5;
        for (int i = 0; i < values.length; i++) {
            System.out.println("enter 10 numbers");
            values[i] = input.nextInt();
        }
//        int length = values.length;
//        int index = 0;
//        while (index != length) {
//            if (values[index] == indexToRemove) {
//                newValues[index] = values.length-1;
//                //System.out.println("Element " + indexToRemove + ", is in index " + index);
//            }
//            index++;
//        }
        System.out.println(Arrays.toString(newValues));

    }
}