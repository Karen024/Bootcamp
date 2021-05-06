package Exercise.Day9;

import java.util.Scanner;

public class HighestBest {
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
        int tempBest = 0;
        int champion = 0;
        int best = 0;
        for (i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                if (matrix[i][j] > tempBest) {
                    tempBest = matrix[i][j];
                }
            }
            if (tempBest > best) {
                best = tempBest;
                champion = i;
            }
            tempBest = 0;
        }
        System.out.println(champion + " " + best);
    }
}
