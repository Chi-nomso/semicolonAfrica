package Chapter4Exercises;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int gradeCount = 0;
        while(gradeCount <= 10){
            System.out.println("Enter the Grade");
            int grade = input.nextInt();
            total = total + grade;
            gradeCount++;
        }

        int average = total/10;
        System.out.printf("%n%d is the count", gradeCount);
        System.out.printf("%n%d is the Average of the grade", average);
        System.out.printf("%n%d is the Total of the class", total);

       }
}

