package Arrays_Level2;
import java.util.Scanner;

public class DynamicDigitAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        int maxDigit = 10;
        long[] digits = new long[maxDigit];
        int index = 0;

        if (number == 0) {
            digits[index] = 0;
            index++;
        } else {
            while (number != 0) {
                if (index == maxDigit) {
                    maxDigit += 10;
                    long[] temp = new long[maxDigit];
                    for (int i = 0; i < digits.length; i++) {
                        temp[i] = digits[i];
                    }
                    digits = temp;
                }
                digits[index] = Math.abs(number % 10);
                number = number / 10;
                index++;
            }
        }

        long largest = 0;
        long secondLargest = 0;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        scanner.close();
    }
}
