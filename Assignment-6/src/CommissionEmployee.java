class CommissionEmployee extends Employee {
    private double sales;
    private double commissionRate;

    public CommissionEmployee(String name, int employeeId, double sales, double commissionRate) {
        super(name, employeeId);
        this.sales = sales;
        this.commissionRate = commissionRate;
    }

    @Override
    public double calculatePay() {
        return sales * commissionRate;
    }

    @Override
    public String toString() {
        return super.toString() + ", Sales: " + sales + ", Commission Rate: " + commissionRate;
    }
}

