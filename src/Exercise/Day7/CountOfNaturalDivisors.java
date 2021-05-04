package Exercise.Day7;

import java.util.Scanner;

public class CountOfNaturalDivisors {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
