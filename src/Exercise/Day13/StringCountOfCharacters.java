package Exercise.Day13;

import java.util.Scanner;

public class StringCountOfCharacters {
    public static int characterCountCalculation(String string, int choice) {
        int vowelCount = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'A' || string.charAt(i) == 'I' || string.charAt(i) == 'O' || string.charAt(i) == 'U' || string.charAt(i) == 'E' || string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u') {
                vowelCount++;
            }
        }
        return vowelCount;
    }

    public static int characterCountCalculation(int choice, String string) {
        int consonantCount = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'A' || string.charAt(i) == 'I' || string.charAt(i) == 'O' || string.charAt(i) == 'U' || string.charAt(i) == 'E' || string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u') {
                continue;
            } else {
                consonantCount++;
            }
        }
        return consonantCount;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String string = scn.next();
        System.out.println(characterCountCalculation(string, 1));
        System.out.println(characterCountCalculation(1, string));
    }
}
