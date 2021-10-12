package MyAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question9 {
    /**>>>  Write a Java program to insert an element (specific position) into an array.
     * */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] values = {23,11,12,24,43,45,54,56,65,67};
        int index = 5;
        int newNumber = 70;
        System.out.println("This is the original array without number " + newNumber);
        System.out.println(Arrays.toString(values));

        for (int i = values.length - 1; i > index; i--) {
            values[i] = values[i-1];
        }
        values[index] = newNumber;
        System.out.println("This is the new array with number " + newNumber);
        System.out.println(Arrays.toString(values));

    }
}
