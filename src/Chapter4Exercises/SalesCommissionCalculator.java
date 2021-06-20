package Chapter4Exercises;

import java.util.Scanner;

public class SalesCommissionCalculator {
    /*
     ---> Ask User to input item value
     ---> while input is not -1, keep imputing
     ---> Keep asking for userInput
     ---> initialize total to zero
     ---> initialize counter to 0
     ---> Calculate the user weekly earnings(9% of value + 200)
     ---> Display weekly earning
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dear worker, impute the amount of the sold item:");
        double itemAmount = input.nextDouble();
        double total= 0.0;
        int counter = 0;
        double weeklyEarning = 0.0;
        while(itemAmount != -1){
            counter++;
            total = total + itemAmount;
            weeklyEarning = 200 + itemAmount * 9/100;
            System.out.print("Input the next amount: ");
            itemAmount = input.nextDouble();
        }
        System.out.println("You imputed " + counter + " Item amounts");
        System.out.println("The total amount of all items you imputed is " + total);
        System.out.println("Your Earning for the week is " + weeklyEarning);
    }
}
