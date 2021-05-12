package Exercise.Day13;

import java.util.Scanner;

public class StringCharIndexReturn {
    public static char charIndexReturn(String string, int index) {
        return string.charAt(index);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String string = scn.next();
        int index = string.length() / 2;
        System.out.println(charIndexReturn(string, index));
    }
}
