package SalesApp;

import java.util.Scanner;

public class MainStore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String display = """
                                                              CHOP-LIFE
                                                          12, Mcquens street,
                                                            Lagos, New york.
                                                         Contact: 08145463014
                """;
        StoreCart cart= new StoreCart();;
        Item item;
        String newProduct;

        //System.out.println(display);
        do{

            System.out.println("What did the Customer buy?");
            String response = input.nextLine();
            System.out.println("How much is the 1 " + response);
            double itemPrice = input.nextDouble();
            System.out.println("Hw many "+ response + " was bought?");
            int quantity = input.nextInt();
            input.nextLine(); //you can also use Method "flushScanner();"

            item = new Item(response, itemPrice, quantity);
            cart.add(item);
            System.out.println("Was any other thing bought?");
            newProduct = input.nextLine();
            System.out.println("Number of items in cart "+cart.getItem().size());
        }
        while(!newProduct.equalsIgnoreCase("no"));
        System.out.println(display);
        System.out.printf("%s%20s%20s%18s%18s\n", "Item Number","Item","Quantity", "Price", "Total");
        for (int i = 0; i < cart.getItem().size(); i++) {
            Item item1 = cart.getItem().get(i);
            String item1Name = item1.getName();
            double item1Price = item1.getPrice();
            int item1Quantity = item1.getQuantity();
            double total = item1Price * item1Quantity;
           // System.out.println(display);
            System.out.printf("%d%33s%15.2f%20d%22.2f\n", i+1, item1Name, item1Price, item1Quantity,total);
            System.out.println();
        }
        System.out.println("Thank you for your Patronage");
        System.out.println("We Hope to see again!");
    }
}
