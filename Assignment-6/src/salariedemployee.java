class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String name, int employeeId, double weeklySalary) {
        super(name, employeeId);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double calculatePay() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return super.toString() + ", Weekly Salary: " + weeklySalary;
    }
}