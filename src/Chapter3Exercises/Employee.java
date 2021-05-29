package Chapter3Exercises;

public class Employee {
    private String firstName;
    private String lastName;
    private Double salary;

    public Employee(String firstName, String lastName, Double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public void setEmployeeFirstName(String EmployeeFirstName) {
        firstName = EmployeeFirstName;
    }
    public String getEmployeeFirstName() {
        return firstName;
    }


    public void setEmployeeLastName(String EmployeeLastName) {
        lastName = EmployeeLastName;
    }
    public String getEmployeeLastName() {
        return lastName;
    }


    public void setEmployeeSalary(double EmployeeSalary) {
        if(salary < 0){
            System.out.println("Invalid Amount");
        }else{
        salary = EmployeeSalary;
        }
    }
    public double getEmployeeSalary() {
        return salary;
    }

    public double getEmployeeYearlySalary() {
        return salary * 12;
    }

    public void setIncreaseSalaryByTenPercent(double EmployeesPay) {
        salary = EmployeesPay;
    }
    public double getIncreaseSalaryByTenPercent() {
        double percentage = (salary * 10)/100;
        return percentage + salary;
    }
}


