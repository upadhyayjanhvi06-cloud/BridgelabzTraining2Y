package Arrays_Level2;
import java.util.Scanner;

public class MultiDimBMITracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int number = scanner.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");

            double weight = -1;
            while (weight <= 0) {
                System.out.print("Weight (in kg): ");
                weight = scanner.nextDouble();
                if (weight <= 0) {
                    System.out.println("Please enter positive values.");
                }
            }

            double height = -1;
            while (height <= 0) {
                System.out.print("Height (in meters): ");
                height = scanner.nextDouble();
                if (height <= 0) {
                    System.out.println("Please enter positive values.");
                }
            }

            personData[i][0] = weight;
            personData[i][1] = height;

            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\n--- BMI Records ---");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + " -> Height: " + personData[i][1] + "m, Weight: " + personData[i][0] + "kg, BMI: " + String.format("%.1f", personData[i][2]) + ", Status: " + weightStatus[i]);
        }

        scanner.close();
    }
}
