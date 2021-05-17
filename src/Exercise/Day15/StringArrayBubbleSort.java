package Exercise.Day15;

import java.util.Random;
import java.util.Scanner;

public class StringArrayBubbleSort {
    public static String[] createArray(int n, Scanner scn) {
        String[] array = new String[n];
        array = fillArrayWithRandom(array, scn);
        return array;
    }

    public static String[] fillArrayWithRandom(String[] array, Scanner scn) {
        Random rnd = new Random();
        System.out.println("Initialize your array");
        for (int i = 0; i < array.length; i++) {
            array[i] = scn.next();
        }
        return array;
    }

    public static String[] arrayBubbleSorting(String[] array) {
        boolean swapped;
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].length() > array[j + 1].length()) {
                    String temp = array[j];
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

    public static void printArray(String[] array) {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        String[] array = createArray(number, scn);
        array = arrayBubbleSorting(array);
        printArray(array);
    }
}
