package Exercise.Day8;

import java.util.Scanner;

public class SwapMinMax {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int arraySize = scn.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = scn.nextInt();
        }
        int maximum = array[1];
        int minimum = array[0];
        int temp = 0;
        int maxIndex = 1;
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (maximum < minimum) {
                temp = maximum;
                maximum = minimum;
                minimum = temp;
                temp = maxIndex;
                maxIndex = minIndex;
                minIndex = temp;
            } else if (maximum <= array[i]) {
                maximum = array[i];
                maxIndex = i;
            } else if (minimum >= array[i]) {
                minimum = array[i];
                minIndex = i;
            }
        }
        temp = array[maxIndex];
        array[maxIndex] = array[minIndex];
        array[minIndex] = temp;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
