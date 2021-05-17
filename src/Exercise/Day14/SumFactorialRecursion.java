package Exercise.Day14;

import java.util.Scanner;

public class SumFactorialRecursion {
    public static int sumOfArrayCalculation(int[] array, int n) {
        if (n <= 0) {
            return 0;
        } else {
            return sumOfArrayCalculation(array, n - 1) + array[n - 1];
        }
    }

    public static int factorialCalculation(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return factorialCalculation(n - 1) * n;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int factorial = 1;
        System.out.println(factorialCalculation(5));
    }
}
