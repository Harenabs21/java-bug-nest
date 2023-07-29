package employee_management;

public class PartTimeEmployee {
    private int employeeId;
    private String name;
    private double hoursWorked;
    private double hourlyRate;


    public PartTimeEmployee(int employeeId, String name, double hoursWorked, double hourlyRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    // Add getter for the class PartTimeEmployee
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
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
        return "{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", hoursWorked=" + hoursWorked+
                '}';
    }
}

