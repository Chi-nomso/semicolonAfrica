package Chapter7Exercises;

import java.util.Scanner;
/* Exception Hanging ensures that the program runs and fails well,
rather than just bouncing out when the wrong value is imputed.
 */

public class ExceptionHnging {
    public static void main(String[] args) {
        int[] scores = {34,56,75,34,65};
        int counter=0;
        int user;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Which score do you want");
             user = input.nextInt();
        try{
        System.out.println(scores[user]);
    }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("I catch am");
        }
}
        while( counter != 5);
}
}
