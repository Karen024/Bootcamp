package Exercise.Day10;

import java.util.Scanner;

public class MatrixRotation180 {
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

        int[][] matrix2 = new int[number1][number2];
        for (int i = number1 - 1; i >= 0; i--) {
            for (int j = number2 - 1; j >= 0; j--) {
                matrix2[number1 - i - 1][number2 - j - 1] = matrix[i][j];
            }
        }
        for (int i = 0; i < number1; i++) {
            for (int j = 0; j < number2; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
