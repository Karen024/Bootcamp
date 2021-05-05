package Exercise.Day8;

import java.util.Scanner;

public class ArrayElementsRearenge {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int arraySize = scn.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = scn.nextInt();
        }
        if (arraySize % 2 == 0) {
            int temp;
            for (int i = 1; i < array.length; i++) {
                temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
                i++;
            }
        } else {
            int temp;
            for (int i = 1; i < array.length - 1; i++) {
                temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
                i++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
