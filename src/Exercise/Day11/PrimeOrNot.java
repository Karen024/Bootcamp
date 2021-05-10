package Exercise.Day11;

import java.util.Scanner;

public class PrimeOrNot {
    public static boolean isPrime(int number) {
        double numberDouble = number;
        for (int i = 2; i <= Math.sqrt(numberDouble); i++) {
            if (numberDouble % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        System.out.println(isPrime(number));
    }
}
