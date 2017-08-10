package assignment2;

public class FinanceService {
    private final EmployeeService employeeSrevice;

    public FinanceService(EmployeeService employeeSrevice) {
        this.employeeSrevice = employeeSrevice;
    }

    double UpdateSalary(double salary) {
        employeeSrevice.setSalary(salary + 5000);
        return salary;
    }

    double calculateTDS(double salary) {
        return 0.15 * salary;
    }
}