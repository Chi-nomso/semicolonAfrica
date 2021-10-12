package MyAssignment;

import java.util.Arrays;

public class Question1 {
    /**>>> Write a java program to sort a Numeric array using
     * >>> Write a java program to sort a String array
     * */

    public static void main(String[] args) {
        int[] numeric = {34,23,56,78,64,12,4,56,8,2,31,0,87,10,12,5,6,4,9,40};
        int[]numeric2 = new int[numeric.length];
        String[] word = {"yam", "egg", "fish", "bread", "rice", "beans", "stew", "potato"};
        int temp1;
        //int temp2;

        for (int firstNum = 0; firstNum < numeric.length; firstNum++){
            for (int secondNum = firstNum+1; secondNum < numeric.length; secondNum++){
                if(numeric[firstNum] > numeric[secondNum]){
                    temp1 = numeric[firstNum];
                    numeric[firstNum] = numeric[secondNum];
                    numeric[secondNum] = temp1;
                }
            }
        }
        Arrays.sort(word);
        System.out.println(Arrays.toString(word));
        System.out.println(Arrays.toString(numeric));




    }
}
