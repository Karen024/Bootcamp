package Exercise.Day8;

import java.util.Scanner;

public class LargestInArrayPrint {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int arraySize = scn.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = scn.nextInt();
        }
        int largestInArray = 0;
        int largestIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largestInArray) {
                largestInArray = array[i];
                largestIndex = i;
            }
        }
        System.out.println(largestInArray + " and index is = " + largestIndex);
    }
}
