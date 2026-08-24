package StringLevel2;

import java.util.Scanner;

public class StringLength {

    static int findLength(String str) {
        int count = 0;

        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // End of string
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        int userLength = findLength(str);
        int builtInLength = str.length();

        System.out.println("Length using user-defined method: " + userLength);
        System.out.println("Length using length(): " + builtInLength);
    }
}