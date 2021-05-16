package Exercise.Day15;

import java.util.Random;
import java.util.Scanner;

public class InsertionSortPlusBinarySearch {
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

    public static int arrayInsertionSortPlusBinarySearch(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            int currentElement = array[i];
            for (int j = i - 1; j >= 0; j--) {
                if (currentElement < array[j]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                } else {
                    break;
                }
            }
        }
        printArray(array);
        return binarySearch(array, element);
    }

    public static int binarySearch(int[] array, int element) {
        int left = 0;
        int right = array.length - 1;
        while (right >= left) {
            int mid = left + (right - left) / 2;
            if (array[mid] == element) {
                return mid;
            }
            if (array[mid] > element) {
                right = mid - 1;
            }
            if (array[mid] < element) {
                left = mid + 1;
            }
        }
        return -1;
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
        int elementForSearch = scn.nextInt();
        int index = arrayInsertionSortPlusBinarySearch(array, elementForSearch);
        System.out.println(index);
    }
}
