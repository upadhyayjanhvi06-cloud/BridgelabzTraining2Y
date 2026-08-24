package StringLevel2;
import java.util.Scanner;

public class StringSplit {

    static int findLength(String str) {
        int count = 0;

        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }

        return count;
    }

    static String[] splitWords(String str) {
        int length = findLength(str);

        // Count words
        int wordCount = 1;

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];

        int wordIndex = 0;
        String word = "";

        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);

            if (ch == ' ') {
                words[wordIndex++] = word;
                word = "";
            } else {
                word += ch;
            }
        }

        words[wordIndex] = word;

        return words;
    }

    static boolean compareArrays(String[] a, String[] b) {

        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String str = sc.nextLine();

        String[] userDefined = splitWords(str);
        String[] builtIn = str.split(" ");

        System.out.println("\nUser-defined split:");

        for (String word : userDefined) {
            System.out.println(word);
        }

        System.out.println("\nBuilt-in split:");

        for (String word : builtIn) {
            System.out.println(word);
        }

        System.out.println("\nBoth results same: "
                + compareArrays(userDefined, builtIn));
    }
}