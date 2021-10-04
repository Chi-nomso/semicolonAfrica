package Chapter7Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElimination {
   /** >>> Declare a one dimensional array of length 5
    *  >>> Ask user input to fill up the array with number btwn 10-100
    *  >>> Display the complete array with unique different 5numbers
    *  >>>Throw an exception if any number appears twice
    *  >>> as each number is taken, display it (if its not the same as the previous number imputed)
    * */

   public static void main(String[] args) {
        int[] number = new int[5];
        Scanner input = new Scanner(System.in);
       System.out.println("Enter a number between 10 and 100 inclusive");
       int value = input.nextInt();
       int index = 0;
       while(value >=10 && value <=100){
           number[index] = value;
           System.out.println(Arrays.toString(number));
           System.out.println("Enter another number between 10 and 100 inclusive");
           value = input.nextInt();
           if(value >=10 && value<=100){
                   if (isFound(number, value)) {

                   }
                   else
                    index++;
           }
       }

   }
   public static boolean isFound(int []number, int value ){
      for(int i=0;  i<number.length; i++){
           if(number[i] == value) {
               System.out.println("number already exist");
               return true ;
           }
       }
       return false;
   }

}
