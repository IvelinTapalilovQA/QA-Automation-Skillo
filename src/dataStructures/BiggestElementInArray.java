package dataStructures;

import java.util.Scanner;

public class BiggestElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int arraySize = scanner.nextInt();
        int[] arrayOfNumbers = new int[arraySize];

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            System.out.println("Enter number: ");
            arrayOfNumbers[i] = scanner.nextInt();
        }
        int maxNumber = Integer.MIN_VALUE;
        for (int currentNumber : arrayOfNumbers) {
            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }
        }
    System.out.println("The biggest number in the array is: " + maxNumber);
    }
}
