package Exercise.Day5;

import java.util.Scanner;

public class TwoIntegersPositivnessCheck {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        System.out.println(number > 0 ? "Number is positive" : number < 0 ? "Number is negative" : "Number = 0");
    }
}
