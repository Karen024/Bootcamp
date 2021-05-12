package Exercise.Day13;

import java.util.Scanner;

public class StringReverse {
    public static StringBuilder stringReversion(StringBuilder string) {
        return string.reverse();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder(scn.next());
        System.out.println(stringReversion(stringBuilder));
    }
}
