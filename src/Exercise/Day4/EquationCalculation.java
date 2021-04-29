package Exercise.Day4;

import java.util.Scanner;

public class EquationCalculation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double a = scn.nextDouble();
        double b = scn.nextDouble();
        double c = scn.nextDouble();
        double determinant = Math.pow(b, 2) - 4 * a * c;
        if (determinant > 0) {
            System.out.println("x1 = " + (-b + Math.sqrt(determinant) / 2 * a) + " x2 = " + (-b - Math.sqrt(determinant) / 2 * a));
        }
        else if (determinant == 0)
        {
            System.out.println("X = " + (-b/2*a));
        }
        else
        {
            System.out.println("No solution");
        }
    }
}
