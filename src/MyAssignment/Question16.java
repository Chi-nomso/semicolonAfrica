package MyAssignment;

import java.util.Arrays;

public class Question16 {
    /**>>>Write a Java program to remove duplicate elements from an array
     * */

    public static void main(String[] args) {
        int[] values = {2,2,3,3,5,6,6,7,7,8,8,9,9,10,10};
        int[] temp = new int[values.length];
        int index = 0;

        for (int i = 0; i < values.length-1 ; i++) {
            if(values[i+1] == values[index]){
                temp[i] = values[i+1];
            }
            index++;
        }

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(values));
        System.out.println("The duplicate values in this array are:");
        System.out.println(Arrays.toString(temp));
    }
}
