package methods;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        boolean result = isEven(number);
        System.out.println("Is number " + number + " even? - " + result);
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}