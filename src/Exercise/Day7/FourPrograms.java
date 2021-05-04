package Exercise.Day7;

import java.util.Scanner;

public class FourPrograms {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int count = 0;
        System.out.println("A : ");
        for (int i = 0; i <= number; i++) {
            for (int j = 0; j < number - (number - count); j++) {
                System.out.print("*");
            }
            System.out.println("\n");
            count++;
        }
        count = 0;
        System.out.println("B : ");
        for (int i = 0; i <= number; i++) {
            for (int j = 0; j < number - count; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
            count++;
        }
        count = 0;
        System.out.println("C : ");
        for (int i = 0; i <= number; i++) {
            for (int k = count; k > 0 && k != number; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j < number - count; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
            count++;
        }
        count = 0;
        System.out.println("D : ");
        for (int i = 0; i <= number; i++) {
            for (int k = number - count; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j < number - (number - count); j++) {
                System.out.print("*");
            }
            System.out.println("\n");
            count++;
        }
    }
}
