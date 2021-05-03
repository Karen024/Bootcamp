package OptionalClasswork;

import java.util.Scanner;

public class FoilOnTubeProblem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double lengthOfTheFoil = scn.nextDouble();
        double radius = 2;
        double tubePerimeter = 2 * Math.PI * radius;
        while (true) {
            if (lengthOfTheFoil > 0) {
                lengthOfTheFoil = lengthOfTheFoil - tubePerimeter;
                radius = radius + 0.0025;
                tubePerimeter = 2 * Math.PI * radius;
            } else {
                break;
            }
        }
        System.out.println((int) (tubePerimeter / Math.PI));
    }
}


