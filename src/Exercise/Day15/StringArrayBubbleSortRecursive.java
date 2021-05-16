package Exercise.Day15;

import java.util.Random;
import java.util.Scanner;

public class StringArrayBubbleSortRecursive {
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

    public static String[] arrayBubbleSortingRecursive(String[] array, int length) {
        if (length == 1) {
            return array;
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].length() > array[i + 1].length()) {
                String temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        return arrayBubbleSortingRecursive(array, --length);
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
        array = arrayBubbleSortingRecursive(array, array.length);
        printArray(array);
    }
}
