package BankApplication;

public class BankApp {
    private String FirstName;
    private String LastName;
    private double Deposit;
    private double AccountBalance;


    public void setFirstName(String accountFirstName) {
        this.FirstName = accountFirstName;
    }
    public String getFirstName() {
        return FirstName;
    }


    public void setLastName(String accountLastName) {
        this.LastName = accountLastName;
    }
    public String getLastName() {
        return LastName;
    }


    public void deposit(double amountDeposited) {
        AccountBalance = AccountBalance + amountDeposited;
        this.Deposit = amountDeposited;
    }
    public double getDeposit() {
        return Deposit;
    }

    public double getAccountBalance() {
        return AccountBalance;
    }

    public void withdraw(double amountWithdrawn) {
        AccountBalance = AccountBalance - amountWithdrawn;
    }
}
