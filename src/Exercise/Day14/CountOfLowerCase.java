package Exercise.Day14;

import java.util.Scanner;

public class CountOfLowerCase {
    public static int lowerCaseOccuranceCalculation(String string, int length, int count) {
        if (length < 0) {
            return count;
        }
        if (string.charAt(length) == 'x') {
            return lowerCaseOccuranceCalculation(string, --length, ++count);
        } else {
            return lowerCaseOccuranceCalculation(string, --length, count);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String string = scn.next();
        int count = 0;
        System.out.println(lowerCaseOccuranceCalculation(string, string.length() - 1, count));
    }
}
