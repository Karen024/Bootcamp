package Exercise;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random rnd = new Random();

        /*
        1.

        int timeInMinutes = scn.nextInt();
        if (timeInMinutes < 0) {
            System.out.println("Error");
        } else if (timeInMinutes < 60) {
            System.out.println(timeInMinutes + " minutes");
        } else if (timeInMinutes == 60) {
            System.out.println("1 hour");
        } else {
            int hours = timeInMinutes / 60;
            int minutes = timeInMinutes % 60;
            System.out.println(hours + " hours and " + minutes + " minutes");
        } */

        /*
        2.

        System.out.println("Input first number for production");
        int inputNumber1 = scn.nextInt();
        System.out.println("Input second number for production");
        int inputNumber2 = scn.nextInt();
        System.out.println("Product of two numbers = " + (inputNumber1 * inputNumber2)); */

        /*
        3.

        System.out.println("Input first number for reminder calculation");
        int inputNumber1 = scn.nextInt();
        System.out.println("Input second number for reminder calculation");
        int inputNumber2 = scn.nextInt();
        System.out.println("reminder is = " + (inputNumber1 % inputNumber2)); */

        /*
        3.

        System.out.println("Input first argument for calculation");
        int firstArgument = scn.nextInt();
        System.out.println("Input second argument for calculation");
        int secondArgument = scn.nextInt();
        System.out.println("Input third argument for calculation");
        int thirdArgument = scn.nextInt();
        System.out.println("Sum is = " + (firstArgument + secondArgument + thirdArgument)
                + " ,difference is = " + (firstArgument - secondArgument - thirdArgument)
                + " ,average is = " + ((firstArgument + secondArgument + thirdArgument) / 3)); */

        /*
        5.

        System.out.println("Input 1 for square calculation of right-angled triangle\n"
                + "Input 2 for square calculation of square\n"
                + "Input 3 for square calculation of rectangle\n");
        int inputOption = scn.nextInt();
        switch (inputOption) {
            case 1:
                System.out.println("Input length of first side");
                double firstSide = scn.nextDouble();
                System.out.println("Input length of second side");
                double secondSide = scn.nextDouble();
                if (firstSide < 0 || secondSide < 0) {
                    System.out.println("error");
                    break;
                } else {
                    System.out.println("Square of right-angled triangle = " + ((firstSide * secondSide) / 2));
                    break;
                }
            case 2:
                System.out.println("Input length of square side");
                double squareSideLength = scn.nextDouble();
                if (squareSideLength < 0) {
                    System.out.println("error");
                    break;
                } else {
                    System.out.println("Square of square object = " + (Math.pow(squareSideLength, 2)));
                    break;
                }
            case 3:
                System.out.println("Input short side of rectangle");
                double shortSide = scn.nextDouble();
                System.out.println("Input long side of rectangle");
                double longSide = scn.nextDouble();
                if (shortSide < 0 || longSide < 0) {
                    System.out.println("error");
                    break;
                } else {
                    System.out.println("Square of rectangle = " + (shortSide * longSide));
                    break;
                }
        } */

        /*
        6.

        System.out.println("Input byte variable");
        byte byteVariable = scn.nextByte();
        System.out.println("Input short variable");
        short shortVariable = scn.nextShort();
        System.out.println("Input int variable");
        int intVariable = scn.nextInt();
        System.out.println("Average of variables = " + ((byteVariable + shortVariable + intVariable) / 3)
                + " ,and product is = " + (byteVariable * shortVariable * intVariable)); */

        /*
        7.

        double sequenceSum = 0;
        int n = 10;
        for (int i = 1; i <= n; i++) {
            sequenceSum = sequenceSum + (3 * Math.pow(i, 2) - 12 * i);
        }
        System.out.println("S10 = " + sequenceSum);
        for (int i = 11; i <= 15; i++) {
            sequenceSum = sequenceSum + (3 * Math.pow(i, 2) - 12 * i);
        }
        System.out.println("S15 = " + sequenceSum); */

        /*
        8.

        System.out.println("Input number for last digit calculation");
        int number = scn.nextInt();
        System.out.println("Last digit of number is = " + number % 10); */

        /*
        9.

        int randomNumber = rnd.nextInt();
        System.out.println("Integer random number = " + randomNumber); */

        /*
        10.

        int randomNumber = rnd.nextInt(15);
        System.out.println("Integer random number = " + randomNumber); */

        /*
        11.

        int randomNumber = rnd.nextInt(16) + 15;
        System.out.println("Integer random number = " + randomNumber); */

        /*
        12.

        System.out.println("Input number for odd check");
        int number = scn.nextInt();
        if (number % 2 != 0) {
            System.out.println("Number is not odd");
        } else {
            System.out.println("Number is odd");
        } */

        /*
        13.

        System.out.println("Input 3-digit number for second digit calculation");
        int number = scn.nextInt();
        if ((number / 100) == 0) {
            System.out.println("error");
        } else {
            System.out.println("Second digit of number = " + (number / 10) % 10);
        } */

        /*
        14.

        System.out.println("Input 3-digit number for digits sum calculation");
        int number = scn.nextInt();
        if ((number / 100) == 0) {
            System.out.println("error");
        } else {
            System.out.println("Sum of digits = " + ((number / 100) + (number / 10) % 10 + number % 10));
        } */

        /*
        15.

        System.out.println("Input 2-digit number for digits swap");
        int number = scn.nextInt();
        if ((number / 10) == 0) {
            System.out.println("error");
        } else {
            int firstDigit = number / 10;
            int secondDigit = number % 10;
            int finalNumber = secondDigit * 10 + firstDigit;
            System.out.println("Digit swapped number = " + finalNumber);
        } */
    }
}
