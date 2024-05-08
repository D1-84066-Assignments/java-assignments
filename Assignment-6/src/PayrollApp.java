import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PayrollApp {
    public static Employee createEmployee(String employeeType, Scanner scanner) {
        System.out.print("Enter employee's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee's ID: ");
        int employeeId = Integer.parseInt(scanner.nextLine());

        switch (employeeType) {
            case "salaried":
                System.out.print("Enter weekly salary: ");
                double weeklySalary = Double.parseDouble(scanner.nextLine());
                return new SalariedEmployee(name, employeeId, weeklySalary);

            case "hourly":
                System.out.print("Enter hourly rate: ");
                double hourlyRate = Double.parseDouble(scanner.nextLine());
                System.out.print("Enter hours worked: ");
                double hoursWorked = Double.parseDouble(scanner.nextLine());
                return new HourlyEmployee(name, employeeId, hourlyRate, hoursWorked);

            case "commission":
                System.out.print("Enter sales amount: ");
                double sales = Double.parseDouble(scanner.nextLine());
                System.out.print("Enter commission rate (as decimal): ");
                double commissionRate = Double.parseDouble(scanner.nextLine());
                return new CommissionEmployee(name, employeeId, sales, commissionRate);

            case "base_salaried_commission":
                System.out.print("Enter base salary: ");
                double baseSalary = Double.parseDouble(scanner.nextLine());
                System.out.print("Enter sales amount: ");
                double salesAmount = Double.parseDouble(scanner.nextLine());
                System.out.print("Enter commission rate (as decimal): ");
                double commission_rate = Double.parseDouble(scanner.nextLine());
                return new BaseSalariedCommissionEmployee(name, employeeId, baseSalary, salesAmount, commission_rate);

            default:
                System.out.println("Invalid employee type.");
                return null;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many employees do you want to create? ");
        int numEmployees = Integer.parseInt(scanner.nextLine());

        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Creating Employee " + (i + 1));
            System.out.print("Enter employee type (salaried, hourly, commission, base_salaried_commission): ");
            String employeeType = scanner.nextLine().trim().toLowerCase();
            Employee employee = createEmployee(employeeType, scanner);
            if (employee != null) {
                employees.add(employee);
            }
        }

        // Display details and calculate total pay
        System.out.println("Employee Details:");
        for (Employee employee : employees) {
            System.out.println(employee);
            System.out.println("Calculated Pay: " + employee.calculatePay());
        }

        scanner.close();
    }
}