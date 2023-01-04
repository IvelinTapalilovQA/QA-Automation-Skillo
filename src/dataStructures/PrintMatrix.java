package dataStructures;

import java.util.Scanner;

public class PrintMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter row: ");
        int rows = scanner.nextInt();

        System.out.println("Enter column: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            System.out.println("Row number is: " + (i + 1));
            for (int j = 0; j < columns; j++) {
                System.out.println("Enter digit: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        System.out.println();
        }
    }
}