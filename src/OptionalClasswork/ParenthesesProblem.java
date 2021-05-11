package OptionalClasswork;

import java.util.Scanner;

public class ParenthesesProblem {
    public static int[] parenthesesArrayConstruction(String string) {
        int[] array = new int[string.length()];
        int pointer = 0;
        for (int i = 0; i < array.length; i++) {
            if (string.charAt(i) == '(' || string.charAt(i) == ')') {
                array[pointer] = i;
                pointer++;
            }
        }
        for (int i = pointer; i <= array.length - 1; i++) {
            array[i] = -1;
        }
        return array;
    }

    public static String parenthesisInsideReverse(int pointer1, int pointer2, String string) {
        StringBuilder sub = new StringBuilder(string.substring(pointer1 + 1, pointer2));
        sub.reverse();
        string = string.substring(0, pointer1 + 1) + sub.toString() + string.substring(pointer2, string.length());
        return string;
    }

    public static String deleteParenthesis(String string, int pointer1, int pointer2) {
        string = string.substring(0, pointer1) + string.substring(pointer1 + 1, pointer2) + string.substring(pointer2 + 1, string.length());
        return string;
    }

    public static String stringParenthesisReverseSolving(String string) {
        int[] array = parenthesesArrayConstruction(string);
        int pointer1 = 0;
        int pointer2 = 0;
        if (problemsChecking(string)) {
            while (array[0] != -1) {
                for (int i = 0; array[i] != -1; i++) {
                    if (string.charAt(array[i]) == '(') {
                        pointer1 = array[i];
                    }
                    if (string.charAt(array[i]) == ')') {
                        pointer2 = array[i];
                        string = parenthesisInsideReverse(pointer1, pointer2, string);
                        string = deleteParenthesis(string, pointer1, pointer2);
                        array = parenthesesArrayConstruction(string);
                        pointer1 = 0;
                        pointer2 = 0;
                        break;
                    }
                }
            }
            return string;
        } else {
            string = "Wrong Input";
            return string;
        }
    }

    public static boolean problemsChecking(String string) {
        int parenthesisCount1 = 0;
        int parenthesisCount2 = 0;
        int charCount = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '(') {
                parenthesisCount1++;
            } else if (string.charAt(i) == ')') {
                parenthesisCount2++;
            } else {
                charCount++;
            }
        }
        if (parenthesisCount1 != parenthesisCount2) {
            return false;
        } else if (charCount == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String string = scn.next();
        System.out.println(stringParenthesisReverseSolving(string));
    }
}
