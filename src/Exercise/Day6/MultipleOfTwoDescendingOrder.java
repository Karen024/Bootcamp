package Exercise.Day6;

import java.util.Scanner;

public class MultipleOfTwoDescendingOrder {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        while (number != 0) {
            if ((number % 2) == 0) {
                System.out.print(number + " ");
                number--;
            } else {
                number--;
            }
        }
    }
}
