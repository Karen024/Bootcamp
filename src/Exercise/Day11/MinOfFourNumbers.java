package Exercise.Day11;

import java.util.Scanner;

public class MinOfFourNumbers {
    public static int min(int a, int b, int c, int d) {
        int[] mass = new int[4];
        mass[0] = a;
        mass[1] = b;
        mass[2] = c;
        mass[3] = d;
        int max = 0;
        for (int i = 0; i < mass.length; i++) {
            if (max <= mass[i])
            {
                max = mass[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number1 = scn.nextInt();
        int number2 = scn.nextInt();
        int number3 = scn.nextInt();
        int number4 = scn.nextInt();
        System.out.println(min(number1, number2, number3, number4));
    }
}
