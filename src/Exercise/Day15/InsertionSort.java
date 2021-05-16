package Exercise.Day15;

import java.util.Random;
import java.util.Scanner;

public class InsertionSort {
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

    public static int[] arrayInsertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int currentElement = array[i];
            for (int j = i - 1; j >= 0; j--) {
                if (currentElement <= array[j]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                } else {
                    break;
                }
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
        array = arrayInsertionSort(array);
        printArray(array);
    }
}
