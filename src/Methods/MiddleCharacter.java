package Methods;

import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter word: ");
        String word = scanner.next();

        String result = getMiddleChar(word);

        System.out.println(result);
    }

     public static String getMiddleChar(String word){
        String result;

        if (word.length() % 2 == 0) {
            result = word.substring(word.length() / 2 - 1, word.length() / 2 + 1);
        } else {
            result = word.substring(word.length() / 2, word.length() / 2 + 1);
        }
     return result;
    }
}
