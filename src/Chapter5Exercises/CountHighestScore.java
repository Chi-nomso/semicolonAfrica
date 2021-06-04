package Chapter5Exercises;

import java.util.Scanner;

public class CountHighestScore {
            /* initialize Highest score to Integer.MIN_VALUE
        Initialize Student name withHighest Score for "Default"
        prompt user to input number of Students
        loop iterates the number of students times,
        do: Enter students name
            Enter students score
            if score> highest Score
            then: highest score = score
            and: Name of student with highest = student.
         */
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                int studentsNumber;
                String studentName;
                String studentWithHighestScore = null;
                int highestScore = Integer.MIN_VALUE;
                int counter = 1;

                String prompt = """
                        Welcome to Special School Portal, Kindly input the
                        number of Students whose  score you'd like to track
                        """;
                System.out.println(prompt);
                studentsNumber = input.nextInt();

                while(counter<= studentsNumber){
                    System.out.println("Enter Student Score");
                    int score = input.nextInt();
                    System.out.println("Enter Student Name");
                    studentName = input.next();
                    if(score > highestScore){
                    highestScore = score;
                    studentWithHighestScore = studentName;}
                    counter++;
                }
                System.out.printf("%s has the highest score which is %d", studentWithHighestScore,highestScore);


    }
}
