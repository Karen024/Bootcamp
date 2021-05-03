package Exercise.Day6;

import java.util.Scanner;

public class SmallestNaturalDivisor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int steps = 2;
        while (true) {
            if ((number % steps) == 0) {
                System.out.println("Smallest natural divisor for this number is = " + steps);
                break;
            } else {
                steps++;
            }
        }
    }
}
