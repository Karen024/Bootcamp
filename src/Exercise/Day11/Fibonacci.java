package Exercise.Day11;

import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int n) {
        int[] fibonacciArray = new int[n];
        fibonacciArray[0] = 0;
        fibonacciArray[1] = 1;
        if (n == 1) {
            return fibonacciArray[0];
        } else if (n == 1) {
            return fibonacciArray[1];
        } else {
            for (int i = 2; i < n; i++) {
                fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
            }
            return fibonacciArray[n - 1];
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        System.out.println(fibonacci(number));
    }
}
