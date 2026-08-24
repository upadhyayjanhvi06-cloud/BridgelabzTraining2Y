package Arrays_Level2;
import java.util.Scanner;

public class BMITracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numPersons = scanner.nextInt();

        double[] weights = new double[numPersons];
        double[] heights = new double[numPersons];
        double[] bmis = new double[numPersons];
        String[] statuses = new String[numPersons];

        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Weight (in kg): ");
            weights[i] = scanner.nextDouble();
            System.out.print("Height (in meters): ");
            heights[i] = scanner.nextDouble();

            bmis[i] = weights[i] / (heights[i] * heights[i]);

            if (bmis[i] <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmis[i] <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmis[i] <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }

        System.out.println("\n--- BMI Records ---");
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Person " + (i + 1) + " -> Height: " + heights[i] + "m, Weight: " + weights[i] + "kg, BMI: " + String.format("%.1f", bmis[i]) + ", Status: " + statuses[i]);
        }

        scanner.close();
    }
}
