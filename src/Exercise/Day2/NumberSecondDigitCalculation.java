package Exercise.Day2;

import java.util.Scanner;

public class NumberSecondDigitCalculation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input 3-digit number for second digit calculation");
        int number = scn.nextInt();
        System.out.println("Second digit of number = " + (number / 10) % 10);
    }
}
