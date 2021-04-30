package Exercise.Day5;

import java.util.Scanner;

public class VowelConsonantCheck {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String string = scn.next();
        switch (string) {
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println(string + " is a vowel");
                break;
            default:
                System.out.println(string + " is a consonant");
        }
    }
}
