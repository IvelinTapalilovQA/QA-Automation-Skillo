package Methods;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int numberOne = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int numberTwo = scanner.nextInt();
        System.out.println("Enter the three number: ");
        int numberThree = scanner.nextInt();

        int result = smallestNumber(numberOne, numberTwo, numberThree);

        System.out.println(result);
    }

    public static int smallestNumber(int number1, int number2, int number3) {
        int smallestNumber = number1;

        if (smallestNumber > number2) {
            smallestNumber = number2;
        }

        if (smallestNumber > number3) {
            smallestNumber = number3;
        }
        return smallestNumber;
    }
}

