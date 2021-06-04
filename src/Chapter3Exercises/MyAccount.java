package Chapter3Exercises;

public class MyAccount {
    private String acctName;
    private int acctNumber;
    private String acctType;
    private double acctBalance;


    public void setmyAccountname(String LadyNomso) {acctName = LadyNomso;
    }
    public String getmyAccountname() {
        return acctName;
    }


    public void setmyAccountnumber(int number) {acctNumber = number;
    }
    public int getmyAccountnumber() {
        return acctNumber;
    }


    public void setmyAccountType(String acctTypeSet) {acctType = acctTypeSet;
    }
    public String getmyAccountType() {
        return acctType;
    }
    

    public void setmyAccountBalance(double balanceIsSet) {
        acctBalance = balanceIsSet;
    }
    public double getmyAccountBalance() {
        return acctBalance;
    }


    public void withdraw(double amount){if ( acctBalance > 1000){
        double withdraw = amount;
        acctBalance = acctBalance - withdraw;
    }else{
        System.out.println("You no get money");
    }
}

    public void deposit(double amount) {
        double deposit = amount;
        acctBalance = acctBalance + deposit;
    }
}
