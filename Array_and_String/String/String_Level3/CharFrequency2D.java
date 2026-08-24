package String_Level3;
import java.util.Scanner;

public class CharFrequency2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        String[][] frequencyMap = getCharacterFrequencies(text);

        System.out.println("Character frequencies:");
        for (int i = 0; i < frequencyMap.length; i++) {
            System.out.println("'" + frequencyMap[i][0] + "' -> " + frequencyMap[i][1]);
        }

        scanner.close();
    }

    public static String[][] getCharacterFrequencies(String text) {
        int[] frequency = new int[256];
        int uniqueCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (frequency[c] == 0) {
                uniqueCount++;
            }
            frequency[c]++;
        }

        String[][] resultArray = new String[uniqueCount][2];
        int index = 0;
        boolean[] visited = new boolean[256];

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!visited[c]) {
                resultArray[index][0] = String.valueOf(c);
                resultArray[index][1] = String.valueOf(frequency[c]);
                visited[c] = true;
                index++;
            }
        }

        return resultArray;
    }
}
