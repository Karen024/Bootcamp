package Exercise.Day6;

import java.util.Scanner;

public class SquaresTillNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int steps = 1;
        double currentSquare = 1;
        while (true) {
            if ((Math.pow(steps, 2)) <= number) {
                currentSquare = Math.pow(steps, 2);
                System.out.print(currentSquare + " ");
                steps++;
            } else {
                break;
            }
        }
    }
}
