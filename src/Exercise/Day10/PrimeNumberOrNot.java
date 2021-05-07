package Exercise.Day10;

import java.util.Scanner;

public class PrimeNumberOrNot {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        boolean isPrime = false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("Not Prime");
                isPrime = true;
                break;
            }
        }
        if (isPrime != true) {
            System.out.println("Is Prime");
        }
    }
}
