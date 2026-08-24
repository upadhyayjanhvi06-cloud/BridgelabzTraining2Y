package Arrays_Level2;

import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        long originalNumber = number;

        int count = 0;
        if (number == 0) {
            count = 1;
        } else {
            long tempNum = Math.abs(number);
            while (tempNum > 0) {
                count++;
                tempNum /= 10;
            }
        }

        long[] digits = new long[count];
        long tempNum = Math.abs(number);
        for (int i = 0; i < count; i++) {
            digits[i] = tempNum % 10;
            tempNum /= 10;
        }

        long[] reversedDigits = new long[count];
        for (int i = 0; i < count; i++) {
            reversedDigits[i] = digits[count - 1 - i];
        }

        System.out.print("Elements of the array in reverse order: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
