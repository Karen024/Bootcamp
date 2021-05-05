package Exercise.Day8;

import java.util.Scanner;

public class PrintArrayElements {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int sizeOfArray = scn.nextInt();
        int[] array = new int[sizeOfArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = scn.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
