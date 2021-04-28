package Exercise.Day2;

import java.util.Random;
import java.util.Scanner;

public class ThreeNumbersSumDifferenceProductCalculation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random rnd = new Random();


        System.out.println("Input first argument for calculation");
        int firstArgument = scn.nextInt();
        System.out.println("Input second argument for calculation");
        int secondArgument = scn.nextInt();
        System.out.println("Input third argument for calculation");
        int thirdArgument = scn.nextInt();
        System.out.println("Sum is = " + (firstArgument + secondArgument + thirdArgument)
                + " ,difference is = " + (firstArgument - secondArgument - thirdArgument)
                + " ,average is = " + ((firstArgument + secondArgument + thirdArgument) / 3));
    }
}
