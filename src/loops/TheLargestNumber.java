package loops;

import java.util.Scanner;

public class TheLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int arraySize = scanner.nextInt();
        int[] arrayOfNumbers = new int[arraySize];
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            System.out.println("Enter number: ");
            arrayOfNumbers[i] = scanner.nextInt();
        }
        for (int arrayOfNumber : arrayOfNumbers) {
            if (arrayOfNumber > maxNumber) {
                maxNumber = arrayOfNumber;
            }
        }
    System.out.println("The largest number in the array is: " + maxNumber);
    }
}