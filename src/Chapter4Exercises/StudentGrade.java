package Chapter4Exercises;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Score");
        int score = input.nextInt();

        if(score >= 90){
            System.out.println("You're in Grade A");
    }else
            if(score >= 80 && score <90 ){
                System.out.println("You're in Grade B");
            } else
                if(score >= 70 && score <=79 ){
                    System.out.println("You're in Grade C");
                }else
                    if(score >= 60 && score <= 69){
                }else
            if(score < 60){
                System.out.println("You're in Grade F");
            }
    }

}

