package Exercise.Day11;

import java.util.Scanner;

public class HasEight {
    public static boolean hasEight(int number) {
        String string = String.valueOf(number);
        if (string.contains("8")) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        System.out.println(hasEight(number));
    }
}
