package Exercise.Day14;

import java.util.Scanner;

public class PutParenthesis {
    public static String putParenthesisEvenLength(char[] array, int pointer, boolean check) {
        if (pointer >= array.length) {
            return String.valueOf(array);
        } else {
            if (!check) {
                if (pointer == (array.length / 2) - 2) {
                    array[pointer] = '(';
                    pointer = pointer + 3;
                    return putParenthesisEvenLength(array, pointer, true);
                } else {
                    array[pointer] = '(';
                    pointer = pointer + 2;
                    return putParenthesisEvenLength(array, pointer, false);
                }
            } else {
                array[pointer] = ')';
                pointer = pointer + 2;
                return putParenthesisEvenLength(array, pointer, check);
            }
        }
    }

    public static String putParenthesisOddLength(char[] array, int pointer, boolean check) {
        if (pointer >= array.length) {
            return String.valueOf(array);
        } else {
            if (!check) {
                if (pointer == (array.length / 2) - 1) {
                    array[pointer] = '(';
                    pointer = pointer + 2;
                    return putParenthesisOddLength(array, pointer, true);
                } else {
                    array[pointer] = '(';
                    pointer = pointer + 2;
                    return putParenthesisOddLength(array, pointer, false);
                }
            } else {
                array[pointer] = ')';
                pointer = pointer + 2;
                return putParenthesisOddLength(array, pointer, check);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String string = scn.next();
        char[] array;
        int pointer = 0;
        if (string.length() % 2 == 0) {
            array = new char[string.length() + string.length() - 2];
            for (int i = 0; i < array.length; i = i + 2) {
                if (pointer == (string.length() / 2) - 1) {
                    array[i] = string.charAt(pointer);
                    pointer++;
                    i--;
                } else {
                    array[i] = string.charAt(pointer);
                    pointer++;
                }
            }
            System.out.println(putParenthesisEvenLength(array, 1, false));
        } else {
            array = new char[string.length() + string.length() - 1];
            for (int i = 0; i < array.length; i = i + 2) {

                array[i] = string.charAt(pointer);
                pointer++;

            }
            System.out.println(putParenthesisOddLength(array, 1, false));
        }
    }
}
