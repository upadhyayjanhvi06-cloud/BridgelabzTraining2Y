package Arrays_Level2;
import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        long tempNum = Math.abs(number);
        int count = 0;
        if (tempNum == 0) {
            count = 1;
        } else {
            while (tempNum > 0) {
                count++;
                tempNum /= 10;
            }
        }

        int[] digits = new int[count];
        tempNum = Math.abs(number);
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = (int) (tempNum % 10);
            tempNum /= 10;
        }

        int[] frequency = new int[10];
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequency[i] + " times");
            }
        }

        scanner.close();
    }
}
