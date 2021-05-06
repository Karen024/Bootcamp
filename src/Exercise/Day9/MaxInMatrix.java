package Exercise.Day9;

import java.util.Scanner;

public class MaxInMatrix {
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
        int max = 0;
        int i;
        int j;
        int maxRow = 0;
        int maxColumn = 0;
        for (i = 0; i < numberOfRows; i++) {
            for (j = 0; j < numberOfColumns; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxRow = i;
                    maxColumn = j;
                }
            }
        }
        System.out.println(max + " " + maxRow + " " + maxColumn);
    }
}
