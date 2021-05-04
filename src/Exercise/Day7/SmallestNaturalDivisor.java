package Exercise.Day7;

import java.util.Scanner;

public class SmallestNaturalDivisor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        boolean found = false;
        while (true) {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    System.out.println("Smallest natural divisor is = " + i);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Smallest natural divisor is = " + number);
            }
            break;
        }
    }
}
