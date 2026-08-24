package StringsLevel1;

public class Null_PointerException {

    static void generateException() {

        String text = null;

        System.out.println(text.length());
    }

    static void demonstrateException() {

        String text = null;

        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {

        // First method generates the exception.
        // Uncomment to see the exception.
        // generateException();

        // Exception handled using try-catch
        demonstrateException();
    }
}