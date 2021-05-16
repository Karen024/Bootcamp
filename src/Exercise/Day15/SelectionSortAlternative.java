package Exercise.Day15;

import java.util.Random;
import java.util.Scanner;

public class SelectionSortAlternative {
    public static String[] createArray(int n, Scanner scn) {
        String[] array = new String[n];
        array = fillArrayWithRandom(array, scn);
        return array;
    }

    public static String[] fillArrayWithRandom(String[] array, Scanner scn) {
        System.out.println("Initialize your array");
        for (int i = 0; i < array.length; i++) {
            array[i] = scn.next();
        }
        return array;
    }

    public static int findMinElementInArray(String[] array) {
        String min = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (min.length() >= array[i].length()) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int findMaxElementInArray(String[] array) {
        String max = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (max.length() <= array[i].length()) {
                max = array[i];
                index = i;
            }
        }
        return index;
    }

    public static String[] arraySelectionSorting(String[] array) {
        for (int i = 0; i < array.length; i++) {
            int minElementIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j].length() <= array[minElementIndex].length()) {
                    String temp = array[j];
                    array[j] = array[minElementIndex];
                    array[minElementIndex] = temp;
                }
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
        array = arraySelectionSorting(array);
        printArray(array);
        String minElement = array[findMinElementInArray(array)];
        String maxElement = array[findMaxElementInArray(array)];
        System.out.println("Array min element = " + minElement + " and max element = " + maxElement);
    }

}
