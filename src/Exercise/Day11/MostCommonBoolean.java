package Exercise.Day11;

import java.util.Scanner;

public class MostCommonBoolean {
    public static boolean mostCommon(boolean x, boolean y, boolean z) {
        boolean answer = false;
        int trueCount = 0;
        int falseCount = 0;
        boolean[] mass = new boolean[3];
        mass[0] = x;
        mass[1] = y;
        mass[2] = z;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == true) {
                trueCount++;
            } else {
                falseCount++;
            }
        }
        if (trueCount >= falseCount) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean bool1 = scn.nextBoolean();
        boolean bool2 = scn.nextBoolean();
        boolean bool3 = scn.nextBoolean();
        System.out.println(mostCommon(bool1, bool2, bool3));
    }
}
