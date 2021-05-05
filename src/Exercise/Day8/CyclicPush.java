package Exercise.Day8;

import java.util.Scanner;

public class CyclicPush {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int arraySize = scn.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = scn.nextInt();
        }
        int position = 0;
        int temp = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
            position++;
        }
        array[position] = temp;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
