package Exercise.Day14;

import java.util.Scanner;

public class AllXToEnd {
    public static String allXMoveToEnd(char[] array, int index1, int index2) {
        if (index1 >= array.length) {
            return String.valueOf(array);
        } else {
            if (array[index1] == 'x') {
                char temp = array[index2];
                array[index2] = array[index1];
                array[index1] = temp;
                return allXMoveToEnd(array, ++index1, ++index2);
            } else {
                return allXMoveToEnd(array, ++index1, index2);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String string = scn.next();
        char[] array = new char[string.length()];
        for (int i = 0; i < array.length; i++) {
            array[i] = string.charAt(i);
        }
        System.out.println(allXMoveToEnd(array, 0, 0));
    }
}
