package Exercise.Day8;

import java.util.Scanner;

public class OnePassShuffle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int arraySize = scn.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = scn.nextInt();
        }
        int count = 0;
        int temp;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                temp = array[i];
                array[i] = array[count];
                array[count] = temp;
                count++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
