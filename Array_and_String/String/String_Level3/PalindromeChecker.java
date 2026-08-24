package String_Level3;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        boolean res1 = checkLogic1(text);
        boolean res2 = checkLogic2(text, 0, text.length() - 1);
        boolean res3 = checkLogic3(text);

        System.out.println("Logic 1 (Loop Index Comparison): " + (res1 ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Logic 2 (Recursion): " + (res2 ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Logic 3 (Character Array Reversal): " + (res3 ? "Palindrome" : "Not a Palindrome"));

        scanner.close();
    }

    public static boolean checkLogic1(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean checkLogic2(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return checkLogic2(text, start + 1, end - 1);
    }

    public static char[] reverseStringToArray(String text) {
        int len = text.length();
        char[] reversed = new char[len];
        for (int i = 0; i < len; i++) {
            reversed[i] = text.charAt(len - 1 - i);
        }
        return reversed;
    }

    public static boolean checkLogic3(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseStringToArray(text);

        if (original.length != reversed.length) {
            return false;
        }

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }
}
