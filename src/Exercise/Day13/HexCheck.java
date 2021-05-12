package Exercise.Day13;

import java.util.Scanner;

public class HexCheck {
    public static boolean hexStringCheck(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) >= 65 && string.charAt(i) <= 70) {
                continue;
            } else if (string.charAt(i) >= 97 && string.charAt(i) <= 102) {
                continue;
            } else if (string.charAt(i) >= 48 && string.charAt(i) <= 57) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String hex = scn.next();
        System.out.println((hexStringCheck(hex)));
    }
}
