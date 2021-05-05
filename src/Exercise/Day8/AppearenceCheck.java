package Exercise.Day8;

import java.util.Scanner;

public class AppearenceCheck {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int arraySize = scn.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = scn.nextInt();
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count >= array.length / 2) {
                System.out.println(array[i]);
                break;
            }
        }
    }
}
