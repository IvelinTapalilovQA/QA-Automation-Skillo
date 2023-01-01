package DataStructures;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size: ");
        int arraySize = scanner.nextInt();

        int[] arrayOfNumbers = new int[arraySize];
        int sumOfArray = 0;


        for (int j = 0; j < arrayOfNumbers.length; j++) {
            System.out.println("Enter digit: ");
            arrayOfNumbers[j] = scanner.nextInt();
        }

        for (int currentArrayNumber : arrayOfNumbers) {
            sumOfArray += currentArrayNumber;
        }

    System.out.println(sumOfArray);
    }
}
