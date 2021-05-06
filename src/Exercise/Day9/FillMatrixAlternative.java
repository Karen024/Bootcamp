package Exercise.Day9;

import java.util.Scanner;

public class FillMatrixAlternative {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numberOfRows = scn.nextInt();
        int numberOfColumns = scn.nextInt();
        int[][] matrix = new int[numberOfRows][numberOfColumns];

        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                if (i == numberOfRows-1-j) {
                    matrix[i][j] = 1;
                } else if (i < numberOfRows-1-j) {
                    matrix[i][j] = 0;
                } else if (i > numberOfRows-1-j) {
                    matrix[i][j] = 2;
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
