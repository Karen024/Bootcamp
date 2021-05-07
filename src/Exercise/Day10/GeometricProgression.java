package Exercise.Day10;

import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double firstTerm = scn.nextDouble();
        double denominator = scn.nextDouble();
        int number = scn.nextInt();
        double finalTerm = 0;
        double temp = 0;
        for (int i = 0; i < number - 1; i++) {
            if (i == 0) {
                finalTerm = firstTerm * denominator;
                temp = finalTerm;
            } else {
                finalTerm = temp * denominator;
                temp = finalTerm;
            }
        }
        String string = String.format("%.2f", finalTerm);
        System.out.println(string);
    }
}
