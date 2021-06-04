package Chapter3Exercises;

import java.util.Scanner;

public class AccountApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyAccount nomsoAccount = new MyAccount();

        int money;
        int userInput;

        String prompt = """
                --> Enter 1 for Deposit;
                --> Enter 2 to Withdraw;
                --> Enter 3 to Exit;            
                """;

        do {
            System.out.println(prompt);
            userInput = input.nextInt();
            switch (userInput) {
                case 1:
                    System.out.println("How much do you want to Deposit?");
                    money = input.nextInt();
                    nomsoAccount.deposit(money);
                    System.out.println("Your Account balance is now " + nomsoAccount.getmyAccountBalance());
                    break;
                case 2:
                    System.out.println("How much do you want to Withdraw?");
                    money = input.nextInt();
                    nomsoAccount.withdraw(money);
                    System.out.println("Your Account balance is now " + nomsoAccount.getmyAccountBalance());
                    break;
            }
        } while (userInput != 3);
        }
    }



