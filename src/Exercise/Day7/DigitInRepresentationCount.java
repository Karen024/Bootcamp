package Exercise.Day7;

import java.util.Scanner;

public class DigitInRepresentationCount {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int digit = scn.nextInt();
        int count = 0;
        for (int i = 0; number > 0; i++) {
            if (number % 10 == digit) {
                count++;
                number = number / 10;
            } else {
                number = number / 10;
            }
        }
        System.out.println(count);
    }
}
