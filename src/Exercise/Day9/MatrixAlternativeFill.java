package Exercise.Day9;

import java.util.Scanner;

public class MatrixAlternativeFill {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numberOfRows = scn.nextInt();
        int numberOfColumns = scn.nextInt();
        int[][] matrix = new int[numberOfRows][numberOfColumns];
        int rowPointer = 2;
        int columnPointer = 1;
        for (int i = 0; i < numberOfColumns; i++) {
            matrix[0][i] = 1;
        }
        for (int i = 1; i < numberOfRows; i++) {
            matrix[i][numberOfColumns - 1] = 1;
        }
        for (int i = numberOfColumns - 2; i >= 0; i--) {
            matrix[numberOfRows - 1][i] = 1;
        }
        for (int i = numberOfRows - 2; i >= 2; i--) {
            matrix[i][0] = 1;
        }
        int defaultRowSize = numberOfRows;
        int defaultColumnSize = numberOfColumns;
        int start = 0;
        while (numberOfRows > 0 && numberOfColumns > 0) {
            numberOfColumns -= 3;
            while (columnPointer < numberOfColumns) {
                matrix[rowPointer][columnPointer] = 1;
                columnPointer++;
            }
            numberOfRows -= 3;
            while (rowPointer < numberOfRows) {
                matrix[rowPointer][columnPointer] = 1;
                rowPointer++;
            }
            start = start + 2;
            while (columnPointer > start) {
                matrix[rowPointer][columnPointer] = 1;
                columnPointer--;
            }
            start = start + 1;
            while (rowPointer > start) {
                matrix[rowPointer][columnPointer] = 1;
                rowPointer--;
            }
        }

        for (int i = 0; i < defaultRowSize; i++) {
            for (int j = 0; j < defaultColumnSize; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
