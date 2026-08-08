import java.util.Scanner;

public class SimpleInterest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal :");
        double p=sc.nextDouble();

        System.out.println("Enter rate:");
        double r=sc.nextDouble();

        System.out.println("Enter time :");
        double t=sc.nextDouble();

        double  sm=(p*r*t)/100;
        System.out.println("Simple Interest is:"+sm);

    }
}
