package Exercise.Day4;

import java.util.Scanner;

public class IntegersConditionCheck {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        if ((a % 7 == 0 || b % 7 == 0) && a > 0 && b > 0 && a > b) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
