package Chapter7Exercises;

import java.util.Arrays;

public class ClassNumber {
    public static void main(String[] args) {
        /* write an array of numbers that displays the sum of
        all the numbers in the array
        *Assg*
       In Katar class create a method called find maximum, method takes in an array and returns the maximum
        number, minimum and average(returning double)
        assertEquals(8, kata.findMaximumFrom(score)).
        */

        int[] numbers = {2,4,6,8,7};
        int sum = 0;
        int counter=0;
        for(counter=0;counter<numbers.length;counter++){
            sum= sum + numbers[counter];
            System.out.print(numbers[counter]);
        }
        System.out.println();
        System.out.println("Total sum is "+ sum);

    }
}
