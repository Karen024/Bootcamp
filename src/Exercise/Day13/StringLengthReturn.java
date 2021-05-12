package Exercise.Day13;

import java.util.Scanner;

public class StringLengthReturn {
    public static int returnStringLength(String string) {
        return string.length();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String string = scn.next();
        System.out.println(returnStringLength(string));
    }
}
