package MyAssignment;

import java.sql.Array;
import java.util.Arrays;

public class Question12_13 {
    /**>>> Write a Java program to find the duplicate values of an array of integer values.
     * */

    public static void main(String[] args) {
        int[] values = {23,11,12,23,43,11,54,54,65,67};
        String[] word = {"yam", "egg", "yam", "bread", "rice", "rice", "stew", "potato"};
        int temp = 1;
        String temp2;
        int [] duplicates = new int[values.length];
        String[] duplicates2 = new String[word.length];

        for (int i = 0; i < values.length; i++) {
            if(values[i] == values[temp]){
                duplicates[i] = values[temp];
            }else{
                temp++;
            }
        }
        System.out.println("Original Number Array:");
        System.out.println(Arrays.toString(values));
        System.out.println("Duplicate values in the array is: ");
        System.out.println(Arrays.toString(duplicates));



    }
}
