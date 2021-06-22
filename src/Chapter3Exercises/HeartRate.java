package Chapter3Exercises;

//import java.util.Date;

import java.time.LocalDate;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.year;

public class HeartRate {
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private int maximumHeartRate;
    private int minimumTargetHeartRate;
    private int maximumTargetHeartRate;

    public HeartRate(String firstName, String lastName, Date dateOfBirth){
        this.firstName = firstName;
        this.lastName= lastName;
        this.dateOfBirth = dateOfBirth;

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

    public void displayName() {
        System.out.println(firstName+ ' '+ lastName);
    }

    public int getAge() {
        return LocalDate.now().getYear() - dateOfBirth.getdateYear();
    }


//    public double getPatientAge() {
//        return LocalDate.now().getYear() - year();


}


