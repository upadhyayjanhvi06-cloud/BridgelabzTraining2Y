import java.util.Scanner;

public class Average {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first num :");
        double p=sc.nextDouble();
        System.out.print("Enter second num :");
        double q=sc.nextDouble();
        System.out.print("Enter third num :");
        double r=sc.nextDouble();
        double average=(p+q+r)/3;
        System.out.println("Average is:"+average);
}
}
