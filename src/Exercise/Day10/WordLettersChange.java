package Exercise.Day10;

import java.util.Scanner;

public class WordLettersChange {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String word = scn.next();
        char[] array = new char[word.length()];
        for (int i = 0; i < array.length; i++) {
            array[i] = word.charAt(i);
        }
        char firstLetter = 0;
        if (array[0] > 90) {
            firstLetter = array[0];
            firstLetter += 32;
            array[0] = firstLetter;
        } else {
            for (int i = 1; i < word.length(); i++) {
                if (array[i] < 90) {
                    firstLetter = array[i];
                    firstLetter += 32;
                    array[i] = firstLetter;
                }
            }
        }
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]);
        }
    }
}
