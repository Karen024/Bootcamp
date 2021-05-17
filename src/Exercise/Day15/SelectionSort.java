package Exercise.Day15;

import java.util.Random;
import java.util.Scanner;

public class SelectionSort {
    public static int arrayElementsAverage(int[] array) {
        int average = 0;
        for (int i = 0; i < array.length; i++) {
            average = average + array[i];
        }
        return average / array.length;
    }

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

    public static int findMinElementInArray(int[] array) {
        int min = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (min >= array[i]) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int findMaxElementInArray(int[] array) {
        int max = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (max <= array[i]) {
                max = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int[] arraySelectionSorting(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minElementIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] <= array[minElementIndex]) {
                    int temp = array[j];
                    array[j] = array[minElementIndex];
                    array[minElementIndex] = temp;
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
        array = arraySelectionSorting(array);
        printArray(array);
        int minElement = array[findMinElementInArray(array)];
        int maxElement = array[findMaxElementInArray(array)];
        int average = arrayElementsAverage(array);
        System.out.println("Array min element = " + minElement + " and max element = " + maxElement);
        System.out.println("Array average = " + average);
    }
}
