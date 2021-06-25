package BankApplication;

public class StaffAccount{

    private String firstName;
    private String lastName;
    private int Pin;

    public StaffAccount(String firstName, String lastName, int pin) {
        this.firstName = firstName;
        this.lastName = lastName;
        Pin = pin;
    }

    public StaffAccount(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void setPin(int staffPin) {
        this.Pin = staffPin;
    }

    public int getPin() {
        return Pin;
    }

    public void setStaffName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getStaffName() {
        return firstName;
    }
}
