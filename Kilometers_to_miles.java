import java.util.Scanner;

public class Kilometers_to_miles {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in km:");
        double km = sc.nextDouble();
        double miles= km*0.621371;
        System.out.println("converted to miles:"+  miles);
    }
}
