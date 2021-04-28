package Exercise.Day2;

import java.util.Random;
import java.util.Scanner;

public class ProductOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Input first number for production");
        int inputNumber1 = scn.nextInt();
        System.out.println("Input second number for production");
        int inputNumber2 = scn.nextInt();
        System.out.println("Product of two numbers = " + (inputNumber1 * inputNumber2));
    }
}
