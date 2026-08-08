
import java.util.Scanner;

public class Celsius_to_fahrenheit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in celsius:");
        double n = sc.nextDouble();
        double fahrenheit = (n * 9 / 5) + 32;
        System.out.println("temperature in fahrenheit is:" + fahrenheit);
    }
}
