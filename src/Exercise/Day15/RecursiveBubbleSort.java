package Exercise.Day15;

import java.util.Random;
import java.util.Scanner;

public class RecursiveBubbleSort {
    public static int[] createArray(int n) {
        int[] array = new int[n];
        array = fillArrayWithRandom(array);
        return array;
    }

    public static int[] fillArrayWithRandom(int[] array) {
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(100);
        }
        return array;
    }

    public static int[] arrayBubbleSortingRecursive(int[] array, int length) {
        if (length == 1) {
            return array;
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        return arrayBubbleSortingRecursive(array, --length);
    }

    public static void printArray(int[] array) {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int[] array = createArray(number);
        array = arrayBubbleSortingRecursive(array, array.length);
        printArray(array);
    }
}
