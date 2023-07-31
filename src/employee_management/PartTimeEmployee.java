package employee_management;

public class PartTimeEmployee extends Employee {
    private double hoursWorked;
    private double hourlyRate;
    
    // Add getter for the class PartTimeEmployee

    public PartTimeEmployee(int employeeId, String name, double hoursWorked, double hourlyRate) {
        super(employeeId, name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double calculatePay() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public String toString() {
        return "id employee "+getEmployeeId()+"\nname:"+getName()+"\nhour of work:"+hoursWorked;
    }
}

