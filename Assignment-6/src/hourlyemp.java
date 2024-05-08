class HourlyEmployee extends Employee {
    private double hourlyRate;
    private double hoursWorked;

    public HourlyEmployee(String name, int employeeId, double hourlyRate, double hoursWorked) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        if (hoursWorked > 40) {
            double overtimeHours = hoursWorked - 40;
            double overtimePay = overtimeHours * (hourlyRate * 1.5);
            double regularPay = 40 * hourlyRate;
            return regularPay + overtimePay;
        } else {
            return hourlyRate * hoursWorked;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Hourly Rate: " + hourlyRate + ", Hours Worked: " + hoursWorked;
    }
}

