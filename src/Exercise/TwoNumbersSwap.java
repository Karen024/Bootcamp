package Exercise;

import java.util.Scanner;

public class TwoNumbersSwap {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input first number");
        int firstNumber = scn.nextInt();
        System.out.println("Input second number");
        int secondNumber = scn.nextInt();
        firstNumber = firstNumber + secondNumber;
        secondNumber = (secondNumber - firstNumber) * (-1);
        firstNumber = firstNumber - secondNumber;
        System.out.println("Swapped first number = " + firstNumber);
        System.out.println("Swapped second number = " + secondNumber);
    }
}
