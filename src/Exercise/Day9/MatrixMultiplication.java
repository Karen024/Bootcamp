package Exercise.Day9;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numberOfRows = scn.nextInt();
        int numberOfColumns = scn.nextInt();
        int[][] matrix = new int[numberOfRows][numberOfColumns];
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                matrix[i][j] = scn.nextInt();
            }
        }
        int numberOfRows2 = scn.nextInt();
        int numberOfColumns2 = scn.nextInt();
        int[][] matrix2 = new int[numberOfRows2][numberOfColumns2];
        for (int i = 0; i < numberOfRows2; i++) {
            for (int j = 0; j < numberOfColumns2; j++) {
                matrix2[i][j] = scn.nextInt();
            }
        }
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("\n");
        }
        for (int i = 0; i < numberOfRows2; i++) {
            for (int j = 0; j < numberOfColumns2; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println("\n");
        }
        if (numberOfColumns == numberOfRows2) {
            int numberOfRows3 = numberOfRows;
            int numberOfColumns3 = numberOfColumns2;
            int[][] matrix3 = new int[numberOfRows3][numberOfColumns3];
            for (int i = 0; i < numberOfRows3; i++) {
                for (int j = 0; j < numberOfColumns3; j++) {
                    for (int k = 0; k < numberOfRows2; k++) {
                        matrix3[i][j] += matrix[i][k] * matrix2[k][j];
                    }
                }
            }
            for (int i = 0; i < numberOfRows3; i++) {
                for (int j = 0; j < numberOfColumns3; j++) {
                    System.out.print(matrix3[i][j] + " ");
                }
                System.out.println("\n");
            }
        } else {
            System.out.println("Wrong input");
        }
    }
}
