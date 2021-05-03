package Exercise.Day6;

import java.util.Scanner;

public class DescendingOrder {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        while (number != 0) {
            System.out.print(number + " ");
            number--;
        }
    }
}
