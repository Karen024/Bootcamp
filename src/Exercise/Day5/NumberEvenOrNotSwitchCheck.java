package Exercise.Day5;

import java.util.Scanner;

public class NumberEvenOrNotSwitchCheck {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        switch (number % 2) {
            case 0:
                System.out.println("Number is even");
                break;
            default:
                System.out.println("Number is odd");
        }
    }
}
