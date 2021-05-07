package Exercise.Day10;

import java.util.Scanner;

public class MatrixRotation90 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number1 = scn.nextInt();
        int number2 = scn.nextInt();
        int[][] matrix = new int[number1][number2];
        for (int i = 0; i < number1; i++) {
            for (int j = 0; j < number2; j++) {
                matrix[i][j] = scn.nextInt();
            }
        }
        if (number1 == number2) {
            int[][] matrix2 = new int[number1][number2];
            for (int j = 0; j < number2; j++) {
                for (int i = number1 - 1; i >= 0; i--) {
                    matrix2[j][number1 - i - 1] = matrix[i][j];
                }
            }
            for (int i = 0; i < number1; i++) {
                for (int j = 0; j < number2; j++) {
                    System.out.print(matrix2[i][j] + " ");
                }
                System.out.println("\n");
            }
        } else {
            int[][] matrix2 = new int[number2][number1];
            for (int j = 0; j < number2; j++) {
                for (int i = number1 - 1; i >= 0; i--) {
                    matrix2[j][number1 - i - 1] = matrix[i][j];
                }
            }
            for (int i = 0; i < number2; i++) {
                for (int j = 0; j < number1; j++) {
                    System.out.print(matrix2[i][j] + " ");
                }
                System.out.println("\n");
            }
        }
    }
}
