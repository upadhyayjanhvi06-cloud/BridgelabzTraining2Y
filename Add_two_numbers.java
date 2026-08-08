import java.util.Scanner;

public class Add_two_numbers {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter another number:");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("Sum of two numbers is:" +sum);

    }
}
