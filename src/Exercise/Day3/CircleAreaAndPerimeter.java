package Exercise.Day3;

import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double circleRadius = scn.nextDouble();
        double circleArea = Math.PI * Math.pow(circleRadius, 2);
        double circlePerimeter = 2 * Math.PI * circleRadius;
        System.out.println("Circle area = " + circleArea + " , circle perimeter = " + circlePerimeter);
    }
}
