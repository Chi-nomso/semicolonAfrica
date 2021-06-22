package VariousPractice;

import java.util.Scanner;
/* --> Input miles Driven
   -->Input gallon used
    As long as miles driven and gallons used != -1
    ---> calculate miles per gallon
    ---> Display miles per gallon
    ---> Print the combined miles per gallon
    //then
    --> Input miles Driven
   -->Input gallon used
 */

public class Mileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Miles Driven:, or -1 to end ");
        int milesDriven = input.nextInt();
        System.out.println("Enter Gallons Used: or -1 ro exit ");
        int gallonsUsed = input.nextInt();

        double combinedMpg = 0.0;

        while(milesDriven != -1 && gallonsUsed != -1){
            double milesPerGallonUsed = (double)milesDriven / gallonsUsed;
            System.out.println("MPG for trip is " + milesPerGallonUsed);
            combinedMpg = combinedMpg + milesPerGallonUsed;
            System.out.println("The combined Miles per gallon is "+ combinedMpg);
            System.out.println();
            System.out.println("Enter Miles Driven:, or -1 to end ");
            milesDriven = input.nextInt();
            System.out.println("Enter Gallons Used: or -1 ro exit ");
            gallonsUsed = input.nextInt();
        }

    }

}
