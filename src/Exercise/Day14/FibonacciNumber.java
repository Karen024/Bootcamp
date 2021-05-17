package Exercise.Day14;

import java.util.Scanner;

public class FibonacciNumber {
    public static int fibonacciNumber(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacciNumber((n - 1)) + fibonacciNumber(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        System.out.println(fibonacciNumber(number));
    }
}
