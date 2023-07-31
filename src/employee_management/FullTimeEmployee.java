package employee_management;

public class FullTimeEmployee extends Employee {
    private double monthlySalary;
    
    
// Add getter for the class FullTimeEmployee


    public FullTimeEmployee(int employeeId, String name, double monthlySalary) {
        super(employeeId, name);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double calculatePay() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return "id employee "+getEmployeeId()+"\nname:"+getName();
    }
}


