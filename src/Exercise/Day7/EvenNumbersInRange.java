package Exercise.Day7;

import java.util.Scanner;

public class EvenNumbersInRange {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int number1 = scn.nextInt();
        int number2 = scn.nextInt();

        for (int i = number1; i <= number2; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
