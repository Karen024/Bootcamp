package Exercise.Day10;

import java.util.Scanner;

public class PalindromeNumbersPrint {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number1 = scn.nextInt();
        int number2 = scn.nextInt();
        boolean isPalindrome = true;
        for (int i = number1; i <= number2; i++) {
            String number = String.valueOf(i);
            for (int j = 0; j < number.length() / 2; j++) {
                if (number.charAt(j) != number.charAt(number.length() - j - 1)) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome == true) {
                System.out.print(i + " ");
            }
            isPalindrome = true;
        }
    }
}
