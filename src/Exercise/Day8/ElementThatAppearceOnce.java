package Exercise.Day8;

import java.util.Scanner;

public class ElementThatAppearceOnce {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int arraySize = scn.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = scn.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int temp = 0;
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        if (array[0] != array[1]) {
            System.out.println(array[0] + " ");
        }
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] != array[i + 1] &&
                    array[i] != array[i - 1])
                System.out.print(array[i] + " ");
        }
        if (array[array.length - 2] != array[array.length - 1])
            System.out.print(array[array.length - 1] + " ");
    }
}
