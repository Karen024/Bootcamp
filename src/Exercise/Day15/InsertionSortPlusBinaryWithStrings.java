package Exercise.Day15;

import java.util.Random;
import java.util.Scanner;

public class InsertionSortPlusBinaryWithStrings {
    public static char[] createArray(String n) {
        char[] array = new char[n.length()];
        array = fillArrayWithRandom(array, n);
        return array;
    }

    public static char[] fillArrayWithRandom(char[] array, String scn) {
        for (int i = 0; i < array.length; i++) {
            array[i] = scn.charAt(i);
        }
        return array;
    }

    public static int arrayInsertionSortPlusBinarySearch(char[] array, char element, String string) {
        for (int i = 0; i < array.length; i++) {
            char currentElement = array[i];
            for (int j = i - 1; j >= 0; j--) {
                if (currentElement < array[j]) {
                    char temp = array[j];
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

    public static int binarySearch(char[] array, int element) {
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

    public static void printArray(char[] array) {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String string = scn.next();
        char[] array = createArray(string);
        char elementForSearch = 'd';
        int index = arrayInsertionSortPlusBinarySearch(array, elementForSearch, string);
        System.out.println(index);
    }
}
