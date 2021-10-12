package MyAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question6 {
    /**>>> Write a Java program to find the index of an array element.
     * */

    public static void main(String[] args) {
        int[] values = new int[10];
        Scanner scanner = new Scanner(System.in);
        int target = 30;
        for (int i = 0; i < values.length; i++) {
            System.out.println("enter 10 numbers");
            values[i] = scanner.nextInt();
        }
        int length = values.length;
        int index = 0;
        while (index != length) {
            if (values[index] == target) {
                System.out.println("Element " + target + ", is in index " + index);
            }
            index++;
        }
        System.out.println(Arrays.toString(values));
    }
}
