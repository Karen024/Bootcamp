package Exercise.Day8;

import java.util.Scanner;

public class SmallestPositiveInArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int arraySize = scn.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = scn.nextInt();
        }
        int smallestPositiveInArray = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                continue;
            } else if (smallestPositiveInArray > array[i]) {
                smallestPositiveInArray = array[i];
            }
        }
        System.out.println(smallestPositiveInArray);
    }
}

