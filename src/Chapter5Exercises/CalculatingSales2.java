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
public class CalculatingSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
        System.out.println("Enter the Product number:");
        int productNumber = input.nextInt();
        System.out.println("How many did you sell?");
        int productQuantity = input.nextInt();
        double initialTotal;
        double finalTotal = 0;
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
            System.out.println("The Amount for the Product you bought is " + initialTotal);
            System.out.println("Did the Customer buy something else? (reply with yes or no) ");
            String response = input.nextLine();
            if(response.equalsIgnoreCase("yes")){
                System.out.println("Whats the Product Number?");
            }
            System.out.println("The Total amount of everything you bought is "+ finalTotal);

    }
}
}
