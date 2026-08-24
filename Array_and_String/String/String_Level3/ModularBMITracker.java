package String_Level3;
import java.util.Scanner;

public class ModularBMITracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] inputData = new double[10][2];

        System.out.println("Enter weight (kg) and height (cm) for 10 members:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Member " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            inputData[i][0] = scanner.nextDouble();
            System.out.print("Height (cm): ");
            inputData[i][1] = scanner.nextDouble();
        }

        String[][] bmiRecords = processBmiRecords(inputData);
        displayBmiTable(bmiRecords);

        scanner.close();
    }

    public static String[] calculateIndividualBmi(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);
        String status;

        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[]{String.format("%.2f", bmi), status};
    }

    public static String[][] processBmiRecords(double[][] inputData) {
        String[][] resultTable = new String[10][4];

        for (int i = 0; i < inputData.length; i++) {
            double weight = inputData[i][0];
            double height = inputData[i][1];

            String[] bmiAndStatus = calculateIndividualBmi(weight, height);

            resultTable[i][0] = String.valueOf(height);
            resultTable[i][1] = String.valueOf(weight);
            resultTable[i][2] = bmiAndStatus[0];
            resultTable[i][3] = bmiAndStatus[1];
        }

        return resultTable;
    }

    public static void displayBmiTable(String[][] bmiRecords) {
        System.out.println("\n-----------------------------------------------------");
        System.out.printf("%-12s %-12s %-10s %-15s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("-----------------------------------------------------");
        for (int i = 0; i < bmiRecords.length; i++) {
            System.out.printf("%-12s %-12s %-10s %-15s\n", bmiRecords[i][0], bmiRecords[i][1], bmiRecords[i][2], bmiRecords[i][3]);
        }
        System.out.println("-----------------------------------------------------");
    }
}

