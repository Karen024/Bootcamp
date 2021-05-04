package Exercise.Day7;

import java.util.Scanner;

public class ExactSquaresProblem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number1 = scn.nextInt();
        int number2 = scn.nextInt();
        int reminderCount = 0;
        for (int i = number1; i <= number2; i++) {
            for (int j = 1; j < i; j++) {
                if (i == j * j) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
