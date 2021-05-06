package Exercise.Day9;

import java.util.Scanner;

public class MatrixSpiralFill {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numberOfRows = scn.nextInt();
        int numberOfColumns = scn.nextInt();
        int[][] matrix = new int[numberOfRows][numberOfColumns];
        int s = 0;
        for (int i = 0; i < numberOfColumns; i++) {
            matrix[0][i] = s;
            s++;
        }
        for (int i = 1; i < numberOfRows; i++) {
            matrix[i][numberOfColumns - 1] = s;
            s++;
        }
        for (int i = numberOfColumns - 2; i >= 0; i--) {
            matrix[numberOfRows - 1][i] = s;
            s++;
        }
        for (int i = numberOfRows - 2; i >= 1; i--) {
            matrix[i][0] = s;
            s++;
        }
        int currentRow = 1;
        int currentColumn = 1;
        while (s < (numberOfColumns * numberOfRows)-1) {
            while (matrix[currentRow][currentColumn + 1] == 0) {
                matrix[currentRow][currentColumn] = s;
                currentColumn++;
                s++;
            }
            while (matrix[currentRow + 1][currentColumn] == 0) {
                matrix[currentRow][currentColumn] = s;
                s++;
                currentRow++;
            }
            while (matrix[currentRow][currentColumn - 1] == 0) {
                matrix[currentRow][currentColumn] = s;
                s++;
                currentColumn--;
            }
            while (matrix[currentRow - 1][currentColumn] == 0) {
                matrix[currentRow][currentColumn] = s;
                s++;
                currentRow--;
            }
        }
        matrix[currentRow][currentColumn] = s;
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
