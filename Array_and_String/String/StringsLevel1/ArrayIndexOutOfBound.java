package StringsLevel1;

import java.util.Scanner;

public class ArrayIndexOutOfBound {

    static String[] names;

    static void generateException() {

        System.out.println(names[names.length]);
    }

    static void demonstrateException() {

        try {
            System.out.println(names[names.length]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled");

        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();

        names = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.next();
        }

        // Uncomment to generate exception directly
        // generateException();

        demonstrateException();

        sc.close();
    }
}