package Exercise.Day9;

import java.util.Scanner;

public class MaxRowSumForMatrix {
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
        int tempSum = 0;
        int i;
        int sum = 0;
        int winnerRow = 0;
        for (i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                tempSum = tempSum + matrix[i][j];
            }
            if (tempSum > sum) {
                sum = tempSum;
                winnerRow = i;
            }
            tempSum = 0;
        }
        System.out.println(sum + " " + winnerRow);
    }
}
