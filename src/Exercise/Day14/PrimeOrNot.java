package Exercise.Day14;

import java.util.Scanner;

public class PrimeOrNot {
    public static boolean isPrime(int number, int pointer) {
        if (pointer >= Math.sqrt(number)+1) {
            return true;
        } else {
            if (number % pointer == 0) {
                return false;
            } else {
                return isPrime(number, ++pointer);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        System.out.println(isPrime(number, 2));
    }
}
