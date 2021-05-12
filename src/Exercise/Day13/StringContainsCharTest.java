package Exercise.Day13;

import java.util.Scanner;

public class StringContainsCharTest {
    public static boolean charContainsTest(String string, char character) {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == character) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String string = scn.next();
        char character = 'b';
        System.out.println(charContainsTest(string, character));
    }
}
