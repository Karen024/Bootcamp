package Exercise.Day6;

import java.util.Scanner;

public class SmallestIntegerForPow {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int smallestNaturalSolution = 2;
        int steps = 1;
        while (true) {
            if (smallestNaturalSolution >= number) {
                System.out.println(steps);
                break;
            } else {
                smallestNaturalSolution *= 2;
                steps++;
            }
        }
    }
}
