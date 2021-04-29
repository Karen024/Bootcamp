package Exercise.Day4;

import java.util.Scanner;

public class FloatNumberPositivnessZeroSmallLargeCheck {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double number = scn.nextDouble();
        if (number == 0) {
            System.out.println("Zero");
        } else {
            if (number < 0) {
                if (Math.abs(number) < 1) {
                    System.out.println("Number is negative and small");
                } else if (Math.abs(number) > 1000000) {
                    System.out.println("Number is negative and big");
                } else {
                    System.out.println("Number is negative");
                }
            } else {
                if (Math.abs(number) < 1) {
                    System.out.println("Number is positive and small");
                } else if (Math.abs(number) > 1000000) {
                    System.out.println("Number is positive and big");
                } else {
                    System.out.println("Number is positive");
                }
            }
        }
    }
}
