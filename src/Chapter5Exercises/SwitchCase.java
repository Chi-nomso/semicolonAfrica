package Chapter5Exercises;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput;
        do {
            System.out.println("Welcome to My Bank!");

            System.out.println("Enter 1 for Deposit\nEnter 2 for Withdrawal\nEnter 3 to View all Account\nEnter 4 to Transfer\nEnter 5 to View your details\nEnter 6 to exit\nEnter 7 to Logout;");
            System.out.println("Enter a valid Option");
            userInput = input.nextInt();
            System.out.println();

            switch (userInput) {
                case 6:
                    System.out.println("Deposit: ");
                    break;

                case 3:
                    System.out.println("View all Account");
                    break;

                case 4:
                    System.out.println("Transfer");
                    break;

                case 2:
                    System.out.println("Withdraw");
                    break;

                case 1:
                    System.out.println("Deposit");
                    break;

                case 5:
                    System.out.println("View Your Details");
                    break;
                default:
                    System.out.println("Enter a valid Option");
            }

            /*if (userInput == 1) {System.out.println("Deposit: ");}
            if (userInput == 2) {System.out.println("Withdraw");}
            if (userInput == 3) {System.out.println("View all Account");}
            if (userInput == 4) {System.out.println("Transfer");}
            if (userInput == 5) {System.out.println("View Your Details");}
            if (userInput == 7) {System.out.println("Logout");}*/

        } while(userInput != 6);
            userInput++;
    }
    }

        /*in place of the 'if Statements, you can use the switch case because the options are
            assigned to one product 'userInput' and its not a boolean.
             */