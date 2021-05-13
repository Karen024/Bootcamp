package Exercise.Day14;

import java.util.Scanner;

public class RemoveAllLowerCaseCharacters {
    public static String lowerCaseRemovalCalculation(String string, int length) {
        if (length < 0) {
            return string;
        }
        if (string.charAt(length) == 'x') {
            string = string.substring(0, length) + string.substring(length + 1);
            return lowerCaseRemovalCalculation(string, --length);
        } else {
            return lowerCaseRemovalCalculation(string, --length);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String string = scn.next();
        int count = 0;
        System.out.println(lowerCaseRemovalCalculation(string, string.length() - 1));
    }
}
