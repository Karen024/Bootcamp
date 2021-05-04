package Exercise.Day7;

import java.util.Scanner;

public class UserPasswordValidity {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String userPassword = scn.next();
        int lowerCase = 0;
        int upperCase = 0;
        int character = 0;
        int numbers = 0;
        for (int i = 0; i < userPassword.length(); i++) {
            if (userPassword.charAt(i) > 47 && userPassword.charAt(i) < 58) {
                numbers++;
            }
            if (userPassword.charAt(i) > 96 && userPassword.charAt(i) < 123) {
                lowerCase++;
            }
            if (userPassword.charAt(i) > 64 && userPassword.charAt(i) < 91) {
                upperCase++;
            }
            if (userPassword.charAt(i) == 36 || userPassword.charAt(i) == 35 || userPassword.charAt(i) == 64) {
                character++;
            }
        }
        if (userPassword.length() < 6 || userPassword.length() > 16 || lowerCase == 0 || upperCase == 0 || character == 0 || numbers == 0) {
            System.out.println("Wrong password input, please try again");
        } else {
            System.out.println("Password accepted");
        }
    }
}
