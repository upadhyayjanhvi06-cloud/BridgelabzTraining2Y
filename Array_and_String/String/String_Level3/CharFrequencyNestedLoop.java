package String_Level3;
import java.util.Scanner;

public class CharFrequencyNestedLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        String[] results = findFrequency(text);

        System.out.println("Character frequencies:");
        for (int i = 0; i < results.length; i++) {
            if (results[i] != null) {
                System.out.println(results[i]);
            }
        }

        scanner.close();
    }

    public static String[] findFrequency(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                freq[i] = 1;
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[i] == chars[j]) {
                        freq[i]++;
                        chars[j] = '0';
                    }
                }
            }
        }

        int uniqueCount = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                uniqueCount++;
            }
        }

        String[] resultStrings = new String[uniqueCount];
        int index = 0;
        char[] originalChars = text.toCharArray();

        for (int i = 0; i < originalChars.length; i++) {
            if (chars[i] != '0') {
                resultStrings[index] = "'" + originalChars[i] + "' -> " + freq[i];
                index++;
            }
        }

        return resultStrings;
    }
}
