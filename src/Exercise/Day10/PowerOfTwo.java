package Exercise.Day10;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int power = scn.nextInt();
        int number = 1;
        for (int i = 0; i < power; i++) {
            number = number * 2;
        }
        System.out.println(number);
    }
}
