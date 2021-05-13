package Exercise.Day14;

import java.util.Scanner;

public class RemoveDuplicatesFromSymmetricPlaces {
    public static String removeDuplicatesFromSymmetricPlaces(String string, int index1, int index2) {
        if (index1 < 0 || index2 >= string.length()) {
            return string;
        } else {
            if (index1 == index2) {
                return removeDuplicatesFromSymmetricPlaces(string, --index1, ++index2);
            }
            if (string.charAt(index1) == string.charAt(index2)) {
                string = string.substring(0, index1) + string.substring(index1 + 1, index2) + string.substring(index2 + 1);
                if (string.length() % 2 == 0) {
                    index1 = string.length() / 2 - 1;
                    index2 = string.length() / 2;
                } else {
                    index1 = string.length() / 2;
                    index2 = string.length() / 2;
                }
                return removeDuplicatesFromSymmetricPlaces(string, --index1, ++index2);
            } else {
                return removeDuplicatesFromSymmetricPlaces(string, --index1, ++index2);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String string = scn.next();
        if (string.length() % 2 == 0) {
            System.out.println(removeDuplicatesFromSymmetricPlaces(string, string.length() / 2 - 1, string.length() / 2));
        } else {
            System.out.println(removeDuplicatesFromSymmetricPlaces(string, string.length() / 2, string.length() / 2));
        }
    }
}
