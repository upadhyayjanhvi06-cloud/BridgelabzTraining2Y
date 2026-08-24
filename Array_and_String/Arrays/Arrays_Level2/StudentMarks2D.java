package Arrays_Level2;
import java.util.Scanner;

public class StudentMarks2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        double[][] marks = new double[numStudents][3];
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1) + " (out of 100):");

            System.out.print("Physics: ");
            double physics = scanner.nextDouble();
            System.out.print("Chemistry: ");
            double chemistry = scanner.nextDouble();
            System.out.print("Maths: ");
            double maths = scanner.nextDouble();

            if (physics < 0 || chemistry < 0 || maths < 0) {
                System.out.println("Please enter positive values.");
                i--;
                continue;
            }

            marks[i][0] = physics;
            marks[i][1] = chemistry;
            marks[i][2] = maths;

            double totalObtained = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalObtained / 300.0) * 100.0;

            double p = percentages[i];
            if (p >= 80) {
                grades[i] = 'A';
            } else if (p >= 70) {
                grades[i] = 'B';
            } else if (p >= 60) {
                grades[i] = 'C';
            } else if (p >= 50) {
                grades[i] = 'D';
            } else if (p >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }

        System.out.println("\n--- Performance Record ---");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + " -> Physics: " + marks[i][0] + ", Chemistry: " + marks[i][1] + ", Maths: " + marks[i][2] + " | Percentage: " + String.format("%.2f", percentages[i]) + "% | Grade: " + grades[i]);
        }

        scanner.close();
    }
}
