package Chapter4Exercises;

import java.util.Scanner;

public class CreditCalculator {
    /*  ---> input account number
        ---> input Month Begin Acct Balance
        ---> input total items charged
        ---> input Total credit
        ---> input Allowed Credit Limit
        ---> calculate the new Balance(begin bal + ChargedItems - TotalCredit)
        ---> display new balance
        ---> determine if new balance exceeds Credit Limit
        ---> if True, print : Credit Limit Exceeded
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String prompt = """
                Hello Customer, you are welcome.
                Kindly input the following requirements:
                """;
        System.out.println(prompt);
        System.out.print("Your Account number: ");
        int acctNumber = input.nextInt();
        System.out.print("Your Account Balance at the beginning of the Month: ");
        int initialBalance = input.nextInt();
        System.out.print("The total items charged: ");
        int itemsCharged = input.nextInt();
        System.out.print("The Total Credit:");
        int totalCredit = input.nextInt();
        System.out.print("The Allowed Credit Limit: ");
        int creditLimit = input.nextInt();

        int newBalance = initialBalance + (itemsCharged - totalCredit);
        System.out.println("Your new balance is " + newBalance);

            if(newBalance > creditLimit){
                System.out.println("Credit Limit Exceeded");
        }
    }
}
