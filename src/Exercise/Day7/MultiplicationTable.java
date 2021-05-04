package Exercise.Day7;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        System.out.print("* | ");
        for (int i = 1; i <= number; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        for (int i = 1; i <= (number * 2) + 5; i++) {
            System.out.print("-");
        }
        System.out.println("\n");
        for (int i = 1; i <= number; i++) {
            System.out.print(i + "| ");
            for (int j = 1; j <= number; j++) {
                System.out.print(j * i + " ");
            }
            System.out.println("\n");
        }
    }
}
