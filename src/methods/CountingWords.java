package methods;

import java.util.Scanner;

public class CountingWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter sentence: ");
        String sentence = scanner.nextLine().trim();

        int result = stringCounter(sentence);

        System.out.println(result);
    }
    public static int stringCounter(String sentence) {

        return sentence.split(" ").length;
    }
}

