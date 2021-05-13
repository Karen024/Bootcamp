package Exercise.Day14;

import java.util.Scanner;

public class NumberOfDigit {
    public static int calculateNumberOfDigits(String string, int count, int pointer) {
        if (pointer >= string.length()) {
            return count;
        } else {
            if (Character.isDigit(string.charAt(pointer))) {
                count++;
            }
            return calculateNumberOfDigits(string, count, ++pointer);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String string = scn.next();
        System.out.println(calculateNumberOfDigits(string, 0, 0));
    }
}
