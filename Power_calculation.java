import java.util.Scanner;

public class Power_calculation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a base num:");
        double base= sc.nextDouble();
        System.out.print("Enter a exponent  num:");
        double expo=sc.nextDouble();
        double result= Math.pow(base,expo);
        System.out.print("Result is :"+result);
    }
}
