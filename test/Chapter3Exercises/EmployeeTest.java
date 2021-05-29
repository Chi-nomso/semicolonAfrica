package Chapter3Exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {
    private Employee chiNomso;
    private Employee nomsoChi;
    private Employee better;

    @BeforeEach
    public void setUp() {

        chiNomso = new Employee("chiNomso", "chiChi", 500.0);
        nomsoChi = new Employee("chiNomso", "chiChi", 500.0);
        better = new Employee("chiNomso", "chiChi", 2500.0);
    }


    @Test
    public void testThatEmployeeHasFirstName() {
        chiNomso.setEmployeeFirstName("chiNomso");
        assertEquals("chiNomso", chiNomso.getEmployeeFirstName());
    }

    @Test
    public void testThatEmployeeHasLastName() {
        chiNomso.setEmployeeLastName("chiChi");
        assertEquals("chiChi", chiNomso.getEmployeeLastName());
    }

    @Test
    public void testThatEmployeeReceivesSalary() {
        chiNomso.setEmployeeSalary(500.0);
        assertEquals(500, chiNomso.getEmployeeSalary());
    }

    @Test
    public void testForNegativeSalary() {
        chiNomso.setEmployeeSalary(-500.0);
        assertEquals(-500.0, chiNomso.getEmployeeSalary());
    }

    @Test
    public void testToCreateNewEmployeeObject() {
        Employee nomsoChi = new Employee("chiNomso", "chiChi", 500.0);
        assertEquals(6000.00, nomsoChi.getEmployeeYearlySalary());
    }

    @Test
    public void testToIncreaseNomsoChiSalaryByTenPercent() {
        nomsoChi.setIncreaseSalaryByTenPercent(500.0);
        assertEquals(550.0, nomsoChi.getIncreaseSalaryByTenPercent());
    }

    @Test
    public void testToDisplayBetterYearlySalary() {
        assertEquals(30000.0,better.getEmployeeYearlySalary());
    }

    @Test
    public void testToIncreaseBetterSalaryByTenPercent() {
        better.setIncreaseSalaryByTenPercent(2500);
        assertEquals(2750.0, better.getIncreaseSalaryByTenPercent());
    }
}