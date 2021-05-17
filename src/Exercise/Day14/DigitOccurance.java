package Exercise.Day14;

import java.util.Scanner;

public class DigitOccurance {
    public static int digitOccuranceCalculation(int n, int digit, int count) {
        if (n <= 0) {
            return count;
        } else if (n % 10 == digit) {
            return digitOccuranceCalculation(n / 10, digit, ++count);
        } else {
            return digitOccuranceCalculation(n / 10, digit, count);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int digit = scn.nextInt();
        int count = 0;
        System.out.println(digitOccuranceCalculation(number, digit, count));
    }
}
