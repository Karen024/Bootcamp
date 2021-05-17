package Exercise.Day14;

import java.util.Scanner;

public class AddLetterBetweenCharacters {
    public static String addLetterBetweenCharacters(char[] array, int pointer) {
        if (pointer >= array.length - 1) {
            return String.valueOf(array);
        } else {
            array[pointer] = '*';
            pointer = pointer + 2;
            return addLetterBetweenCharacters(array, pointer);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String string = scn.next();
        char[] array = new char[string.length() + string.length() - 1];
        int pointer = 0;
        for (int i = 0; i < array.length; i = i + 2) {
            array[i] = string.charAt(pointer);
            pointer++;
        }
        System.out.println(addLetterBetweenCharacters(array, 1));
    }
}
