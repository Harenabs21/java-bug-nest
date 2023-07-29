package employee_management;

public class FullTimeEmployee {
    private int employeeId;
    private String name;
    private double monthlySalary;

    public FullTimeEmployee(int employeeId, String name, double monthlySalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.monthlySalary = monthlySalary;
    }
// Add getter for the class FullTimeEmployee

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double calculatePay() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return "{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                '}';
    }
}


