package africa.semicolon.tddClassPractice;

import java.util.Scanner;

public class Account {
    private double myAccountBalance;
    private int pin = 4444;
    public void deposit(double amountToDeposit) {
        if (amountToDeposit < 0.0) {
            myAccountBalance = myAccountBalance;
        } else {
            myAccountBalance = myAccountBalance + amountToDeposit;
        }
    }
    public double getAccountBalance(){
        return myAccountBalance;
    }

    public void withdraw(double amountToWithdraw) {
        boolean negativeValue = amountToWithdraw < 0.0;
        int userPin;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your pin");
        userPin = input.nextInt();
        if(userPin != pin) {
            myAccountBalance = myAccountBalance;
        }else
        if(negativeValue) {
            System.out.print("You no get money");
            myAccountBalance = myAccountBalance;
        }else
            if(amountToWithdraw > myAccountBalance){
                System.out.print("There's no money on ground");
                myAccountBalance = myAccountBalance;
            }else
                myAccountBalance = myAccountBalance - amountToWithdraw;
    }

    public void setPin(int pin){
        }

    }
}
