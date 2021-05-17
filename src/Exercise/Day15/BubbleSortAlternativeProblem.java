package Exercise.Day15;

import java.util.Random;
import java.util.Scanner;

public class BubbleSortAlternativeProblem {
    public static int[] returnMinMax(int[] array) {
        int[] minMax = new int[2];
        minMax[0] = array[0];
        minMax[1] = array[array.length - 1];
        return minMax;
    }

    public static int minMaxAverageElementIndex(int[] array, int[] minMax) {
        int average = (minMax[0] + minMax[1]) / 2;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == average) {
                return i;
            }
        }
        return -1;
    }

    public static int[] createArray(int n, Scanner scn) {
        int[] array = new int[n];
        array = fillArrayWithRandom(array, scn);
        return array;
    }

    public static int[] fillArrayWithRandom(int[] array, Scanner scn) {
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = scn.nextInt();
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

    public static void printMinMaxArray(int[] array) {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("Minimal element of array is = ");
                System.out.print(array[i] + " ");
            } else {
                System.out.print("Maximal element of array is = ");
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    public static void printArray(int index, int[] array) {
        System.out.println();
        if (index == -1) {
            System.out.println("Such element dose not exist");
        } else {
            System.out.println("Element exists in array and = " + array[index]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int[] array = createArray(number, scn);
        array = arrayBubbleSorting(array);
        printArray(array);
        int[] minMax = returnMinMax(array);
        printMinMaxArray(minMax);
        int index = minMaxAverageElementIndex(array, minMax);
        printArray(index, array);
    }
}
