package Exercise.Day7;

import java.util.Scanner;

public class NumberReversePrint {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int numberReverse = 0;
        for (int i = 0; number > 0; i++) {
            numberReverse = (numberReverse * 10) + (number % 10);
            number = number / 10;
        }
        System.out.println(numberReverse);
    }
}
