package StringsLevel1;
import java.util.Scanner;

public class IllegalArgument_Exception {

    static String text;

    static void generateException() {

        System.out.println(text.substring(5, 2));
    }

    static void demonstrateException() {

        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled");
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
