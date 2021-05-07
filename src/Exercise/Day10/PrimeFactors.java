package Exercise.Day10;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int temp = 0;
        boolean first = true;
        while (true) {
            for (int i = 2; i <= number; i++) {
                if (number % i == 0 && first) {
                    System.out.print(i);
                    temp = i;
                    first = false;
                    break;
                } else if (number % i == 0) {
                    System.out.print(" * " + i);
                    temp = i;
                    break;
                }
            }
            number = number / temp;
            if (number == 0) {
                break;
            }
        }
    }
}
