package Chapter4Exercises;

import java.util.Scanner;

public class SalesCommissionCalculator {
    /*---> Ask User to input an item number
     ---> Use switch case/ if statement for item number and value
     ---> while input is not -1, keep imputing
     ---> Keep asking for userInput
     ---> initialize total to zero
     ---> initialize counter to 0
     ---> Calculate the user weekly earnings(9% of value + 200)
     ---> Display weekly earning
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dear worker, impute the item sold: ");
        int itemAmount = input.nextInt();

        double item1 = 293.99;
        double item2 = 129.75;
        double item3 = 99.95;
        double item4 = 350.89;
        double sumOfPrice = 0;
        double weeklyEarning;

        while (itemAmount != -1) {
            System.out.print("Dear worker, impute the item sold: ");
            itemAmount = input.nextInt();

            if (itemAmount == 1) {
                sumOfPrice = sumOfPrice + item1;
            } else if (itemAmount == 2) {
                sumOfPrice = sumOfPrice + item2;
            } else if (itemAmount == 3) {
                sumOfPrice = sumOfPrice + item3;
            } else if (itemAmount == 4) {
                sumOfPrice = sumOfPrice + item4;
            }
        }
        System.out.println("The sum of all Items bought is "+ sumOfPrice);
            weeklyEarning = 200 + (9 * 1.0 / 100 * sumOfPrice);
            System.out.println("This is your Earning for the week " + weeklyEarning);
        }
}

