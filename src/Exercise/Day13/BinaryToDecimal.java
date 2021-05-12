package Exercise.Day13;

import java.util.Scanner;

public class BinaryToDecimal {
    public static int binaryToDecimalCalculation(String string) {
        double decimal = 0;
        string = reversion(string);
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != '1' && string.charAt(i) != '0') {
                return -1;
            }
        }
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '1') {
                decimal = decimal + Math.pow(2, i);
            }
        }
        return (int) decimal;
    }

    public static String reversion(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String string = scn.next();
        System.out.println(binaryToDecimalCalculation(string));
    }
}
