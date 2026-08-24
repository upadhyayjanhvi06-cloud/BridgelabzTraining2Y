package StringLevel2;
import java.util.Scanner;

public class CustomTrim {

    static int[] findTrimPositions(String str) {

        int start = 0;
        int end = str.length() - 1;

        // Find first non-space character
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Find last non-space character
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    static String createSubstring(String str, int start, int end) {

        String result = "";

        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }

        return result;
    }

    static boolean compareStrings(String a, String b) {

        if (a.length() != b.length()) {
            return false;
        }

        for (int i = 0; i < a.length(); i++) {

            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string with spaces: ");
        String str = sc.nextLine();

        int[] positions = findTrimPositions(str);

        String customTrim = createSubstring(
                str,
                positions[0],
                positions[1]
        );

        String builtInTrim = str.trim();

        System.out.println("\nCustom Trim: [" + customTrim + "]");
        System.out.println("Built-in Trim: [" + builtInTrim + "]");

        System.out.println(
                "Both are same: "
                + compareStrings(customTrim, builtInTrim)
        );
    }
}