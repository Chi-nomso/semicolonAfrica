package BankPHP;

import java.security.SecureRandom;

public class Account {
    private final String accountName;
    private String accountNumber;
    private String pin;
    private double balance;
    private final BankDB bankDB = new BankDB();

    public Account(String accountName){
        this.accountName = accountName;
        this.accountNumber = generateAccountNumber();
    }


    private String generateAccountNumber() {
        SecureRandom random = new SecureRandom();
        String randomAccountNumber = "";
        for(int number = 0; number < 10; number++){
            int randomInt = random.nextInt(9);
            randomAccountNumber = randomAccountNumber + randomInt;
        }
        return randomAccountNumber;
    }



    public String getAccountName() {
        return this.accountName;
    }

    public String getPin() {
        return this.pin;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if(amount > 0.0)
            this.balance = amount;
    }

    public void withdraw(double amountWithdrawn) {
        if(amountWithdrawn > 0.0)
        this.balance = balance - amountWithdrawn;
    }

    public void transfer(String accountNumber, double amountToTransfer) {
        if (amountToTransfer > 0.0) {
            for (User user : bankDB.getUsers()) {
                Account account = user.getAccounts().get(0);
                if (account.accountNumber.equals(accountNumber)) {
                    account.deposit(amountToTransfer);
                }
            }
        }
    }
}
