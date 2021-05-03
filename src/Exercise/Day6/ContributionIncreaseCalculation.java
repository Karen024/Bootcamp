package Exercise.Day6;

import java.util.Scanner;

public class ContributionIncreaseCalculation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double number = scn.nextDouble();
        int percent = scn.nextInt();
        int total = scn.nextInt();
        int years = 0;
        while (true) {
            if (number >= total) {
                System.out.println("Number of years = " + years);
                break;
            } else {
                number = number + ((number * percent) / 100);
                years++;
            }
        }
    }
}
