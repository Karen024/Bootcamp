package Exercise.Day4;

import java.util.Random;

public class RandomNumberConditionsCheck {
    public static void main(String[] args) {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt();
        if (randomNumber > -1000 && randomNumber < 1000 && (randomNumber % 3 == 0 || randomNumber % 5 == 0)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
