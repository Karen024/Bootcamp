package Exercise.Day11;

import java.util.Scanner;

public class PowerOfNumber {
    public static double powerOfNumber(double a, int n) {
        double result = 1.0;
        for (int i = 0; i < n; i++) {
            result = result * a;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double number = scn.nextDouble();
        int power = scn.nextInt();
        System.out.println(powerOfNumber(number, power));

    }

}
