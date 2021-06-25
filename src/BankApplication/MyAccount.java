package BankApplication;

public class MyAccount{
    private String firstName;
    private String lastName;
    private double deposit;
    private double accountBalance;
    private final int accountNumber;

    public MyAccount(int accountNumber) {
        this.accountNumber = accountNumber;
    }


    public void setFirstName(String accountFirstName) {
        this.firstName = accountFirstName;
    }
    public String getFirstName() {
        return firstName;
    }


    public void setLastName(String accountLastName) {
        this.lastName = accountLastName;
    }
    public String getLastName() {
        return lastName;
    }


    public void deposit(double amountDeposited) {
        accountBalance = accountBalance + amountDeposited;
        this.deposit = amountDeposited;
    }
    public double getDeposit() {
        return deposit;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void withdraw(double amountWithdrawn) {
        accountBalance = accountBalance - amountWithdrawn;
    }

    public int getAccountNumber() {
        return accountNumber;


    }
}
