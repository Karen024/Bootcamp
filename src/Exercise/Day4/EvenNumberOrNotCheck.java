package Exercise.Day4;

import java.util.Scanner;

public class EvenNumberOrNotCheck {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is not even");
        }
    }
}
