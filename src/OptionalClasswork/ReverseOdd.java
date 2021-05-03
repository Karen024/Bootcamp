package OptionalClasswork;

import java.util.Scanner;

public class ReverseOdd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String string = scn.nextLine();
        String[] arrayOfStrings = string.split(" ");
        for (int i = 0; i < arrayOfStrings.length; i++) {
            if ((arrayOfStrings[i].length() % 2 == 0)) {
                continue;
            } else {
                String result = "";
                for (int j = 0; j < arrayOfStrings[i].length(); j++) {
                    result = arrayOfStrings[i].charAt(j) + result;
                }
                arrayOfStrings[i] = result;
            }
        }
        for (int i = 0; i < arrayOfStrings.length; i++) {
            System.out.print(arrayOfStrings[i] + " ");
        }
    }
}
