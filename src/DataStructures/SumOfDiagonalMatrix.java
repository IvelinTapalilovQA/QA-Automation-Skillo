package DataStructures;

import java.util.Scanner;

public class SumOfDiagonalMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = 4;
        int columns = 4;

        int[][] matrix = new int[rows][columns];
        int sumBeginDiagonal = 0;
        int sumBackDiagonal = 0;

        for (int i = 0; i < rows; i++) {
            System.out.println("Row number is: " + (i + 1));
            for (int j = 0; j < columns; j++) {
                System.out.println("Enter digit: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        for (int j = 0; j < rows; j++) {
            for (int k = 0; k < columns; k++) {
                if (j == k)  {
                    sumBeginDiagonal += matrix[j][k];
                if (rows - j == columns - k) {
                    sumBackDiagonal += matrix[j][k];
                    }
                }
            }
        }
    System.out.println(sumBackDiagonal);
    System.out.println(sumBeginDiagonal);
    }
}