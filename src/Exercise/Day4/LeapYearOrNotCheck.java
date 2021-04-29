package Exercise.Day4;

import java.util.Scanner;

public class LeapYearOrNotCheck {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int year = scn.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            } else {
                System.out.println("Yes");
            }
        } else {
            System.out.println("No");
        }
    }
}
