package Chapter4Exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalaryTest {
    /* ---> Impute the List of Employee(3)
      ---> Impute the fixed hourly rate as the employer
      ---> Impute number of hours employee has worked
      ---> Calculate gross pay for each employee (if hours < 40hrs: hourly rate * hrs spent)
      ---> Calculate gross pay for each employee (if hours > 40hrs: hourly rate * hrs spent * 1.5)
      ---> Display Each employee's gross pay
      */

    private  Salary mySalary;
    @BeforeEach
    public void setUp() {
        mySalary = new Salary();
    }
    @Test
    void testforEmployeeList(){
        mySalary.setEmployeeList(4);
        assertEquals(4, mySalary.getEmployeeList());
    }
    @Test
    void testThatEmployerSetsAFixedRatePerHour(){
        mySalary.setfixedRatePerHour(1000.0);
        assertEquals(1000.0, mySalary.getfixedRatePerHour());
    }

    @Test
    void testForEmployeeWorkingHours(){
        mySalary.setEmployeeWorkingHour(75);
        assertEquals(75.40,mySalary.getEmployeeWorkinghour());
    }

    @Test
    void testForGrossPay(){
        //when
        mySalary.setEmployeeWorkingHour(75);
        assertEquals(75,mySalary.getEmployeeWorkinghour());
        //then
        mySalary.calculateGrossPay(1000.0, 75);
        assertEquals(112500.0, mySalary.getGrossPay());
    }

}
