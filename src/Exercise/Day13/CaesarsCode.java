package Exercise.Day13;

import java.util.Scanner;

public class CaesarsCode {
    public static String caesarsCodeEncryption(String string, int n) {
        if (n > 26) {
            n = n % 26;
        }
        char[] array = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            array[i] = Character.toUpperCase(string.charAt(i));
            array[i] = (char) (65 + Math.abs(n - (90 - array[i])));
        }
        String stringEncrypted = String.valueOf(array);
        return stringEncrypted;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String string = scn.next();
        System.out.println(caesarsCodeEncryption(string, 120));
    }
}
