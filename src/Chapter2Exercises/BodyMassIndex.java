package Chapter2Exercises;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Weight in Pounds");
        double weight = input.nextDouble();

        System.out.println("Enter your Height in Inches");
        double height = input.nextDouble();
        double bmiOne = weight * 703;
        double bmiTwo = height * height;
        double bmi = bmiOne/bmiTwo;

        System.out.printf("Your BMI is %f%n", bmi);

        System.out.println("BMI values \n");
        System.out.println("Underweight: less than 18.5 \n");
        System.out.println("Normal: between 18.5 - 24.9 \n");
        System.out.println("Overweight: between 25 - 29.9 \n");
        System.out.println("Obese: 30 and above \n");

    }
}