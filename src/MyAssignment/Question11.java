package MyAssignment;

import java.util.Arrays;

public class Question11 {
    /**Write a Java program to reverse an array of integer values.
     * */

    public static void main(String[] args) {
        int[] values = {23,11,12,24,43,45,54,56,65,67};
        int[] newValues = new int[10];
        int temp = values.length;

        for (int i = 0;  i < values.length; i++){
            newValues[temp -1] = values[i];
            temp--;
        }
        System.out.println("The Original array is: ");
        System.out.println(Arrays.toString(values));
        System.out.println("The reversed array is: ");
        System.out.println(Arrays.toString(newValues));

    }
}
