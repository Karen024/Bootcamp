package Exercise.Day8;

import java.util.Scanner;

public class DiffrentElementsInArrayCount {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int arraySize = scn.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = scn.nextInt();
        }
        int current;
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                current = array[i];
                if (array[j] == current) {
                    array[j] = 0;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
