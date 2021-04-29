package Exercise.Day4;

import java.util.Scanner;

public class NonDecreasingOrderSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number1 = scn.nextInt();
        int number2 = scn.nextInt();
        int number3 = scn.nextInt();

        if (number1 <= number2) {
            if (number2 <= number3) {
                System.out.println(number1 + " " + number2 + " " + number3);
            } else {
                if (number1 < number3) {
                    System.out.println(number1 + " " + number3 + " " + number2);
                } else {
                    System.out.println(number3 + " " + number1 + " " + number2);
                }
            }
        } else if (number1 > number3) {
            if (number2 <= number3) {
                System.out.println(number2 + " " + number3 + " " + number1);
            } else {
                System.out.println(number3 + " " + number2 + " " + number1);
            }
        } else {
            System.out.println(number2 + " " + number1 + " " + number3);
        }
    }
}
