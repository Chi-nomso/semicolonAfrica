package MyAssignment;

import java.util.Arrays;

public class Question15 {
    /**>>>  Write a Java program to find the common elements between two arrays of integers.
     * */
    public static void main(String[] args) {
        int [] number1 = {1,2,3,4,5,6,7,8,9,10};
        int[]number2 = {10,15,22,4,8,9};
        int[]number3 = new int[number2.length];

        for (int i = 0; i < number2.length; i++){
            for (int j = 0; j < number1.length; j++) {
                if(number2[i] == (number1[j])){
                    number3[i] = number1[j];
                }
            }
        }
        System.out.println("The following numbers can be found in both Arrays: ");
        System.out.println(Arrays.toString(number3));

    }
}
