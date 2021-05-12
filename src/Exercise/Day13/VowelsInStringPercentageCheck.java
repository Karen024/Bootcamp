package Exercise.Day13;

import java.util.Scanner;

public class VowelsInStringPercentageCheck {
    public static void vowelsInStringCalculation(String string) {
        double vowelCount = 0;
        double digitCount = 0;
        for (int i = 0; i < string.length(); i++) {
            switch (string.charAt(i)) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'a':
                case 'i':
                case 'o':
                case 'e':
                case 'u':
                    vowelCount++;
                    break;

            }
            if (Character.isDigit(string.charAt(i))) {
                digitCount++;
            }
        }
        System.out.println("vowel count is = " + (int) vowelCount + " and percentage = " + Math.round(((vowelCount * 100) / string.length()) * 100.0) / 100.0);
        System.out.println("digit count is = " + (int) digitCount + " and percentage = " + Math.round(((digitCount * 100) / string.length()) * 100.0) / 100.0);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String string = scn.next();
        vowelsInStringCalculation(string);
    }
}
