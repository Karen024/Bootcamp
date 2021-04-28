package Exercise.Day2;

import java.util.Random;
import java.util.Scanner;

public class TwoNumbersDevitionReminderCalculation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Input first number for reminder calculation");
        int inputNumber1 = scn.nextInt();
        System.out.println("Input second number for reminder calculation");
        int inputNumber2 = scn.nextInt();
        System.out.println("reminder is = " + (inputNumber1 % inputNumber2));
    }
}
