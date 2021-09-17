package Chapter7Exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DisplayArrayExample8 {
    /**
     * ---> Collect numbers from a user into an array
     * ---> Using a for loop to loop through the given values
     * ---> display all the positive values imputed
     * ---> display the numbers in a reversed order.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] values = new int[7];
        for (int i = 0; i < values.length; i++) {
            System.out.println("Enter Number");
            values[i] = input.nextInt();
        }
            System.out.println("Original Array");
            System.out.println(Arrays.toString(values));
            System.out.println("Reversed Array");
            int[]numbers = new int[7];

            for(int i = 0; i < numbers.length; i++){
                numbers[i] = values[numbers.length-1 -i];
            }
            System.out.println(Arrays.toString(numbers));
    }
}
