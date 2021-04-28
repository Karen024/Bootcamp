package Exercise.Day3;

import java.util.Scanner;

public class PrintCharFromInt {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int inputData = scn.nextInt();
        char correspondingSymbol = (char) inputData;
        System.out.println(inputData + " - " + correspondingSymbol);
    }
}
