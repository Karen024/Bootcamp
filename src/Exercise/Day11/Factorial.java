package Exercise.Day11;

import java.util.Scanner;

public class Factorial {
    public static int factorialOfNumber(int number) {
        int result = 1;
        if (number == 0 || number == 1) {
            return 1;
        }
        for (int i = 2; i <= number; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        System.out.println(factorialOfNumber(number));
    }
}
