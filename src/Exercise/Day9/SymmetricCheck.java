package Exercise.Day9;

import java.util.Scanner;

public class SymmetricCheck {
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
        boolean check = true;
        for (int i = 0; i < numberOfRows; i++) {
            if (check != true) {
                break;
            }
            for (int j = 0; j < numberOfColumns; j++) {
                if (check != true) {
                    break;
                }
                if (i == j) {
                    if (matrix[i][0] != matrix[0][j]) {
                        check = false;
                    }
                }
            }
        }

        System.out.println(check);

    }
}
