package Exercise.Day5;

import java.util.Scanner;

public class TwoStringsEqualitySecondProblem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String firstString = scn.nextLine();
        String secondString = new String(scn.nextLine());
        if (firstString == secondString) {
            System.out.println("Equals");
        } else {
            System.out.println("Not equals");
        }
        if (firstString.equals(secondString)) {
            System.out.println("Second check Equals");
        } else {
            System.out.println("Second check not equals");
        }
    }
}
