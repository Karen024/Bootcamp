package Exercise.Day15;

import Exercise.Day2.RandomInteger;

import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
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

    public static int[] arrayBubbleSorting(int[] array) {
        boolean swapped;
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }
        return array;
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
        array = arrayBubbleSorting(array);
        printArray(array);
    }
}
