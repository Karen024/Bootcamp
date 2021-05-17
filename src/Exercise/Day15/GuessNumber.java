package Exercise.Day15;

import java.util.Scanner;

public class GuessNumber {
    public static void gameProcess(int[] array, Scanner scn) {
        int guessesCount = 0;
        int left = 0;
        int right = array.length - 1;
        int mid;
        int answer;
        while (guessesCount < 7) {
            mid = left + (right - left) / 2;
            System.out.println("My guess is = " + array[mid]);
            guessesCount++;
            answer = scn.nextInt();
            if (answer == 1) {
                left = mid + 1;
            }
            if (answer == -1) {
                right = mid - 1;
            }
            if (answer == 0) {
                System.out.println("I won the game, goodbye and thank you for playing");
                return;
            }
        }
        System.out.println("Congratulations you won, thank you for playing and goodbye");
        return;

    }

    public static int[] fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Welcome to the game");
        System.out.println("You must keep in mind number from 1 to 100, and I will try to guess it in 7 turns");
        System.out.println("If number is greater from guess type \"1\"");
        System.out.println("If number is lower from guess type \"-1\"");
        System.out.println("If number is equal to guess type \"0\"");
        System.out.println("Input 1 to start the game");
        int input = scn.nextInt();
        if (input == 1) {
            int[] array = new int[100];
            array = fillArray(array);
            gameProcess(array, scn);
        } else {
            System.out.println("Wrong input try again");
        }

    }
}
