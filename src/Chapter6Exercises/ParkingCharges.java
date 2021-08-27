package Chapter6Exercises;

import java.util.Scanner;

public class ParkingCharges {
    /**
     * --> $2.00 MIN charge for 3hrs
     * --> $0.50 per hr after 3hrs
     * --> $10.00 MAX charge for 24hrs
     * --> Collect hrs parked by each Customer
     * --> Declare Method (CalculateCharges)
     * --> display the charge for the Customer
     * --> Calculate the total charge and Display
     * --> Total charge is xHrs * (current Charge)
     */

    public static double calculateCharges(double currentCharge, int hour) {
        double total = currentCharge;
        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hour = 0;
        int count = 1;
        while (hour > 0) {
            System.out.println("How many hours was your car packed?");
            hour = input.nextInt();
            double charge = 2.00;
            double extraCharge = 0.50;


            if (hour == 24) {
                charge = 10.00;
            } else if (hour > 3 && hour < 24) {
                charge = charge + (hour - 3) * extraCharge;
            }
            count++;

            System.out.println("The hours you parked is " + hour + " and your charge is " + charge);
            System.out.println("The total Bill is " + ParkingCharges.calculateCharges(charge, hour));
        }
        System.out.println(count + " Customers packed their cars yesterday");
    }
}
