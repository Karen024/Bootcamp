package Exercise.Day13;

import java.util.Scanner;

public class ValidBinaryCheck {
    public static boolean binaryStringCheck(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != '0' && string.charAt(i) != '1') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String binary = scn.next();
        System.out.println(binaryStringCheck(binary));
    }
}
