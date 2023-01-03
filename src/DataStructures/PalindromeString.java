package DataStructures;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the word: ");
        String wordInput = scanner.next();

        String reversedWord = "";
        boolean isPalindrome = false;

        for (int i = 0; i < wordInput.length(); i++) {
             reversedWord += wordInput.charAt((wordInput.length() - 1) - i );
        }
        if (wordInput.equals(reversedWord)){
            isPalindrome = true;
        }
    System.out.println(isPalindrome);
    }
}
