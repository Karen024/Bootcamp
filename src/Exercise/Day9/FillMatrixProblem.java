package Exercise.Day9;

import java.util.Scanner;

public class FillMatrixProblem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numberOfRows = scn.nextInt();
        int numberOfColumns = scn.nextInt();
        int[][] matrix = new int[numberOfRows][numberOfColumns];

        for (int i = numberOfRows - 1; i >= 0; i--) {
            for (int j = 0; j < numberOfColumns; j++) {
                if ((numberOfRows - 1 - i) == j) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
