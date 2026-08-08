import java.util.Scanner;

public class Volume_of_cylinder {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter radius:");
        double r=sc.nextDouble();
        System.out.println("Enter height:");
        double h=sc.nextDouble();
        double volume=(Math.PI*r*r*h);
        System.out.println("Volume of cylinder is:"+ volume);
    }
}
