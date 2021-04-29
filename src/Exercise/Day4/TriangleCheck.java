package Exercise.Day4;

import java.util.Scanner;

public class TriangleCheck {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int aSide = scn.nextInt();
        int bSide = scn.nextInt();
        int cSide = scn.nextInt();
        int sum1 = aSide + bSide;
        int sum2 = bSide + cSide;
        int sum3 = aSide + cSide;
        if (sum1 > cSide && sum2 > aSide && sum3 > bSide) {
            System.out.println("Such Triangle exists");
        } else {
            System.out.println("Such Triangle does not exists");
        }
    }
}
