package String_Level3;

import java.util.Scanner;

public class FrequencyViaUniqueChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        String[][] frequencies = computeUniqueFrequencies(text);

        System.out.println("Character frequencies (using unique character mapping):");
        for (int i = 0; i < frequencies.length; i++) {
            System.out.println("'" + frequencies[i][0] + "' -> " + frequencies[i][1]);
        }

        scanner.close();
    }

    public static char[] findUniqueCharacters(String text) {
        char[] tempArray = new char[text.length()];
        int uniqueCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                tempArray[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = tempArray[i];
        }

        return uniqueChars;
    }

    public static String[][] computeUniqueFrequencies(String text) {
        int[] frequency = new int[256];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            frequency[c]++;
        }

        char[] uniqueChars = findUniqueCharacters(text);
        String[][] result2D = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            char c = uniqueChars[i];
            result2D[i][0] = String.valueOf(c);
            result2D[i][1] = String.valueOf(frequency[c]);
        }

        return result2D;
    }
}
