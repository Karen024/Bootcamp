package Exercise.Day6;

import java.util.Scanner;

public class PowersOfTwo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int steps = 2;
        while (true) {
            if (steps <= number) {
                System.out.print(steps + " ");
                steps = steps * 2;
            } else {
                break;
            }
        }
    }
}
