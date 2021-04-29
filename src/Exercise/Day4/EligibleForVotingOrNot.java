package Exercise.Day4;

import java.util.Scanner;

public class EligibleForVotingOrNot {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int voterAge = scn.nextInt();
        if (voterAge >= 18) {
            System.out.println("The person is eligible for voting");
        } else {
            System.out.println("The person is not eligible for voting");
        }
    }
}
