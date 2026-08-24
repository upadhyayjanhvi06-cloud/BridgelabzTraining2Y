package Arrays_Level1;
import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is positive and even");
                } else {
                    System.out.println(num + " is positive and odd");
                }
            } else if (num < 0) {
                System.out.println(num + " is negative");
            } else {
                System.out.println(num + " is zero");
            }
        }

        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        if (first > last) {
            System.out.println("First element (" + first + ") is greater than last element (" + last + ")");
        } else if (first < last) {
            System.out.println("First element (" + first + ") is less than last element (" + last + ")");
        } else {
            System.out.println("First element (" + first + ") is equal to last element (" + last + ")");
        }
        scanner.close();
    }
}
