package Chapter5Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SalesBoy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> items = new ArrayList<>();
        List<Double> prices = new ArrayList<>();
        List<Integer>amount = new ArrayList<>();
        double totalPrice = 0;

        String newProduct;
        do {
            System.out.println("What did that person buy?");
            String userInput = input.nextLine();
            items.add(userInput);
            System.out.println("How much is 1 " + userInput);
            double price = input.nextInt();
            prices.add(price);
            System.out.println("How many did he buy?");
             int quantity = input.nextInt();
                    input.nextLine();
             amount.add(quantity);

            totalPrice += quantity * price;
            System.out.println("Did he buy something else?");
            newProduct = input.nextLine();
            }
        while(!newProduct.equalsIgnoreCase("no"));
        System.out.printf("%s%15s%20s%18s%18s\n", "Item Number", "Item","Quantity", "Price", "Total");
        for (int i = 0; i < items.size(); i++) {
            getInvoice(i+1, items.get(i),prices.get(i), amount.get(i),prices.get(i)* amount.get(i));
        }
        System.out.println("Your total price is " + totalPrice);
       }
       public static void getInvoice(int itemNumber, String item, double price, int quantity, double total){
           System.out.printf("%d%15s%15.2f%20d%22.2f\n", itemNumber,item,price, quantity,total);
       }
    }

