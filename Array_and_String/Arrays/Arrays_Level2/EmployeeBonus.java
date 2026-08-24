package Arrays_Level2;
import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] employeeData = new double[10][2];
        double[][] resultsData = new double[10][2];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        System.out.println("Enter salary and years of service for 10 employees:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Employee " + (i + 1) + " Salary: ");
            double salary = scanner.nextDouble();
            System.out.print("Employee " + (i + 1) + " Years of Service: ");
            double service = scanner.nextDouble();

            if (salary < 0 || service < 0) {
                System.out.println("Invalid input. Please re-enter for this employee.");
                i--;
                continue;
            }

            employeeData[i][0] = salary;
            employeeData[i][1] = service;
        }

        for (int i = 0; i < 10; i++) {
            double salary = employeeData[i][0];
            double service = employeeData[i][1];
            double bonusPercent = (service > 5) ? 0.05 : 0.02;

            double bonus = salary * bonusPercent;
            double newSalary = salary + bonus;

            resultsData[i][0] = newSalary;
            resultsData[i][1] = bonus;

            totalOldSalary += salary;
            totalBonus += bonus;
            totalNewSalary += newSalary;
        }

        System.out.println("Total Old Salary Payout: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary Payout: " + totalNewSalary);

        scanner.close();
    }
}
