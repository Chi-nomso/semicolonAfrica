package Chapter4Exercises;

import java.util.Scanner;

public class Salary {
    Scanner input = new Scanner(System.in);
    /* ---> Impute the List of Employee(3)
       ---> Impute the fixed hourly rate as the employer
       ---> Impute number of hours employee has worked
       ---> Calculate gross pay for each employee (if hours < 40hrs: hourly rate * hrs spent)
       ---> Calculate gross pay for each employee (if hours > 40hrs: hourly rate * hrs spent * 1.5)
       ---> Display Each employee's gross pay
       */
    private int employeeList;
    private double fixedRate;
    private int workingHour;
    private double grossPay;

    public void setEmployeeList(int employeeList) {
    this.employeeList = employeeList;
    }

    public int getEmployeeList() {
        return employeeList;
    }


    public void setfixedRatePerHour(double fixedRatePerHour) {
        fixedRate = fixedRatePerHour;
    }

    public double getfixedRatePerHour() {
        return fixedRate;
    }


    public void setEmployeeWorkingHour(int employeeWorkHour) {
        workingHour = employeeWorkHour;
    }
    public double getEmployeeWorkinghour() {
        return workingHour;
    }

    public void calculateGrossPay(double fixedRate, double workingHour){
        if(workingHour < 40.0){
            this.grossPay = fixedRate * workingHour;
            }
        else if(workingHour > 40.0){
            this.grossPay = fixedRate * workingHour * 1.5;
        }
    }

    public double getGrossPay() {
        return this.grossPay;
    }
}
