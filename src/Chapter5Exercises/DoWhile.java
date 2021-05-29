package Chapter5Exercises;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner inputcollector = new Scanner(System.in);
        int total = 0;
        //prompt
        /*System.out.println("Enter a score or -1 to exit");
        int score = inputcollector.nextInt();
        while(score != -1){
            total = total +score;
        }
        System.out.println("Total score is +total");*/

        int score = 0;
        do{
            total +=score;
            System.out.println("Enter a score or -1 to exit");
            score = inputcollector.nextInt();
        }
        while(score != -1);
        System.out.println("Total score is: (total +1)");
    }
}
