package Exercise.Day11;

import java.util.Scanner;

public class XorMethod {
    public static boolean xor(boolean a, boolean b) {
        if (a == b) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean bool1 = scn.nextBoolean();
        boolean bool2 = scn.nextBoolean();
        System.out.println(xor(bool1, bool2));
    }
}
