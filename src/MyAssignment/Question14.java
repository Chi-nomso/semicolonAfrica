package MyAssignment;

import java.util.Arrays;

public class Question14 {
    /** >>> Write a Java program to find the common elements between two arrays (string values).
     * */

    public static void main(String[] args) {
        String[] meal = {"yam", "egg", "fish", "bread", "rice", "beans", "stew", "potato"};
        String[] drink = {"yam", "bread", "tea", "stew", "potato"};
        String[] temp = new String[drink.length];


        for (int i = 0; i < drink.length; i++) {
            for (int j = 0; j < meal.length; j++) {
                if(drink[i] .equals(meal[j])){
                    temp[i] = meal[j];
                }
            }
        }

        System.out.println("The following words can be found in both meal and drink arrays: ");
        System.out.println(Arrays.toString(temp));

    }
}
