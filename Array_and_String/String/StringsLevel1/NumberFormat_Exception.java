package StringsLevel1;

import java.util.Scanner;

public class NumberFormat_Exception {

    static String text;

    static void generateException() {

        int number = Integer.parseInt(text);
        System.out.println("Number: " + number);
    }

    static void demonstrateException() {

        try {
            int number = Integer.parseInt(text);
            System.out.println("Number: " + number);

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled");

        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number as String: ");
        text = sc.next();

        // Uncomment to generate exception directly
        // generateException();

        demonstrateException();

        sc.close();
    }
}