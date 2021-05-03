package Exercise.Day6;

import java.util.Scanner;

public class FibonacciNumberOrNot {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int fibonacciFirst = 1;
        int fibonacciSecond = 1;
        int fibonacciCurrent = fibonacciFirst + fibonacciSecond;
        int steps = 3;
        while (true) {
            if (number == 2) {
                System.out.println("This number is Fibonacci number " + 4);
                break;
            } else if (fibonacciCurrent > number) {
                System.out.println("This number is not Fibonacci number");
                break;
            } else if (fibonacciCurrent == number) {
                System.out.println("This number is Fibonacci number " + steps);
                break;
            } else {
                fibonacciFirst = fibonacciSecond;
                fibonacciSecond = fibonacciCurrent;
                fibonacciCurrent = fibonacciFirst + fibonacciSecond;
                steps++;
            }
        }
    }
}
