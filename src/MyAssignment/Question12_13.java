package MyAssignment;

import java.sql.Array;
import java.util.Arrays;

public class Question12_13 {
    /**>>> Write a Java program to find the duplicate values of an array of integer values.
     * */

    public static void main(String[] args) {
        int[] values = {23,11,12,23,43,11,54,54,65,67};
        int [] duplicates = new int[values.length];
        String[] word = {"yam", "egg", "yam", "bread", "rice", "rice", "stew", "potato"};
        String[] duplicates2 = new String[word.length];

        for (int i = 0; i < values.length; i++) {
            for (int j = i+1; j < values.length ; j++) {
                if(values[i] == values[j]){
                    duplicates[i] = values[j];
                }
            }
        }

        for (int i = 0; i < word.length; i++) {
            for (int j = i + 1; j < word.length; j++) {
                if (word[i].equals(word[j])) {
                    duplicates2[i] = word[j];
                }
            }

        }
        System.out.println("Original Number Array:");
        System.out.println(Arrays.toString(values));
        System.out.println("Duplicate values in the array is: ");
        System.out.println(Arrays.toString(duplicates));
        System.out.println("Original Word Array:");
        System.out.println(Arrays.toString(word));
        System.out.println("Duplicate words in the array is: ");
        System.out.println(Arrays.toString(duplicates2));



    }
}
