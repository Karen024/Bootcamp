package Exercise.Day2;

import java.util.Random;
import java.util.Scanner;

public class TriangleSquareRectngleAreaCalculation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random rnd = new Random();


        System.out.println("Calculating right-angled triangle square");
        System.out.println("Input length of first side");
        double firstSide = scn.nextDouble();
        System.out.println("Input length of second side");
        double secondSide = scn.nextDouble();

        System.out.println("Square of right-angled triangle = " + ((firstSide * secondSide) / 2));

        System.out.println("Calculating square square");
        System.out.println("Input length of square side");
        double squareSideLength = scn.nextDouble();

        System.out.println("Square of square object = " + (Math.pow(squareSideLength, 2)));

        System.out.println("Calculating rectangle square");
        System.out.println("Input short side of rectangle");
        double shortSide = scn.nextDouble();
        System.out.println("Input long side of rectangle");
        double longSide = scn.nextDouble();

        System.out.println("Square of rectangle = " + (shortSide * longSide));
    }
}
