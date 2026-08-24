package Arrays_Level1;
import java.util.Scanner;

public class DynamicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] values = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter numbers (enter 0 or negative to stop):");

        while (true) {
            if (index == 10) {
                System.out.println("Array limit of 10 reached.");
                break;
            }

            double input = scanner.nextDouble();
            if (input <= 0) {
                break;
            }

            values[index] = input;
            index++;
        }

        System.out.print("Entered numbers: ");
        for (int i = 0; i < index; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < index; i++) {
            total += values[i];
        }

        System.out.println("Total sum: " + total);
        scanner.close();
    }
}
