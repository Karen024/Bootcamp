package Exercise.Day9;

import java.util.Scanner;

public class MatrixAdd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numberOfRows = scn.nextInt();
        int numberOfColumns = scn.nextInt();
        int[][] matrix1 = new int[numberOfRows][numberOfColumns];
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                matrix1[i][j] = scn.nextInt();
            }
        }
        System.out.println("Input matrix 2");
        int numberOfRows2 = scn.nextInt();
        int numberOfColumns2 = scn.nextInt();
        int[][] matrix2 = new int[numberOfRows2][numberOfColumns2];
        for (int i = 0; i < numberOfRows2; i++) {
            for (int j = 0; j < numberOfColumns2; j++) {
                matrix2[i][j] = scn.nextInt();
            }
        }
        if (numberOfRows != numberOfRows2 || numberOfColumns != numberOfColumns2) {
            System.out.println("Wrong input");
        } else {
            int[][] matrix3 = new int[numberOfRows][numberOfColumns];
            for (int i = 0; i < numberOfRows; i++) {
                for (int j = 0; j < numberOfColumns; j++) {
                    matrix3[i][j] = matrix2[i][j] + matrix1[i][j];
                }
            }
            for (int i = 0; i < numberOfRows; i++) {
                for (int j = 0; j < numberOfColumns; j++) {
                    System.out.print(matrix3[i][j] + " ");
                }
                System.out.println("\n");
            }
        }
    }
}
