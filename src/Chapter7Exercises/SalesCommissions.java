package Chapter7Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class SalesCommissions {
    /** >>> Declare a one dimensional array of length 9
     * >>> collect the prices from the user
     * >>> initialize a frequency variable
     * >>> use a for loop with counter to loop through the prices given by the user to determine what grossPay falls between what range
     * >>> increase the frequency as thr numbers are supplied
     * >>> display the array of prices
     * >>> display in a tabular form, how many people fall within the given range.
     * >>>
     * */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOfSalesPeople = 10;
        int[] counter = new int[9];
        int count = 0;
        while (count <= numOfSalesPeople) {
            System.out.println("Enter the Gross Pay");
            int profit = input.nextInt();
            int grossProfit = (int) (200 + 0.09 * profit);
            int index = (grossProfit / 100) - 2;
            if(index >= 8) counter[8] = counter[8] + 1;
            else counter[index] = counter[index] + 1;
            count++;
        }
        System.out.println(Arrays.toString(counter));
        for (int i = 0; i < counter.length; i++){
            System.out.printf("%4d - %4d = %d%n", (200 + (100 * i)), ((299 + (100 * i))), counter[i]);
        }
    }
}