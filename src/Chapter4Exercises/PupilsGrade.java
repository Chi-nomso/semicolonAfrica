package Chapter4Exercises;
/*Tell user to impute his score,
 if the score ranges from 90 and above, display "Grade A".
If the score ranges from 80-90, display "Grade B"
if the score ranges from 70-79, display "Grade C"
if the score ranges from 60-69, display "Grade D",
if the score is below 60, display "Grade F"
 */
import java.util.Scanner;

public class PupilsGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Score");
        int score = input.nextInt();

        if(score >= 90){
            System.out.println("You're in Grade A");
        }
        if(score >= 80 && score <90){
            System.out.println("You're in Grade B");
        }
        if(score >= 70 && score <=79){
            System.out.println("You're in Grade C");
        }
        if(score >= 60 && score <= 69){
            System.out.println("You're in Grade C");
        }
        if (score < 60){
            System.out.println("You're in Grade F");
    }
    }
}
