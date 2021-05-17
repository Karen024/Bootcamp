package Exercise.Day14;

import java.util.Scanner;

public class StringReverse {
    public static String stringReverse(char[] array, int index) {
        if (index >= array.length / 2) {
            return String.valueOf(array);
        } else {
            char temp = array[index];
            array[index] = array[array.length - index - 1];
            array[array.length - index - 1] = temp;
            return stringReverse(array, ++index);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String string = scn.next();
        int index = 0;
        char[] array = new char[string.length()];
        for (int i = 0; i < array.length; i++) {
            array[i] = string.charAt(i);
        }
        System.out.println(stringReverse(array, 0));
    }
}
