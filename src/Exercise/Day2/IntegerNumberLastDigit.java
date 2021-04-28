package Exercise.Day2;

import java.util.Scanner;

public class IntegerNumberLastDigit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Input number for last digit calculation");
        int number = scn.nextInt();
        System.out.println("Last digit of number is = " + number % 10);
    }
}
