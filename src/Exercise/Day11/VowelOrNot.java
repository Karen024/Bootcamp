package Exercise.Day11;

import java.util.Scanner;

public class VowelOrNot {
    public static boolean isVowel(char character) {
        if (character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U' || character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String character = scn.next();
        System.out.println(isVowel(character.charAt(0)));
    }
}
