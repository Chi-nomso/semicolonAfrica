package Chapter5Exercises;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner inputcollector = new Scanner(System.in);
        int total = 0;
        //prompt
        int score = 0;
        do{
            System.out.println("Enter a score or -1 to exit");
            total +=score;
            score = inputcollector.nextInt();
        }
        while(score != -1);
        System.out.printf("Total score is %d: ", total);
    }
}
