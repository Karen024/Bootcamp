package Exercise.Day8;

import java.util.Scanner;

public class SortedCheck {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int arraySize = scn.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = scn.nextInt();
        }
        boolean check = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (!check) {
                break;
            } else {
                if (array[i] > array[i + 1]) {
                    check = false;
                }
            }
        }
        System.out.println(check);
    }
}
