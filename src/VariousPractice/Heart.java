package VariousPractice;

import java.util.Date;

public class Heart {
    private String firstName;
    private String lastname;
    private Date dateOfBirth;
    private int maximumHeartRate;
    private int minimumTargetHeartRate;
    private int maximumTargetHeartRate;



    public Heart(String firstName, String lastname, Date dateOfBirth) {
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
    }

    public Heart() {

    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}

