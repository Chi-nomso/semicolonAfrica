package africa.semicolon.tddClassPractice;
import java.util.Scanner;

public class SixtyScore {
    public static void main(String... args){
        Scanner input  = new Scanner(System.in);
        int score;
        System.out.println("Enter Your Score");
        score = input.nextInt();

        if(score >= 60){
        System.out.println("You have Passed");
        }else
                System.out.println("You have Failed");


    }

}
