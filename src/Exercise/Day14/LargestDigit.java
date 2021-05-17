package Exercise.Day14;

import java.util.Scanner;

public class LargestDigit {
    public static int findLargestDigit(int number, int digit) {
        if (number <= 0) {
            return digit;
        } else {
            if (digit <= number % 10) {
                digit = number % 10;
            }
            return findLargestDigit(number / 10, digit);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        System.out.println(findLargestDigit(number, 0));
    }
}
