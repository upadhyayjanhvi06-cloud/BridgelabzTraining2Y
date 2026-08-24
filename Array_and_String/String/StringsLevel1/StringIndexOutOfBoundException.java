package StringsLevel1;

import java.util.Scanner;

public class StringIndexOutOfBoundException {

    static String text;

    static void generateException() {

        System.out.println(text.charAt(text.length() + 1));
    }

    static void demonstrateException() {

        try {
            System.out.println(text.charAt(text.length() + 1));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        text = sc.next();

        // Uncomment to generate exception directly
        // generateException();

        demonstrateException();

        sc.close();
    }
}
