package StringsLevel1;
import java.util.Scanner;

public class ConvertStringToCharArray {

    static char[] convertToCharArray(String text) {

        char[] arr = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }

        return arr;
    }

    static boolean compareArrays(char[] arr1, char[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] userArray = convertToCharArray(text);

        char[] builtInArray = text.toCharArray();

        System.out.print("User-defined array: ");
        for (char c : userArray) {
            System.out.print(c + " ");
        }

        System.out.println();

        System.out.print("Built-in array: ");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }

        System.out.println();

        System.out.println("Both arrays are same: "
                + compareArrays(userArray, builtInArray));

        sc.close();
    }
}