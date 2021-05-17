package Exercise.Day14;

import java.util.Scanner;

public class MirroredString {

    public static String mirroredStringConstruction(char[] array) {
        return String.valueOf(array) + stringReverse(array, 0);
    }

    public static String stringReverse(char[] array, int index) {
        if (array[array.length / 2] == '(') {
            array[array.length / 2] = ')';
        }
        if (array[index] == '(') {
            array[index] = ')';
        }
        if (array[array.length - index - 1] == '(') {
            array[array.length - index - 1] = ')';
        }
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
        char[] array = new char[string.length()];
        for (int i = 0; i < array.length; i++) {
            array[i] = string.charAt(i);
        }
        System.out.println(mirroredStringConstruction(array));
    }
}
