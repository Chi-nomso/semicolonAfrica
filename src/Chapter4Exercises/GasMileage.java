package Chapter4Exercises;

import java.util.Scanner;

public class GasMileage {
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
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mr Cab Man, How many Miles did you cover during your trip?");
        System.out.println("Or Press -1 to exit Program");
        int miles = input.nextInt();
        System.out.println("And How many gallons did you use?, press -1 to exit");
        int gallons = input.nextInt();
        double combinedMPG =0.0;
        int tripCounter = 1;
        Double milesPerGallon = 0.0;

        while(miles != -1 && gallons != -1){
            milesPerGallon = (double)miles / gallons;
            System.out.println("The Miles per gallon of your Trip is " + milesPerGallon );
            tripCounter++;
            System.out.println();
            System.out.println("Enter the Miles again, or -1 to exit");
            miles = input.nextInt();
            if(miles != -1){
            System.out.println("And gallons too?, or -1 to exit");
            gallons = input.nextInt();
        }
    }
        combinedMPG = combinedMPG + milesPerGallon;
        System.out.println("The combined MilesPerGallon of all\t" + tripCounter+ "\ttrips is\t" + combinedMPG);

    }
}
