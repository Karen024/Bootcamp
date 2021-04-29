package Exercise.Day4;

import java.util.Scanner;

public class GreatestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number1, number2, number3;
        System.out.println("Input first number");
        number1 = scn.nextInt();
        System.out.println("Input second number");
        number2 = scn.nextInt();
        System.out.println("Input third number");
        number3 = scn.nextInt();
        if (number1 > number2) {
            if (number1 > number3) {
                System.out.println("Greatest number = " + number1);
            } else {
                System.out.println("Greatest number = " + number3);
            }
        } else {
            if (number2 > number3) {
                System.out.println("Greatest number = " + number2);
            } else {
                System.out.println("Greatest number = " + number3);
            }
        }
    }
}
