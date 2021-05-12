package Exercise.Day13;

import java.util.Scanner;

public class NonDuplicateCharacters {

    public static int nonDuplicatesCalculation(String string) {
        int count = 0;
        char[] array = new char[string.length()];
        for (int i = 0; i < array.length; i++) {
            array[i] = string.charAt(i);
        }
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < string.length(); j++) {
                if (i == j) {
                    continue;
                } else if (string.charAt(i) == string.charAt(j)) {
                    array = cutArray(array, string.charAt(i));
                }
            }
        }
        return array.length;
    }

    public static char[] cutArray(char[] array, char character) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == character) {
                count++;
            }
        }
        char[] result = new char[array.length - count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != character) {
                result[index] = array[i];
                index++;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String string = scn.next();
        System.out.println(nonDuplicatesCalculation(string));
    }
}
