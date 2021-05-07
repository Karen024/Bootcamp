package Exercise.Day10;

import java.util.Scanner;

public class MatrixSnakeFill {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number1 = scn.nextInt();
        int number2 = scn.nextInt();
        boolean rotate = false;
        int fill = 0;
        int[][] matrix = new int[number1][number2];
        for (int i = 0; i < number1; i++) {
            if (rotate) {
                for (int j = number2 - 1; j >= 0; j--) {
                    matrix[i][j] = fill;
                    fill++;
                }
                rotate = false;
            } else {
                for (int j = 0; j < number2; j++) {
                    matrix[i][j] = fill;
                    fill++;
                }
                rotate = true;
            }
        }
        for (int i = 0; i < number1; i++) {
            for (int j = 0; j < number2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
