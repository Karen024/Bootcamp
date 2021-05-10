package Exercise.Day11;

import java.util.Scanner;

public class ArrayCopy {
    public static int[] copyOf(int[] array) {
        int[] arrayCopy = array;
        return arrayCopy;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int length = scn.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scn.nextInt();
        }
        System.out.println(copyOf(array));
    }
}
