package StringLevel2;

import java.util.Scanner;

public class ShortestLongestWord {

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
        int wordCount = 1;

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];

        int index = 0;
        String word = "";

        for (int i = 0; i < length; i++) {

            char ch = str.charAt(i);

            if (ch == ' ') {
                words[index++] = word;
                word = "";
            } else {
                word += ch;
            }
        }

        words[index] = word;

        return words;
    }

    static String[][] createWordLengthArray(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    static String[] findShortestLongest(String[][] data) {

        String shortest = data[0][0];
        String longest = data[0][0];

        int shortestLength = Integer.parseInt(data[0][1]);
        int longestLength = Integer.parseInt(data[0][1]);

        for (int i = 1; i < data.length; i++) {

            int currentLength = Integer.parseInt(data[i][1]);

            if (currentLength < shortestLength) {
                shortest = data[i][0];
                shortestLength = currentLength;
            }

            if (currentLength > longestLength) {
                longest = data[i][0];
                longestLength = currentLength;
            }
        }

        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String str = sc.nextLine();

        String[] words = splitWords(str);

        String[][] data = createWordLengthArray(words);

        String[] result = findShortestLongest(data);

        System.out.println("Shortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);
    }
}