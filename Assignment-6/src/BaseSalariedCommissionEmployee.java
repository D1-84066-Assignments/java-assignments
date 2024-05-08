class BaseSalariedCommissionEmployee extends Employee {
    private double baseSalary;
    private double sales;
    private double commissionRate;

    public BaseSalariedCommissionEmployee(String name, int employeeId, double baseSalary, double sales, double commissionRate) {
        super(name, employeeId);
        this.baseSalary = baseSalary;
        this.sales = sales;
        this.commissionRate = commissionRate;
    }

    @Override
    public double calculatePay() {
        double commission = sales * commissionRate;
        double bonus = baseSalary * 0.10; // 10% bonus
        return baseSalary + commission + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + ", Base Salary: " + baseSalary + ", Sales: " + sales 
            + ", Commission Rate: " + commissionRate 
            + ", 10% Bonus: " + (baseSalary * 0.10);
    }
}

