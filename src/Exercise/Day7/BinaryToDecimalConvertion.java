package Exercise.Day7;

import java.util.Scanner;

public class BinaryToDecimalConvertion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int binaryNumber = scn.nextInt();
        int decimalNumber = 0;
        int count = 0;
        for (int i = 0; true; i++) {
            if (binaryNumber == 0) {
                break;
            } else {
                if (binaryNumber % 10 == 1) {
                    decimalNumber = decimalNumber + (int) Math.pow(2.0, count);
                }
            }
            binaryNumber = binaryNumber / 10;
            count++;
        }
        System.out.println(decimalNumber);
    }
}

