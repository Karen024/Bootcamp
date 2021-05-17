package Exercise.Day14;

import java.util.Scanner;

public class RemoveAdjacentDuplicates {
    public static String adjacentDuplicatesRemoval(String string, int index1, int index2) {
        if (index1 >= string.length()) {
            return string;
        } else {
            if (string.charAt(index1) == string.charAt(index2)) {
                return adjacentDuplicatesRemoval(string, ++index1, index2);
            } else {
                string = string.substring(0, index2 + 1) + string.substring(index1);
                index2 = index1 - 1;
                return adjacentDuplicatesRemoval(string, ++index1, index2);

            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String string = scn.next();
        int index1 = 0;
        int index2 = 0;
        System.out.println(adjacentDuplicatesRemoval(string, index1, index2));
    }
}
