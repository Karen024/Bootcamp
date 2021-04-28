package Exercise.Day2;

import java.util.Scanner;

public class NumberDigitSumCalculation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input 3-digit number for digits sum calculation");
        int number = scn.nextInt();
        System.out.println("Sum of digits = " + ((number / 100) + (number / 10) % 10 + number % 10));
    }
}
