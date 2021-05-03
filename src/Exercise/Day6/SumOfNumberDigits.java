package Exercise.Day6;

import java.util.Scanner;

public class SumOfNumberDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int sum = 0;
        while (true) {
            if (number == 0) {
                System.out.println(sum);
                break;
            } else {
                sum = sum + number % 10;
                number = number / 10;
            }
        }
    }
}
