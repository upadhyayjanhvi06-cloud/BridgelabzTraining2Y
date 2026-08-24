package String_Level3;
import java.util.Scanner;

public class UniqueCharactersFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        char[] uniqueChars = findUniqueCharacters(text);

        System.out.print("Unique characters: ");
        for (int i = 0; i < uniqueChars.length; i++) {
            System.out.print(uniqueChars[i] + " ");
        }
        System.out.println();

        scanner.close();
    }

    public static int getStringLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return length;
        }
    }

    public static char[] findUniqueCharacters(String text) {
        int length = getStringLength(text);
        char[] temporaryArray = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temporaryArray[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        char[] finalUniqueArray = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            finalUniqueArray[i] = temporaryArray[i];
        }

        return finalUniqueArray;
    }
}
