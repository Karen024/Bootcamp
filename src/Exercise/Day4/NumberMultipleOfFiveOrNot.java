package Exercise.Day4;

import java.util.Scanner;

public class NumberMultipleOfFiveOrNot {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        if (number % 5 == 0) {
            System.out.println("Number is a multiple of 5");
        } else {
            System.out.println("Number is not multiple of 5");
        }
    }
}
