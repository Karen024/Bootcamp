package Exercise.Day5;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Numbers");
        double number1 = scn.nextDouble();
        double number2 = scn.nextDouble();
        System.out.println("Enter operation");
        String operation = scn.next();
        switch (operation) {
            case "+":
                System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
                break;
            case "-":
                System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
                break;
            case "*":
                System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
                break;
            case "/":
                System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}
