package Exercise.Day7;

import java.util.Scanner;

public class CreatePolindromProblem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String string = scn.next();
        boolean check;
        char prefiks;
        int i = 2;
        while (true) {
            check = true;
            for (int j = 0; j <= string.length() / 2; j++) {
                if (string.charAt(j) != string.charAt(string.length() - j - 1)) {
                    check = false;
                    break;
                }
            }
            if (check == false) {
                prefiks = string.charAt(string.length() - i);
                string = string + prefiks;
                i = i + 2;
            } else {
                break;
            }
        }
        System.out.println(string);
    }
}
