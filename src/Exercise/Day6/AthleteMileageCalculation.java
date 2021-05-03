package Exercise.Day6;

import java.util.Scanner;

public class AthleteMileageCalculation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double number = scn.nextDouble();
        double checkNumber = scn.nextDouble();
        int steps = 1;
        while (true) {
            if (number >= checkNumber) {
                System.out.println("Days = " + steps);
                break;
            } else {
                steps++;
                number = number + (number / 10);
            }
        }
    }
}
