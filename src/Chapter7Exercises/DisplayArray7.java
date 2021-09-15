package Chapter7Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class DisplayArray7 {
    /**---> This program allows the user to fill in the values of the declared array.
     * ---> displays the arrays
     * */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words =new String[5];
        for (int i = 0; i < words.length; i++) {
            System.out.println("Enter the word");
            words[i] = input.nextLine();
        }
        for (int j = words.length; j >=0 ; j--) {
        }
        System.out.println(Arrays.toString(words));
    }
}
