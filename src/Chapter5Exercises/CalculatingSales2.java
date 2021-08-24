package Chapter5Exercises;

import java.util.Scanner;

/* Switch case for Product price for each product number.
    switch(num){
        case 1:
            value = 2.98
        break;
case 2:
      value = 4.50
        break;
case 3:
      value = 9.98
        break;
case 4:
      value = 4.49
        break;
case 5:
      value = 6.87
        break;
 */
public class CalculatingSales2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double finalTotal = 0;
        double initialTotal;
        int count = 0;
        int productNumber = 0;
        String response;
        System.out.println("Kindly Begin");
        response = input.next();
        while (response.equals("yes")) {
            System.out.println("Enter the Product number:");
            productNumber = input.nextInt();
            System.out.println("How many did you sell?");
            int productQuantity = input.nextInt();
            double price = switch (productNumber) {
                case 1 -> 2.98;
                case 2 -> 4.50;
                case 3 -> 9.98;
                case 4 -> 4.49;
                case 5 -> 6.87;
                default -> throw new IllegalStateException("Unexpected value: " + productNumber);
            };
            initialTotal = price * productQuantity;
            finalTotal = initialTotal + finalTotal;

            System.out.println("The Amount for the Product you bought is " + price);
            System.out.println("The initial amount is " + initialTotal);
            count++;
            System.out.println("Did the Customer buy something else? (reply with yes or no) ");
            response = input.next();
        }
        System.out.println("The Total amount of the " + count + " Items you bought is " + finalTotal);
    }
}

