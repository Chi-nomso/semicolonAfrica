package Chapter7Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class EliminateDuplicate {
    /** >>> Declare a one dimensional array of length 5;
     * >>> collect user input to fill up the array with numbers between 10-100 resp.
     * >>> as the number comes in, display it as an array.
     * >>> throw an exception to validate if the imputed number exists already, display "Number already exists" and ask again.
     * >>> throw an exception to stop the programme once the values are complete in the array.
     * >>> Display the complete array to complete the array.
     * */

    public static void main(String[] args) {
        int[] values = new int[5];
        int index = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 10-100 respectively");
        int userInput = input.nextInt();
        while(userInput >= 10 && userInput <= 100){
            values[index] = userInput;
            if(index == values.length-1){
                System.out.println("Numbers are complete");
                System.out.println(Arrays.toString(values));
                return;
            }

            System.out.println(Arrays.toString(values));
            System.out.println("Enter another number between 10-100 respectively");
            userInput = input.nextInt();
            for (int i = 0; i < values.length; i++) {
                if(userInput == values[index]){
                    System.out.println("Number you just imputed already exists in the array");
                    return;
               }

            }
            index++;
        }

        System.out.println(Arrays.toString(values));


    }
}
