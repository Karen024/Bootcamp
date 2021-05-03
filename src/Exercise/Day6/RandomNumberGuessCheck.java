package Exercise.Day6;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuessCheck {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner scn = new Scanner(System.in);
        int guess;
        int randNumber = rnd.nextInt();
        while (true) {
            guess = scn.nextInt();
            if (randNumber == guess) {
                System.out.println("Yes, you guessed the number");
                break;
            } else if (randNumber > guess) {
                System.out.println("Too low, try again");
            } else {
                System.out.println("Too high, try again");
            }
        }
    }
}
