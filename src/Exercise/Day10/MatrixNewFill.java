package Exercise.Day10;

import java.util.Scanner;

public class MatrixNewFill {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number1 = scn.nextInt();
        int number2 = scn.nextInt();
        int[][] matrix = new int[number1][number2];
        int fillNumber = 0;
        int columnRowSum = 0;
        while (columnRowSum != number1 + number2 - 2) {
            for (int i = 0; i < number1; i++) {
                for (int j = 0; j < number2; j++) {
                    if (i + j == columnRowSum) {
                        matrix[i][j] = fillNumber;
                        fillNumber++;
                    }
                }
            }
            columnRowSum++;
        }
        matrix[number1 - 1][number2 - 1] = fillNumber;
        for (int i = 0; i < number1; i++) {
            for (int j = 0; j < number2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
