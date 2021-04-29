package Exercise.Day4;

import java.util.Scanner;

public class ThreeNumbersEqualsCount {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number1 = scn.nextInt();
        int number2 = scn.nextInt();
        int number3 = scn.nextInt();
        int temp = 0;
        if (number1 == number2 && number1 == number3) {
            temp = 3;
        } else if (number1 == number2 && number1 != number3) {
            temp = 2;
        } else if (number1 != number2 && number1 == number3) {
            temp = 2;
        } else if (number1 != number2 && number1 != number3) {
            if (number2 == number3) {
                temp = 2;
            }
        }


        System.out.println(temp);
    }
}
