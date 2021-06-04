package Chapter3Exercises;

import java.util.Date;

public class HeartRate {
    private String firstName;
    private String lastName;
    private Date birthDay;

    public HeartRate(String firstName, String lastName, Date birthDay){
        this.firstName = firstName;
        this.lastName= lastName;
        this.birthDay = birthDay;
    }

    public void setPatientName(String PatientName) {
        firstName = PatientName;
    }
    public String getPatientName() {
        return firstName;
    }


    public void setlastName(String PatientlastName) {
        lastName = PatientlastName;
    }
    public String getlastName() {
        return lastName;
    }

    public void setBirthDay(Date birthDay) {

    }
}
