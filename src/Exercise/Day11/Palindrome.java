package Exercise.Day11;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(int number) {
        String string = String.valueOf(number);
        for (int i = 0; i < string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        System.out.println(isPalindrome(number));
    }
}
