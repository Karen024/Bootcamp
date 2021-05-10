package Exercise.Day11;

import java.util.Scanner;

public class ArraySearch {
    public static int search(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int[] array = {1, 25, 78, 365, 24, 56};
        System.out.println(search(array, number));
    }
}
