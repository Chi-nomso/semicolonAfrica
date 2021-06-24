package BankApplication;

public class StaffAccount{

    private String FullName;
    private int Pin;

    public void setFullName(String fullName) {
        this.FullName = fullName;
    }
    public String getFullName() {
        return FullName;
    }

    public void setPin(int staffPin) {
        this.Pin = staffPin;
    }

    public int getPin() {
        return Pin;
    }
}
